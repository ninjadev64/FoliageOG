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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, Number=15, Text=16, DIGIT=17, 
		WS=18;
	public static final int
		RULE_program = 0, RULE_method = 1, RULE_statement = 2, RULE_intOperation = 3, 
		RULE_floatOperation = 4, RULE_declaration = 5, RULE_methodCall = 6, RULE_return = 7, 
		RULE_operator = 8, RULE_integer = 9, RULE_float = 10, RULE_variable = 11, 
		RULE_string = 12, RULE_value = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method", "statement", "intOperation", "floatOperation", "declaration", 
			"methodCall", "return", "operator", "integer", "float", "variable", "string", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'{'", "'}'", "';'", "'='", "'()'", "'return '", "'+'", 
			"'-'", "'*'", "'/'", "'f'", "'.'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Number", "Text", "DIGIT", "WS"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				method();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 524286L) != 0 );
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
		public Token type;
		public Token name;
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(33);
					((MethodContext)_localctx).type = matchWildcard();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(40); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(39);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(44);
					((MethodContext)_localctx).name = matchWildcard();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(51); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(50);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(55);
			match(T__1);
			setState(57); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(56);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(61);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(63);
				intOperation();
				}
				break;
			case 2:
				{
				setState(64);
				floatOperation();
				}
				break;
			case 3:
				{
				setState(65);
				declaration();
				}
				break;
			case 4:
				{
				setState(66);
				methodCall();
				}
				break;
			case 5:
				{
				setState(67);
				return_();
				}
				break;
			}
			setState(70);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
			setState(78); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Number:
						{
						setState(72);
						integer();
						}
						break;
					case Text:
						{
						setState(73);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(76);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(80); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(82);
				integer();
				}
				break;
			case Text:
				{
				setState(83);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class FloatOperationContext extends ParserRuleContext {
		public List<FloatContext> float_() {
			return getRuleContexts(FloatContext.class);
		}
		public FloatContext float_(int i) {
			return getRuleContext(FloatContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
			setState(92); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(88);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Number:
						{
						setState(86);
						float_();
						}
						break;
					case Text:
						{
						setState(87);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(94); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(96);
				float_();
				}
				break;
			case Text:
				{
				setState(97);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DeclarationContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public ValueContext val;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(100);
					((DeclarationContext)_localctx).type = matchWildcard();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(107); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(106);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(111);
					((DeclarationContext)_localctx).name = matchWildcard();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(118); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(117);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(120); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(122);
			match(T__4);
			setState(124); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(123);
					match(T__0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(128);
			((DeclarationContext)_localctx).val = value();
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
	public static class MethodCallContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Text() { return getToken(FoliageParser.Text, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((MethodCallContext)_localctx).name = match(Text);
			setState(131);
			match(T__5);
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
		public ValueContext val;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__6);
			setState(134);
			((ReturnContext)_localctx).val = value();
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
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0) ) {
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
		enterRule(_localctx, 18, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 20, RULE_float);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(141);
				match(Number);
				setState(142);
				match(T__11);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(143);
				match(Number);
				setState(144);
				match(T__12);
				setState(145);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(FoliageParser.Text, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		enterRule(_localctx, 24, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__13);
			setState(151);
			match(Text);
			setState(152);
			match(T__13);
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
	public static class ValueContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				float_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				string();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012\u00a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000"+
		"\u000b\u0000\f\u0000\u001f\u0001\u0001\u0005\u0001#\b\u0001\n\u0001\f"+
		"\u0001&\t\u0001\u0001\u0001\u0004\u0001)\b\u0001\u000b\u0001\f\u0001*"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001"+
		"\u0004\u00014\b\u0001\u000b\u0001\f\u00015\u0001\u0001\u0001\u0001\u0004"+
		"\u0001:\b\u0001\u000b\u0001\f\u0001;\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002E\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003K\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0004\u0003O\b\u0003\u000b\u0003\f\u0003P\u0001"+
		"\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004Y\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004]\b\u0004\u000b\u0004"+
		"\f\u0004^\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0005\u0005"+
		"\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0001\u0005\u0004\u0005l\b\u0005"+
		"\u000b\u0005\f\u0005m\u0001\u0005\u0005\u0005q\b\u0005\n\u0005\f\u0005"+
		"t\t\u0005\u0001\u0005\u0004\u0005w\b\u0005\u000b\u0005\f\u0005x\u0001"+
		"\u0005\u0001\u0005\u0004\u0005}\b\u0005\u000b\u0005\f\u0005~\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u0093\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u009e\b\r\u0001\r\b"+
		"$/5;grx~\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u0000\u0001\u0001\u0000\b\u000b\u00aa\u0000\u001d\u0001"+
		"\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004D\u0001\u0000\u0000"+
		"\u0000\u0006N\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000\ng\u0001"+
		"\u0000\u0000\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e\u0085\u0001\u0000"+
		"\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000"+
		"\u0000\u0000\u0014\u0092\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000"+
		"\u0000\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u009d\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000"+
		"!#\t\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%(\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000\')\u0005\u0001\u0000\u0000(\'\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+/\u0001\u0000\u0000\u0000,.\t\u0000\u0000\u0000"+
		"-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000024\u0005\u0001\u0000\u000032\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000079\u0005\u0002\u0000\u00008:\u0003\u0004\u0002"+
		"\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0003\u0000\u0000>\u0003\u0001\u0000\u0000\u0000?E\u0003\u0006\u0003"+
		"\u0000@E\u0003\b\u0004\u0000AE\u0003\n\u0005\u0000BE\u0003\f\u0006\u0000"+
		"CE\u0003\u000e\u0007\u0000D?\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000"+
		"\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0004\u0000\u0000G\u0005"+
		"\u0001\u0000\u0000\u0000HK\u0003\u0012\t\u0000IK\u0003\u0016\u000b\u0000"+
		"JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0003\u0010\b\u0000MO\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QT\u0001\u0000\u0000\u0000RU\u0003\u0012\t\u0000SU\u0003\u0016"+
		"\u000b\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0007"+
		"\u0001\u0000\u0000\u0000VY\u0003\u0014\n\u0000WY\u0003\u0016\u000b\u0000"+
		"XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0003\u0010\b\u0000[]\u0001\u0000\u0000\u0000\\X\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`c\u0003\u0014\n\u0000ac\u0003"+
		"\u0016\u000b\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"c\t\u0001\u0000\u0000\u0000df\t\u0000\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0005"+
		"\u0001\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nr\u0001\u0000\u0000"+
		"\u0000oq\t\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uw\u0005\u0001\u0000\u0000vu\u0001"+
		"\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0005\u0005\u0000"+
		"\u0000{}\u0005\u0001\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u001a\r\u0000\u0081"+
		"\u000b\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0010\u0000\u0000\u0083"+
		"\u0084\u0005\u0006\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u0007\u0000\u0000\u0086\u0087\u0003\u001a\r\u0000\u0087\u000f\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0007\u0000\u0000\u0000\u0089\u0011\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\u000f\u0000\u0000\u008b\u0013\u0001"+
		"\u0000\u0000\u0000\u008c\u0093\u0005\u000f\u0000\u0000\u008d\u008e\u0005"+
		"\u000f\u0000\u0000\u008e\u0093\u0005\f\u0000\u0000\u008f\u0090\u0005\u000f"+
		"\u0000\u0000\u0090\u0091\u0005\r\u0000\u0000\u0091\u0093\u0005\u000f\u0000"+
		"\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000"+
		"\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0093\u0015\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0017\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u000e\u0000\u0000\u0097\u0098\u0005\u0010\u0000"+
		"\u0000\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u0019\u0001\u0000\u0000"+
		"\u0000\u009a\u009e\u0003\u0012\t\u0000\u009b\u009e\u0003\u0014\n\u0000"+
		"\u009c\u009e\u0003\u0018\f\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u001b\u0001\u0000\u0000\u0000\u0014\u001f$*/5;DJPTX^bgmrx~\u0092\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}