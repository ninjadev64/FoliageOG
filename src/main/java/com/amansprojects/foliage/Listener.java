package com.amansprojects.foliage;

import java.util.ArrayList;
import com.amansprojects.foliage.antlr.*;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import java.io.FileOutputStream;

public class Listener extends FoliageBaseListener {
	private ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
	public ArrayList<Operation> operations = new ArrayList<Operation>();
	
	public Listener() {
		super();
		cw.visit(Opcodes.V17, Opcodes.ACC_PUBLIC, "GeneratedClass", null, "java/lang/Object", null);
	}
	
    class Operation {
        enum Operator {
            ADD,
            SUB,
            MUL,
            DIV
        }
		
        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<Operator> operators = new ArrayList<Operator>();
		MethodVisitor method;
		
		public Operation() {
			method = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, Integer.toString(operations.size()), "()V", "(I)V", null);
		}
    }

    private Operation operation;
    
    @Override
    public void enterOperation(FoliageParser.OperationContext ctx) {
		operations.add(new Operation());
        operation = operations.get(operations.size() - 1);
    }

    @Override
    public void exitInteger(FoliageParser.IntegerContext ctx) {
		if (ctx.getText().isEmpty()) return;
        operation.values.add(Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitOperator(FoliageParser.OperatorContext ctx) {
        switch (ctx.getText()) {
            case "+": operation.operators.add(Operation.Operator.ADD); break;
            case "-": operation.operators.add(Operation.Operator.SUB); break;
            case "*": operation.operators.add(Operation.Operator.MUL); break;
            case "/": operation.operators.add(Operation.Operator.DIV); break;
        }
    }

    @Override
    public void exitOperation(FoliageParser.OperationContext ctx) {
        operation.method.visitIntInsn(Opcodes.BIPUSH, this.operation.values.get(0));
        for (int i = 0; i < this.operation.operators.size(); i++) {
            operation.method.visitIntInsn(Opcodes.BIPUSH, this.operation.values.get(i + 1));
            switch (this.operation.operators.get(i)) {
                case ADD: operation.method.visitInsn(Opcodes.IADD); break;
                case SUB: operation.method.visitInsn(Opcodes.ISUB); break;
                case MUL: operation.method.visitInsn(Opcodes.IMUL); break;
                case DIV: operation.method.visitInsn(Opcodes.IDIV); break;
            }
        }
		operation.method.visitInsn(Opcodes.IRETURN);
		operation.method.visitMaxs(0, 0);
		operation.method.visitEnd();
    }

	@Override
	public void exitProgram(FoliageParser.ProgramContext ctx) {
		cw.visitEnd();
		
		try (FileOutputStream stream = new FileOutputStream("GeneratedClass.class")) {
            stream.write(cw.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}