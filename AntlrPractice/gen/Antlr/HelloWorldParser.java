// Generated from C:/Workspaces/Antlr/AntlrPractice/src/main/resources/Antlr\HelloWorld.g4 by ANTLR 4.7.2
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloWorldParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, HELLO=2, WHITESPACES=3;
	public static final int
		RULE_parser_rule = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"parser_rule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'Hello'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "HELLO", "WHITESPACES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HelloWorld.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloWorldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Parser_ruleContext extends ParserRuleContext {
		public TerminalNode HELLO() { return getToken(HelloWorldParser.HELLO, 0); }
		public TerminalNode ID() { return getToken(HelloWorldParser.ID, 0); }
		public List<TerminalNode> WHITESPACES() { return getTokens(HelloWorldParser.WHITESPACES); }
		public TerminalNode WHITESPACES(int i) {
			return getToken(HelloWorldParser.WHITESPACES, i);
		}
		public Parser_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parser_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWorldListener ) ((HelloWorldListener)listener).enterParser_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloWorldListener ) ((HelloWorldListener)listener).exitParser_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloWorldVisitor ) return ((HelloWorldVisitor<? extends T>)visitor).visitParser_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parser_ruleContext parser_rule() throws RecognitionException {
		Parser_ruleContext _localctx = new Parser_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parser_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2);
			match(HELLO);
			setState(4); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3);
				match(WHITESPACES);
				}
				}
				setState(6); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHITESPACES );
			setState(8);
			match(ID);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\r\4\2\t\2\3\2\3"+
		"\2\6\2\7\n\2\r\2\16\2\b\3\2\3\2\3\2\2\2\3\2\2\2\2\f\2\4\3\2\2\2\4\6\7"+
		"\4\2\2\5\7\7\5\2\2\6\5\3\2\2\2\7\b\3\2\2\2\b\6\3\2\2\2\b\t\3\2\2\2\t\n"+
		"\3\2\2\2\n\13\7\3\2\2\13\3\3\2\2\2\3\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}