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
	 * Enter a parse tree produced by {@link FoliageParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(FoliageParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(FoliageParser.OperationContext ctx);
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
	 * Enter a parse tree produced by {@link FoliageParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(FoliageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(FoliageParser.StringContext ctx);
}