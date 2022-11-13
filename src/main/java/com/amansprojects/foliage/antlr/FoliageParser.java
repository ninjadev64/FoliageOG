// Generated from java-escape by ANTLR 4.11.1
package com.amansprojects.foliage.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FoliageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, Number=12, Text=13, DIGIT=14, WS=15;
	public static final int
		RULE_program = 0, RULE_method = 1, RULE_statement = 2, RULE_intOperation = 3, 
		RULE_floatOperation = 4, RULE_return = 5, RULE_operator = 6, RULE_integer = 7, 
		RULE_float = 8, RULE_string = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method", "statement", "intOperation", "floatOperation", "return", 
			"operator", "integer", "float", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'{'", "'}'", "';'", "'return '", "'+'", "'-'", "'*'", "'/'", 
			"'f'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Number", "Text", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FoliageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				method();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Text );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodContext extends ParserRuleContext {
		public StringContext type;
		public StringContext name;
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			((MethodContext)_localctx).type = string();
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				match(T__0);
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(31);
			((MethodContext)_localctx).name = string();
			setState(33); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(32);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(35); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(37);
			match(T__1);
			setState(39); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(38);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(43);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IntOperationContext intOperation() {
			return getRuleContext(IntOperationContext.class,0);
		}
		public FloatOperationContext floatOperation() {
			return getRuleContext(FloatOperationContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(45);
				intOperation();
				}
				break;
			case 2:
				{
				setState(46);
				floatOperation();
				}
				break;
			case 3:
				{
				setState(47);
				return_();
				}
				break;
			}
			setState(50);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntOperationContext extends ParserRuleContext {
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public IntOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterIntOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitIntOperation(this);
		}
	}

	public final IntOperationContext intOperation() throws RecognitionException {
		IntOperationContext _localctx = new IntOperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intOperation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					integer();
					setState(53);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(59);
			integer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatOperationContext extends ParserRuleContext {
		public List<FloatContext> float_() {
			return getRuleContexts(FloatContext.class);
		}
		public FloatContext float_(int i) {
			return getRuleContext(FloatContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public FloatOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterFloatOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitFloatOperation(this);
		}
	}

	public final FloatOperationContext floatOperation() throws RecognitionException {
		FloatOperationContext _localctx = new FloatOperationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_floatOperation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(61);
					float_();
					setState(62);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(68);
			float_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public Token value;
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__4);
			setState(71);
			((ReturnContext)_localctx).value = matchWildcard();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(FoliageParser.Number, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(Number);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(FoliageParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(FoliageParser.Number, i);
		}
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitFloat(this);
		}
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_float);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(78);
				match(Number);
				setState(79);
				match(T__9);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(80);
				match(Number);
				setState(81);
				match(T__10);
				setState(82);
				match(Number);
				}
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(FoliageParser.Text, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Text);
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
		"\u0004\u0001\u000fX\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0001\u0001\u0001\u0004\u0001\u001c\b\u0001"+
		"\u000b\u0001\f\u0001\u001d\u0001\u0001\u0001\u0001\u0004\u0001\"\b\u0001"+
		"\u000b\u0001\f\u0001#\u0001\u0001\u0001\u0001\u0004\u0001(\b\u0001\u000b"+
		"\u0001\f\u0001)\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00021\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u00038\b\u0003\u000b\u0003\f\u00039\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004A\b\u0004"+
		"\u000b\u0004\f\u0004B\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bT\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0002#)\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000"+
		"\u0001\u0001\u0000\u0006\tW\u0000\u0015\u0001\u0000\u0000\u0000\u0002"+
		"\u0019\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00067\u0001"+
		"\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000"+
		"\fI\u0001\u0000\u0000\u0000\u000eK\u0001\u0000\u0000\u0000\u0010S\u0001"+
		"\u0000\u0000\u0000\u0012U\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002"+
		"\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000"+
		"\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001b\u0003\u0012"+
		"\t\u0000\u001a\u001c\u0005\u0001\u0000\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f!\u0003\u0012\t\u0000 \"\u0005\u0001\u0000\u0000! \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0005\u0002\u0000\u0000"+
		"&(\u0003\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0003\u0000\u0000,\u0003\u0001\u0000\u0000\u0000"+
		"-1\u0003\u0006\u0003\u0000.1\u0003\b\u0004\u0000/1\u0003\n\u0005\u0000"+
		"0-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u00003\u0005\u0001"+
		"\u0000\u0000\u000045\u0003\u000e\u0007\u000056\u0003\f\u0006\u000068\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;<\u0003\u000e\u0007\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0003"+
		"\u0010\b\u0000>?\u0003\f\u0006\u0000?A\u0001\u0000\u0000\u0000@=\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0003\u0010\b\u0000"+
		"E\t\u0001\u0000\u0000\u0000FG\u0005\u0005\u0000\u0000GH\t\u0000\u0000"+
		"\u0000H\u000b\u0001\u0000\u0000\u0000IJ\u0007\u0000\u0000\u0000J\r\u0001"+
		"\u0000\u0000\u0000KL\u0005\f\u0000\u0000L\u000f\u0001\u0000\u0000\u0000"+
		"MT\u0005\f\u0000\u0000NO\u0005\f\u0000\u0000OT\u0005\n\u0000\u0000PQ\u0005"+
		"\f\u0000\u0000QR\u0005\u000b\u0000\u0000RT\u0005\f\u0000\u0000SM\u0001"+
		"\u0000\u0000\u0000SN\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000"+
		"T\u0011\u0001\u0000\u0000\u0000UV\u0005\r\u0000\u0000V\u0013\u0001\u0000"+
		"\u0000\u0000\b\u0017\u001d#)09BS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}