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
	 * Enter a parse tree produced by {@link FoliageParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(FoliageParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link FoliageParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(FoliageParser.LineContext ctx);
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