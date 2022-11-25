// Generated from java-escape by ANTLR 4.11.1
package com.amansprojects.foliage.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FoliageParser}.
 */
public interface FoliageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FoliageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FoliageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FoliageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(FoliageParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(FoliageParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FoliageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FoliageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#intOperation}.
	 * @param ctx the parse tree
	 */
	void enterIntOperation(FoliageParser.IntOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#intOperation}.
	 * @param ctx the parse tree
	 */
	void exitIntOperation(FoliageParser.IntOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#floatOperation}.
	 * @param ctx the parse tree
	 */
	void enterFloatOperation(FoliageParser.FloatOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#floatOperation}.
	 * @param ctx the parse tree
	 */
	void exitFloatOperation(FoliageParser.FloatOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#valueDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterValueDeclaration(FoliageParser.ValueDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#valueDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitValueDeclaration(FoliageParser.ValueDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#stackDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStackDeclaration(FoliageParser.StackDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#stackDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStackDeclaration(FoliageParser.StackDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(FoliageParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(FoliageParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#externalMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterExternalMethodCall(FoliageParser.ExternalMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#externalMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitExternalMethodCall(FoliageParser.ExternalMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void enterInstantiation(FoliageParser.InstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#instantiation}.
	 * @param ctx the parse tree
	 */
	void exitInstantiation(FoliageParser.InstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(FoliageParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(FoliageParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(FoliageParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(FoliageParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(FoliageParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(FoliageParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(FoliageParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(FoliageParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FoliageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FoliageParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(FoliageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(FoliageParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FoliageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FoliageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#pushesToStack}.
	 * @param ctx the parse tree
	 */
	void enterPushesToStack(FoliageParser.PushesToStackContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#pushesToStack}.
	 * @param ctx the parse tree
	 */
	void exitPushesToStack(FoliageParser.PushesToStackContext ctx);
	/**
	 * Enter a parse tree produced by {@link FoliageParser#argumentSet}.
	 * @param ctx the parse tree
	 */
	void enterArgumentSet(FoliageParser.ArgumentSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#argumentSet}.
	 * @param ctx the parse tree
	 */
	void exitArgumentSet(FoliageParser.ArgumentSetContext ctx);
}