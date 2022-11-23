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
		RULE_floatOperation = 4, RULE_valueDeclaration = 5, RULE_stackDeclaration = 6, 
		RULE_methodCall = 7, RULE_externalMethodCall = 8, RULE_instantiation = 9, 
		RULE_return = 10, RULE_operator = 11, RULE_integer = 12, RULE_float = 13, 
		RULE_variable = 14, RULE_string = 15, RULE_value = 16, RULE_pushesToStack = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method", "statement", "intOperation", "floatOperation", "valueDeclaration", 
			"stackDeclaration", "methodCall", "externalMethodCall", "instantiation", 
			"return", "operator", "integer", "float", "variable", "string", "value", 
			"pushesToStack"
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				method();
				}
				}
				setState(39); 
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
			setState(41);
			((MethodContext)_localctx).type = match(Id);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				match(T__0);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(47);
			((MethodContext)_localctx).name = match(Id);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(48);
				match(T__0);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__1);
			setState(56); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(55);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(58); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(60);
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
		public ValueDeclarationContext valueDeclaration() {
			return getRuleContext(ValueDeclarationContext.class,0);
		}
		public StackDeclarationContext stackDeclaration() {
			return getRuleContext(StackDeclarationContext.class,0);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(62);
				intOperation();
				}
				break;
			case 2:
				{
				setState(63);
				floatOperation();
				}
				break;
			case 3:
				{
				setState(64);
				valueDeclaration();
				}
				break;
			case 4:
				{
				setState(65);
				stackDeclaration();
				}
				break;
			case 5:
				{
				setState(66);
				methodCall();
				}
				break;
			case 6:
				{
				setState(67);
				externalMethodCall();
				}
				break;
			case 7:
				{
				setState(68);
				instantiation();
				}
				break;
			case 8:
				{
				setState(69);
				return_();
				}
				break;
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(72);
				match(T__0);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
			setState(86); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(82);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Number:
						{
						setState(80);
						integer();
						}
						break;
					case Id:
						{
						setState(81);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(84);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(90);
				integer();
				}
				break;
			case Id:
				{
				setState(91);
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
			setState(100); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(96);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Number:
						{
						setState(94);
						float_();
						}
						break;
					case Id:
						{
						setState(95);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(98);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(104);
				float_();
				}
				break;
			case Id:
				{
				setState(105);
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
	public static class ValueDeclarationContext extends ParserRuleContext {
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
		public ValueDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterValueDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitValueDeclaration(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valueDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((ValueDeclarationContext)_localctx).type = match(Id);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				match(T__0);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(114);
			((ValueDeclarationContext)_localctx).name = match(Id);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(115);
				match(T__0);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__4);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(122);
				match(T__0);
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			((ValueDeclarationContext)_localctx).val = value();
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
	public static class StackDeclarationContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public PushesToStackContext pushesToStack() {
			return getRuleContext(PushesToStackContext.class,0);
		}
		public List<TerminalNode> Id() { return getTokens(FoliageParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(FoliageParser.Id, i);
		}
		public StackDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterStackDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitStackDeclaration(this);
		}
	}

	public final StackDeclarationContext stackDeclaration() throws RecognitionException {
		StackDeclarationContext _localctx = new StackDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stackDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((StackDeclarationContext)_localctx).type = match(Id);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				match(T__0);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(136);
			((StackDeclarationContext)_localctx).name = match(Id);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(137);
				match(T__0);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__4);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(144);
				match(T__0);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			pushesToStack();
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
		enterRule(_localctx, 14, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((MethodCallContext)_localctx).name = match(Id);
			setState(153);
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
		enterRule(_localctx, 16, RULE_externalMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((ExternalMethodCallContext)_localctx).klass = match(Id);
			setState(156);
			match(T__6);
			setState(157);
			((ExternalMethodCallContext)_localctx).name = match(Id);
			setState(158);
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
		enterRule(_localctx, 18, RULE_instantiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__7);
			setState(161);
			((InstantiationContext)_localctx).klass = match(Id);
			setState(162);
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
		enterRule(_localctx, 20, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__8);
			setState(165);
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
		enterRule(_localctx, 22, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 24, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		enterRule(_localctx, 26, RULE_float);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(172);
				match(Number);
				setState(173);
				match(T__13);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(174);
				match(Number);
				setState(175);
				match(T__6);
				setState(176);
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
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__14);
			setState(182);
			match(Id);
			setState(183);
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
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				float_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PushesToStackContext extends ParserRuleContext {
		public IntOperationContext intOperation() {
			return getRuleContext(IntOperationContext.class,0);
		}
		public FloatOperationContext floatOperation() {
			return getRuleContext(FloatOperationContext.class,0);
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
		public PushesToStackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pushesToStack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterPushesToStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitPushesToStack(this);
		}
	}

	public final PushesToStackContext pushesToStack() throws RecognitionException {
		PushesToStackContext _localctx = new PushesToStackContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pushesToStack);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				intOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				floatOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				externalMethodCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				instantiation();
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
		"\u0004\u0001\u0013\u00c6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0004"+
		"\u0000&\b\u0000\u000b\u0000\f\u0000\'\u0001\u0001\u0001\u0001\u0004\u0001"+
		",\b\u0001\u000b\u0001\f\u0001-\u0001\u0001\u0001\u0001\u0005\u00012\b"+
		"\u0001\n\u0001\f\u00015\t\u0001\u0001\u0001\u0001\u0001\u0004\u00019\b"+
		"\u0001\u000b\u0001\f\u0001:\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002G\b\u0002\u0001\u0002\u0005\u0002J\b\u0002\n\u0002\f"+
		"\u0002M\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003"+
		"\u0003S\b\u0003\u0001\u0003\u0001\u0003\u0004\u0003W\b\u0003\u000b\u0003"+
		"\f\u0003X\u0001\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004e\b\u0004"+
		"\u000b\u0004\f\u0004f\u0001\u0004\u0001\u0004\u0003\u0004k\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0004\u0005o\b\u0005\u000b\u0005\f\u0005p\u0001\u0005"+
		"\u0001\u0005\u0005\u0005u\b\u0005\n\u0005\f\u0005x\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004\u0006\u0085\b\u0006\u000b"+
		"\u0006\f\u0006\u0086\u0001\u0006\u0001\u0006\u0005\u0006\u008b\b\u0006"+
		"\n\u0006\f\u0006\u008e\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0092"+
		"\b\u0006\n\u0006\f\u0006\u0095\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00b2\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00bd\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00c4\b\u0011\u0001\u0011\u0001:\u0000\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\u0001\u0001\u0000\n\r\u00d3\u0000%\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000"+
		"\u0000\bd\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\f\u0082\u0001"+
		"\u0000\u0000\u0000\u000e\u0098\u0001\u0000\u0000\u0000\u0010\u009b\u0001"+
		"\u0000\u0000\u0000\u0012\u00a0\u0001\u0000\u0000\u0000\u0014\u00a4\u0001"+
		"\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018\u00a9\u0001"+
		"\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00b3\u0001"+
		"\u0000\u0000\u0000\u001e\u00b5\u0001\u0000\u0000\u0000 \u00bc\u0001\u0000"+
		"\u0000\u0000\"\u00c3\u0001\u0000\u0000\u0000$&\u0003\u0002\u0001\u0000"+
		"%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(\u0001\u0001\u0000\u0000\u0000)+\u0005"+
		"\u0010\u0000\u0000*,\u0005\u0001\u0000\u0000+*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/3\u0005\u0010\u0000\u000002\u0005\u0001"+
		"\u0000\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000068\u0005\u0002\u0000\u000079\u0003\u0004\u0002"+
		"\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0003\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>G\u0003\u0006\u0003"+
		"\u0000?G\u0003\b\u0004\u0000@G\u0003\n\u0005\u0000AG\u0003\f\u0006\u0000"+
		"BG\u0003\u000e\u0007\u0000CG\u0003\u0010\b\u0000DG\u0003\u0012\t\u0000"+
		"EG\u0003\u0014\n\u0000F>\u0001\u0000\u0000\u0000F?\u0001\u0000\u0000\u0000"+
		"F@\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000"+
		"\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000GK\u0001\u0000\u0000\u0000HJ\u0005\u0001\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NO\u0005\u0004\u0000\u0000O\u0005\u0001\u0000\u0000\u0000PS\u0003"+
		"\u0018\f\u0000QS\u0003\u001c\u000e\u0000RP\u0001\u0000\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0003\u0016\u000b\u0000"+
		"UW\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000Z]\u0003\u0018\f\u0000[]\u0003\u001c\u000e\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0007\u0001\u0000\u0000"+
		"\u0000^a\u0003\u001a\r\u0000_a\u0003\u001c\u000e\u0000`^\u0001\u0000\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0003\u0016"+
		"\u000b\u0000ce\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hk\u0003\u001a\r\u0000ik\u0003\u001c\u000e\u0000"+
		"jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\t\u0001\u0000\u0000"+
		"\u0000ln\u0005\u0010\u0000\u0000mo\u0005\u0001\u0000\u0000nm\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rv\u0005\u0010\u0000\u0000"+
		"su\u0005\u0001\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000y}\u0005\u0005\u0000\u0000z|\u0005"+
		"\u0001\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0003 \u0010"+
		"\u0000\u0081\u000b\u0001\u0000\u0000\u0000\u0082\u0084\u0005\u0010\u0000"+
		"\u0000\u0083\u0085\u0005\u0001\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u008c\u0005\u0010\u0000\u0000\u0089\u008b\u0005\u0001\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f\u0093\u0005\u0005\u0000\u0000\u0090\u0092\u0005\u0001\u0000"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0003\"\u0011\u0000\u0097\r\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005\u0010\u0000\u0000\u0099\u009a\u0005\u0006\u0000\u0000"+
		"\u009a\u000f\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0010\u0000\u0000"+
		"\u009c\u009d\u0005\u0007\u0000\u0000\u009d\u009e\u0005\u0010\u0000\u0000"+
		"\u009e\u009f\u0005\u0006\u0000\u0000\u009f\u0011\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005\b\u0000\u0000\u00a1\u00a2\u0005\u0010\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0006\u0000\u0000\u00a3\u0013\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\t\u0000\u0000\u00a5\u00a6\u0003 \u0010\u0000\u00a6\u0015"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\u0000\u0000\u0000\u00a8\u0017"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0011\u0000\u0000\u00aa\u0019"+
		"\u0001\u0000\u0000\u0000\u00ab\u00b2\u0005\u0011\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0011\u0000\u0000\u00ad\u00b2\u0005\u000e\u0000\u0000\u00ae\u00af"+
		"\u0005\u0011\u0000\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0\u00b2"+
		"\u0005\u0011\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b2\u001b"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0010\u0000\u0000\u00b4\u001d"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0010\u0000\u0000\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u001f"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bd\u0003\u0018\f\u0000\u00ba\u00bd\u0003"+
		"\u001a\r\u0000\u00bb\u00bd\u0003\u001e\u000f\u0000\u00bc\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be\u00c4\u0003\u0006\u0003"+
		"\u0000\u00bf\u00c4\u0003\b\u0004\u0000\u00c0\u00c4\u0003\u000e\u0007\u0000"+
		"\u00c1\u00c4\u0003\u0010\b\u0000\u00c2\u00c4\u0003\u0012\t\u0000\u00c3"+
		"\u00be\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4#\u0001\u0000\u0000\u0000\u0015\'"+
		"-3:FKRX\\`fjpv}\u0086\u008c\u0093\u00b1\u00bc\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}