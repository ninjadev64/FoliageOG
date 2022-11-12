package com.amansprojects.foliage;

import com.amansprojects.foliage.antlr.FoliageBaseListener;
import com.amansprojects.foliage.antlr.FoliageParser;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Listener extends FoliageBaseListener {
	private final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
	public List<Method> methods = new ArrayList<Method>();
	
	public Listener() {
		super();
		cw.visit(Opcodes.V17, Opcodes.ACC_PUBLIC, "GeneratedClass", null, "java/lang/Object", null);
	}

    static class Operation {
        enum Operator {
            ADD,
            SUB,
            MUL,
            DIV
        }
		
        List<Integer> values = new ArrayList<Integer>();
        List<Operator> operators = new ArrayList<Operator>();
    }

    static class Method {
        List<Operation> operations = new ArrayList<Operation>();
        Operation op;

        Integer returnValue = null;
    }

    private Method method;

    @Override
    public void enterMethod(FoliageParser.MethodContext ctx) {
        methods.add(new Method());
        method = methods.get(methods.size() - 1);
    }

    @Override
    public void enterOperation(FoliageParser.OperationContext ctx) {
		method.operations.add(new Operation());
        method.op = method.operations.get(method.operations.size() - 1);
    }

    @Override
    public void exitInteger(FoliageParser.IntegerContext ctx) {
		if (ctx.getText().isEmpty()) return;
        method.op.values.add(Integer.parseInt(ctx.getText()));
    }

    @Override
    public void exitOperator(FoliageParser.OperatorContext ctx) {
        switch (ctx.getText()) {
            case "+" -> method.op.operators.add(Operation.Operator.ADD);
            case "-" -> method.op.operators.add(Operation.Operator.SUB);
            case "*" -> method.op.operators.add(Operation.Operator.MUL);
            case "/" -> method.op.operators.add(Operation.Operator.DIV);
        }
    }

    @Override
    public void exitReturn(FoliageParser.ReturnContext ctx) {
        method.returnValue = Integer.parseInt(ctx.value.getText());
    }

    @Override
    public void exitMethod(FoliageParser.MethodContext ctx) {
        MethodVisitor v = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, ctx.name.getText(), "()I", null, null);
        for (Operation op : method.operations) {
            v.visitIntInsn(Opcodes.BIPUSH, op.values.get(0));
            for (int i = 0; i < op.operators.size(); i++) {
                v.visitIntInsn(Opcodes.BIPUSH, op.values.get(i + 1));
                switch (op.operators.get(i)) {
                    case ADD -> v.visitInsn(Opcodes.IADD);
                    case SUB -> v.visitInsn(Opcodes.ISUB);
                    case MUL -> v.visitInsn(Opcodes.IMUL);
                    case DIV -> v.visitInsn(Opcodes.IDIV);
                }
            }
        }
        if (method.returnValue != null) {
            v.visitIntInsn(Opcodes.BIPUSH, method.returnValue);
        }
        v.visitInsn(Opcodes.IRETURN);

        v.visitMaxs(0, 0);
        v.visitEnd();
    }

	@Override
	public void exitProgram(FoliageParser.ProgramContext ctx) {
		cw.visitEnd();
		
		try (FileOutputStream stream = new FileOutputStream("target/foliage/GeneratedClass.class")) {
            stream.write(cw.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}