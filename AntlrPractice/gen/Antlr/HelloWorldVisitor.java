// Generated from C:/Workspaces/Antlr/AntlrPractice/src/main/resources/Antlr\HelloWorld.g4 by ANTLR 4.7.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloWorldParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloWorldVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloWorldParser#parser_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParser_rule(HelloWorldParser.Parser_ruleContext ctx);
}