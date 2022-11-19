package com.amansprojects.foliage;

import com.amansprojects.foliage.antlr.FoliageBaseListener;
import com.amansprojects.foliage.antlr.FoliageParser;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ClassListener extends FoliageBaseListener {
	private final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
	public List<Method> methods = new ArrayList<Method>();
	
	public ClassListener() {
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

        List<Operator> operators = new ArrayList<Operator>();
    }

    static class IntOperation extends Operation {
        List<Integer> values = new ArrayList<Integer>();
    }

    static class FloatOperation extends Operation {
        List<Float> values = new ArrayList<Float>();
    }

    static class Method {
        List<Operation> operations = new ArrayList<Operation>();
        Operation op;

        String returnValue = "";
    }

    private Method method;

    @Override
    public void enterMethod(FoliageParser.MethodContext ctx) {
        methods.add(new Method());
        method = methods.get(methods.size() - 1);
    }

    @Override
    public void enterIntOperation(FoliageParser.IntOperationContext ctx) {
		method.operations.add(new IntOperation());
        method.op = method.operations.get(method.operations.size() - 1);
    }

    @Override
    public void exitInteger(FoliageParser.IntegerContext ctx) {
		if (ctx.getText().isEmpty()) return;
        if (method.op instanceof IntOperation op) {
            op.values.add(Integer.parseInt(ctx.getText()));
        }
    }

    @Override
    public void enterFloatOperation(FoliageParser.FloatOperationContext ctx) {
        method.operations.add(new FloatOperation());
        method.op = method.operations.get(method.operations.size() - 1);
    }

    @Override
    public void exitFloat(FoliageParser.FloatContext ctx) {
        if (ctx.getText().isEmpty()) return;
        if (method.op instanceof FloatOperation op) {
            op.values.add(Float.parseFloat(ctx.getText()));
        }
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
        method.returnValue = ctx.value.getText();
    }

    @Override
    public void exitMethod(FoliageParser.MethodContext ctx) {
        String descriptor = "()%RETURN";
        switch (ctx.type.getText()) {
            case "void" -> descriptor = descriptor.replaceFirst("%RETURN", "V");
            case "int" -> descriptor = descriptor.replaceFirst("%RETURN", "I");
            case "float" -> descriptor = descriptor.replaceFirst("%RETURN", "F");
        }
        MethodVisitor v = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, ctx.name.getText(), descriptor, null, null);
        for (Operation o : method.operations) {
            if (o instanceof IntOperation op) {
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
            } else if (o instanceof FloatOperation op) {
                v.visitLdcInsn(op.values.get(0));
                for (int i = 0; i < op.operators.size(); i++) {
                    v.visitLdcInsn(op.values.get(i + 1));
                    switch (op.operators.get(i)) {
                        case ADD -> v.visitInsn(Opcodes.FADD);
                        case SUB -> v.visitInsn(Opcodes.FSUB);
                        case MUL -> v.visitInsn(Opcodes.FMUL);
                        case DIV -> v.visitInsn(Opcodes.FDIV);
                    }
                }
            }
        }
        if (method.returnValue.isEmpty()) {
            switch (ctx.type.getText()) {
                case "void" -> v.visitInsn(Opcodes.RETURN);
                case "int" -> v.visitInsn(Opcodes.IRETURN);
                case "float" -> v.visitInsn(Opcodes.FRETURN);
            }
        } else {
            switch (ctx.type.getText()) {
                case "void" -> v.visitInsn(Opcodes.RETURN);
                case "int" -> {
                    v.visitIntInsn(Opcodes.BIPUSH, Integer.parseInt(method.returnValue));
                    v.visitInsn(Opcodes.IRETURN);
                }
                case "float" -> {
                    v.visitLdcInsn(Float.parseFloat(method.returnValue));
                    v.visitInsn(Opcodes.FRETURN);
                }
            }
        }

        v.visitMaxs(0, 0);
        v.visitEnd();
    }

	@Override
	public void exitProgram(FoliageParser.ProgramContext ctx) {
		cw.visitEnd();
		
		try (FileOutputStream stream = new FileOutputStream("target/classes/GeneratedClass.class")) {
            stream.write(cw.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}