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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Id=16, Number=17, 
		DIGIT=18, WS=19;
	public static final int
		RULE_program = 0, RULE_method = 1, RULE_statement = 2, RULE_intOperation = 3, 
		RULE_floatOperation = 4, RULE_declaration = 5, RULE_methodCall = 6, RULE_externalMethodCall = 7, 
		RULE_instantiation = 8, RULE_return = 9, RULE_operator = 10, RULE_integer = 11, 
		RULE_float = 12, RULE_variable = 13, RULE_string = 14, RULE_value = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method", "statement", "intOperation", "floatOperation", "declaration", 
			"methodCall", "externalMethodCall", "instantiation", "return", "operator", 
			"integer", "float", "variable", "string", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'{'", "'}'", "';'", "'='", "'()'", "'.'", "'new '", "'return '", 
			"'+'", "'-'", "'*'", "'/'", "'f'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Id", "Number", "DIGIT", "WS"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				method();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Id );
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
		public List<TerminalNode> Id() { return getTokens(FoliageParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(FoliageParser.Id, i);
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
			setState(37);
			((MethodContext)_localctx).type = match(Id);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				match(T__0);
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(43);
			((MethodContext)_localctx).name = match(Id);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(44);
				match(T__0);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(T__1);
			setState(52); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(51);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(56);
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
		public ExternalMethodCallContext externalMethodCall() {
			return getRuleContext(ExternalMethodCallContext.class,0);
		}
		public InstantiationContext instantiation() {
			return getRuleContext(InstantiationContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(58);
				intOperation();
				}
				break;
			case 2:
				{
				setState(59);
				floatOperation();
				}
				break;
			case 3:
				{
				setState(60);
				declaration();
				}
				break;
			case 4:
				{
				setState(61);
				methodCall();
				}
				break;
			case 5:
				{
				setState(62);
				externalMethodCall();
				}
				break;
			case 6:
				{
				setState(63);
				instantiation();
				}
				break;
			case 7:
				{
				setState(64);
				return_();
				}
				break;
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(67);
				match(T__0);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
			setState(81); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Number:
						{
						setState(75);
						integer();
						}
						break;
					case Id:
						{
						setState(76);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(79);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(83); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(85);
				integer();
				}
				break;
			case Id:
				{
				setState(86);
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
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(91);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Number:
						{
						setState(89);
						float_();
						}
						break;
					case Id:
						{
						setState(90);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(93);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(99);
				float_();
				}
				break;
			case Id:
				{
				setState(100);
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
		public List<TerminalNode> Id() { return getTokens(FoliageParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(FoliageParser.Id, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((DeclarationContext)_localctx).type = match(Id);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				match(T__0);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(109);
			((DeclarationContext)_localctx).name = match(Id);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(110);
				match(T__0);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__4);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(117);
				match(T__0);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
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
		public TerminalNode Id() { return getToken(FoliageParser.Id, 0); }
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
			setState(125);
			((MethodCallContext)_localctx).name = match(Id);
			setState(126);
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
	public static class ExternalMethodCallContext extends ParserRuleContext {
		public Token klass;
		public Token name;
		public List<TerminalNode> Id() { return getTokens(FoliageParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(FoliageParser.Id, i);
		}
		public ExternalMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterExternalMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitExternalMethodCall(this);
		}
	}

	public final ExternalMethodCallContext externalMethodCall() throws RecognitionException {
		ExternalMethodCallContext _localctx = new ExternalMethodCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_externalMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((ExternalMethodCallContext)_localctx).klass = match(Id);
			setState(129);
			match(T__6);
			setState(130);
			((ExternalMethodCallContext)_localctx).name = match(Id);
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
	public static class InstantiationContext extends ParserRuleContext {
		public Token klass;
		public TerminalNode Id() { return getToken(FoliageParser.Id, 0); }
		public InstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitInstantiation(this);
		}
	}

	public final InstantiationContext instantiation() throws RecognitionException {
		InstantiationContext _localctx = new InstantiationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__7);
			setState(134);
			((InstantiationContext)_localctx).klass = match(Id);
			setState(135);
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
		enterRule(_localctx, 18, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__8);
			setState(138);
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
		enterRule(_localctx, 20, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0) ) {
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
		enterRule(_localctx, 22, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
		enterRule(_localctx, 24, RULE_float);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(145);
				match(Number);
				setState(146);
				match(T__13);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(147);
				match(Number);
				setState(148);
				match(T__6);
				setState(149);
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
		public TerminalNode Id() { return getToken(FoliageParser.Id, 0); }
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
		enterRule(_localctx, 26, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Id);
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
		public TerminalNode Id() { return getToken(FoliageParser.Id, 0); }
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
		enterRule(_localctx, 28, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__14);
			setState(155);
			match(Id);
			setState(156);
			match(T__14);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				float_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
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
		"\u0004\u0001\u0013\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0001"+
		"\u0001\u0001\u0004\u0001(\b\u0001\u000b\u0001\f\u0001)\u0001\u0001\u0001"+
		"\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u00015\b\u0001\u000b\u0001\f\u00016\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0005\u0002E\b\u0002\n\u0002"+
		"\f\u0002H\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003N\b\u0003\u0001\u0003\u0001\u0003\u0004\u0003R\b\u0003\u000b\u0003"+
		"\f\u0003S\u0001\u0003\u0001\u0003\u0003\u0003X\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\\\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004`\b\u0004"+
		"\u000b\u0004\f\u0004a\u0001\u0004\u0001\u0004\u0003\u0004f\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0004\u0005j\b\u0005\u000b\u0005\f\u0005k\u0001\u0005"+
		"\u0001\u0005\u0005\u0005p\b\u0005\n\u0005\f\u0005s\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005w\b\u0005\n\u0005\f\u0005z\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0097\b\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00a2\b\u000f\u0001\u000f\u00016\u0000\u0010\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e\u0000\u0001\u0001\u0000\n\r\u00ab\u0000!\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006Q"+
		"\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000"+
		"\u0000\f}\u0001\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000"+
		"\u0010\u0085\u0001\u0000\u0000\u0000\u0012\u0089\u0001\u0000\u0000\u0000"+
		"\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000"+
		"\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u0098\u0001\u0000\u0000\u0000"+
		"\u001c\u009a\u0001\u0000\u0000\u0000\u001e\u00a1\u0001\u0000\u0000\u0000"+
		" \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001"+
		"\u0000\u0000\u0000%\'\u0005\u0010\u0000\u0000&(\u0005\u0001\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+/\u0005\u0010"+
		"\u0000\u0000,.\u0005\u0001\u0000\u0000-,\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"02\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000024\u0005\u0002\u0000"+
		"\u000035\u0003\u0004\u0002\u000043\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000089\u0005\u0003\u0000\u00009\u0003\u0001\u0000\u0000"+
		"\u0000:B\u0003\u0006\u0003\u0000;B\u0003\b\u0004\u0000<B\u0003\n\u0005"+
		"\u0000=B\u0003\f\u0006\u0000>B\u0003\u000e\u0007\u0000?B\u0003\u0010\b"+
		"\u0000@B\u0003\u0012\t\u0000A:\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000"+
		"\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BF\u0001"+
		"\u0000\u0000\u0000CE\u0005\u0001\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0004"+
		"\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KN\u0003\u0016\u000b\u0000"+
		"LN\u0003\u001a\r\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0003\u0014\n\u0000PR\u0001\u0000\u0000\u0000"+
		"QM\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000UX\u0003\u0016"+
		"\u000b\u0000VX\u0003\u001a\r\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X\u0007\u0001\u0000\u0000\u0000Y\\\u0003\u0018\f\u0000Z\\"+
		"\u0003\u001a\r\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0003\u0014\n\u0000^`\u0001\u0000\u0000"+
		"\u0000_[\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000cf\u0003"+
		"\u0018\f\u0000df\u0003\u001a\r\u0000ec\u0001\u0000\u0000\u0000ed\u0001"+
		"\u0000\u0000\u0000f\t\u0001\u0000\u0000\u0000gi\u0005\u0010\u0000\u0000"+
		"hj\u0005\u0001\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mq\u0005\u0010\u0000\u0000np\u0005\u0001\u0000\u0000on\u0001"+
		"\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000tx\u0005\u0005\u0000\u0000uw\u0005\u0001\u0000\u0000vu\u0001\u0000"+
		"\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"{|\u0003\u001e\u000f\u0000|\u000b\u0001\u0000\u0000\u0000}~\u0005\u0010"+
		"\u0000\u0000~\u007f\u0005\u0006\u0000\u0000\u007f\r\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0010\u0000\u0000\u0081\u0082\u0005\u0007\u0000"+
		"\u0000\u0082\u0083\u0005\u0010\u0000\u0000\u0083\u0084\u0005\u0006\u0000"+
		"\u0000\u0084\u000f\u0001\u0000\u0000\u0000\u0085\u0086\u0005\b\u0000\u0000"+
		"\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u0088\u0005\u0006\u0000\u0000"+
		"\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008a\u0005\t\u0000\u0000\u008a"+
		"\u008b\u0003\u001e\u000f\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0007\u0000\u0000\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\u0011\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090"+
		"\u0097\u0005\u0011\u0000\u0000\u0091\u0092\u0005\u0011\u0000\u0000\u0092"+
		"\u0097\u0005\u000e\u0000\u0000\u0093\u0094\u0005\u0011\u0000\u0000\u0094"+
		"\u0095\u0005\u0007\u0000\u0000\u0095\u0097\u0005\u0011\u0000\u0000\u0096"+
		"\u0090\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000\u0000\u0000\u0096"+
		"\u0093\u0001\u0000\u0000\u0000\u0097\u0019\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005\u0010\u0000\u0000\u0099\u001b\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0005\u000f\u0000\u0000\u009b\u009c\u0005\u0010\u0000\u0000\u009c"+
		"\u009d\u0005\u000f\u0000\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e"+
		"\u00a2\u0003\u0016\u000b\u0000\u009f\u00a2\u0003\u0018\f\u0000\u00a0\u00a2"+
		"\u0003\u001c\u000e\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u001f"+
		"\u0001\u0000\u0000\u0000\u0011#)/6AFMSW[aekqx\u0096\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}