package com.amansprojects.foliage;

import com.amansprojects.foliage.antlr.FoliageBaseListener;
import com.amansprojects.foliage.antlr.FoliageParser;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class ClassListener extends FoliageBaseListener {
	private final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
    public final String className = "GeneratedClass";
	public HashMap<String, Method> methods = new HashMap<>();
	
	public ClassListener() {
		super();
        Logger.trace("Parsing class " + className);
		cw.visit(Opcodes.V17, Opcodes.ACC_PUBLIC, className, null, "java/lang/Object", null);
	}

    private static int stringToType(String type) {
        int t = Type.VOID;
        switch (type) {
            case "int" -> t = Type.INT;
            case "float" -> t = Type.FLOAT;
        }
        return t;
    }

    interface Statement {
        void invoke(MethodVisitor v);
    }

    enum Operator {
        ADD, SUB, MUL, DIV
    }

    interface Operation<T> {
        void value(T value);
        void var(String name);
        void operator(Operator operator);
    }

    class IntOperation implements Statement, Operation<Integer> {
        private List<Integer> values = new ArrayList<>();
        private List<Operator> operators = new ArrayList<>();
        private LinkedList<String> vars = new LinkedList<>();

        public void value(Integer i) {
            values.add(i);
        }
        public void var(String n) {
            vars.add(n);
        }
        public void operator(Operator o) {
            operators.add(o);
        }

        public void invoke(MethodVisitor v) {
            if (values.get(0) == null) v.visitVarInsn(Opcodes.ILOAD, method.vars.indexOf(vars.removeFirst()));
            else v.visitLdcInsn(values.get(0));
            for (int i = 0; i < operators.size(); i++) {
                if (values.get(i + 1) == null) v.visitVarInsn(Opcodes.ILOAD, method.vars.indexOf(vars.removeFirst()));
                else v.visitLdcInsn(values.get(i + 1));
                switch (operators.get(i)) {
                    case ADD -> v.visitInsn(Opcodes.IADD);
                    case SUB -> v.visitInsn(Opcodes.ISUB);
                    case MUL -> v.visitInsn(Opcodes.IMUL);
                    case DIV -> v.visitInsn(Opcodes.IDIV);
                }
            }
        }
    }

    class FloatOperation implements Statement, Operation<Float> {
        private List<Float> values = new ArrayList<>();
        private List<Operator> operators = new ArrayList<>();
        private LinkedList<String> vars = new LinkedList<>();

        public void value(Float f) {
            values.add(f);
        }
        public void var(String n) {
            vars.add(n);
        }
        public void operator(Operator o) {
            operators.add(o);
        }

        public void invoke(MethodVisitor v) {
            if (values.get(0) == null) v.visitVarInsn(Opcodes.FLOAD, method.vars.indexOf(vars.removeFirst()));
            else v.visitLdcInsn(values.get(0));
            for (int i = 0; i < operators.size(); i++) {
                if (values.get(i + 1) == null) v.visitVarInsn(Opcodes.FLOAD, method.vars.indexOf(vars.removeFirst()));
                else v.visitLdcInsn(values.get(i + 1));
                switch (operators.get(i)) {
                    case ADD -> v.visitInsn(Opcodes.FADD);
                    case SUB -> v.visitInsn(Opcodes.FSUB);
                    case MUL -> v.visitInsn(Opcodes.FMUL);
                    case DIV -> v.visitInsn(Opcodes.FDIV);
                }
            }
        }
    }

    class Declaration implements Statement {
        final String name;
        final int type;
        final String value;

        public Declaration(String name, int type, String value) {
            this.name = name;
            this.type = type;
            this.value = value;
        }

        public void invoke(MethodVisitor v) {
            Logger.trace("Compiling local variable declaration " + name);
            switch (type) {
                case Type.INT -> {
                    v.visitLdcInsn(Integer.parseInt(value));
                    v.visitVarInsn(Opcodes.ISTORE, method.vars.size());
                }
                case Type.FLOAT -> {
                    v.visitLdcInsn(Float.parseFloat(value));
                    v.visitVarInsn(Opcodes.FSTORE, method.vars.size());
                }
            }
            method.vars.add(name);
            method.varTypes.put(name, type);
        }
    }

    class MethodCall implements Statement {
        public final String klass;
        public final String name;

        public MethodCall(String klass, String name) {
            this.klass = klass;
            this.name = name;
        }

        public static String getSignature(java.lang.reflect.Method m) {
            String sig;
        
            StringBuilder sb = new StringBuilder("(");
            for (Class<?> c : m.getParameterTypes()) 
                sb.append((sig=java.lang.reflect.Array.newInstance(c, 0).toString())
                    .substring(1, sig.indexOf('@')));
            return sb.append(')')
                .append(
                    m.getReturnType()==void.class?"V":
                    (sig=java.lang.reflect.Array.newInstance(m.getReturnType(), 0).toString()).substring(1, sig.indexOf('@'))
                )
                .toString().replace('.', '/');
        }

        public void invoke(MethodVisitor v) {
            Logger.trace("Compiling method call of " + klass == null ? className : klass + "." + name);
            String clazz = klass;
            String signature = "()V";
            if (klass == null) {
                clazz = className;
                signature = methods.get(name).signature;
            } else {
                try {
                    Class<?> klazz = Class.forName(klass);
                    signature = getSignature(klazz.getMethod(name));
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    Logger.error("Failed to get signature of Java method: " + ExceptionUtils.getStackTrace(e));
                }
            }
            v.visitMethodInsn(Opcodes.INVOKESTATIC, clazz, name, signature, false);
        }
    }

    static class Method {
        List<Statement> statements = new ArrayList<>();
        Statement st;

        String returnValue = "";
        int returnType;
        String signature;

        List<String> vars = new ArrayList<>();
        HashMap<String, Integer> varTypes = new HashMap<>();
    }

    private Method method;

    @Override
    public void enterMethod(FoliageParser.MethodContext ctx) {
        method = new Method();
    }

    @Override
    public void enterIntOperation(FoliageParser.IntOperationContext ctx) {
		method.statements.add(new IntOperation());
        method.st = method.statements.get(method.statements.size() - 1);
    }

    @Override
    public void exitInteger(FoliageParser.IntegerContext ctx) {
		if (ctx.getText().isEmpty()) return;
        if (method.st instanceof IntOperation op) {
            op.values.add(Integer.parseInt(ctx.getText()));
        }
    }

    @Override
    public void enterFloatOperation(FoliageParser.FloatOperationContext ctx) {
        method.statements.add(new FloatOperation());
        method.st = method.statements.get(method.statements.size() - 1);
    }

    @Override
    public void exitFloat(FoliageParser.FloatContext ctx) {
        if (ctx.getText().isEmpty()) return;
        if (method.st instanceof FloatOperation op) {
            op.values.add(Float.parseFloat(ctx.getText()));
        }
    }

    @Override
    public void exitVariable(FoliageParser.VariableContext ctx) {
        if (method.st instanceof Operation<?> op) {
            op.value(null);
            op.var(ctx.getText());
        }
    }

    @Override
    public void exitOperator(FoliageParser.OperatorContext ctx) {
        if (method.st instanceof Operation<?> op) {
            switch (ctx.getText()) {
                case "+" -> op.operator(Operator.ADD);
                case "-" -> op.operator(Operator.SUB);
                case "*" -> op.operator(Operator.MUL);
                case "/" -> op.operator(Operator.DIV);
            }
        }
    }

    @Override
    public void exitDeclaration(FoliageParser.DeclarationContext ctx) {
        Logger.trace("Parsing local variable declaration of " + ctx.name.getText());
        method.statements.add(new Declaration(ctx.name.getText(), stringToType(ctx.type.getText()), ctx.val.getText()));
    }

    @Override
    public void exitMethodCall(FoliageParser.MethodCallContext ctx) {
        Logger.trace("Parsing method call of " + ctx.name.getText());
        method.statements.add(new MethodCall(null, ctx.name.getText()));
    }

    @Override
    public void exitExternalMethodCall(FoliageParser.ExternalMethodCallContext ctx) {
        Logger.trace("Parsing external method call of " + ctx.klass.getText() + "." + ctx.name.getText());
        method.statements.add(new MethodCall(ctx.klass.getText(), ctx.name.getText()));
    }

    @Override
    public void exitReturn(FoliageParser.ReturnContext ctx) {
        Logger.trace("Parsing return statement with value " + ctx.val.getText());
        method.returnValue = ctx.val.getText();
    }

    @Override
    public void exitMethod(FoliageParser.MethodContext ctx) {
        Logger.trace("Compiling method " + ctx.name.getText());
        method.returnType = stringToType(ctx.type.getText());
        StringBuilder sb = new StringBuilder("()");
        switch (method.returnType) {
            case Type.VOID -> sb.append("V");
            case Type.INT -> sb.append("I");
            case Type.FLOAT -> sb.append("F");
        }
        method.signature = sb.toString();
        MethodVisitor v = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, ctx.name.getText(), method.signature, null, null);
        for (Statement st : method.statements) {
            st.invoke(v);
        }
        if (method.returnValue.isEmpty()) {
            switch (method.returnType) {
                case Type.VOID -> v.visitInsn(Opcodes.RETURN);
                case Type.INT -> v.visitInsn(Opcodes.IRETURN);
                case Type.FLOAT -> v.visitInsn(Opcodes.FRETURN);
            }
        } else {
            switch (method.returnType) {
                case Type.VOID -> v.visitInsn(Opcodes.RETURN);
                case Type.INT -> {
                    v.visitLdcInsn(Integer.parseInt(method.returnValue));
                    v.visitInsn(Opcodes.IRETURN);
                }
                case Type.FLOAT -> {
                    v.visitLdcInsn(Float.parseFloat(method.returnValue));
                    v.visitInsn(Opcodes.FRETURN);
                }
            }
        }

        v.visitMaxs(0, 0);
        v.visitEnd();

        methods.put(ctx.name.getText(), method);
    }

	@Override
	public void exitProgram(FoliageParser.ProgramContext ctx) {
		cw.visitEnd();
		
		try (FileOutputStream stream = new FileOutputStream("target/classes/" + className + ".class")) {
            stream.write(cw.toByteArray());
        } catch (Exception e) {
            Logger.error("Failed to write class to file: " + ExceptionUtils.getStackTrace(e));
        }
	}
}