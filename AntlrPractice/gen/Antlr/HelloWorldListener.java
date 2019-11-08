// Generated from C:/Workspaces/Antlr/AntlrPractice/src/main/resources/Antlr\HelloWorld.g4 by ANTLR 4.7.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloWorldParser}.
 */
public interface HelloWorldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloWorldParser#parser_rule}.
	 * @param ctx the parse tree
	 */
	void enterParser_rule(HelloWorldParser.Parser_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloWorldParser#parser_rule}.
	 * @param ctx the parse tree
	 */
	void exitParser_rule(HelloWorldParser.Parser_ruleContext ctx);
}