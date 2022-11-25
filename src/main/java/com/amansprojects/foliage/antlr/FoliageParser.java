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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Id=18, Number=19, DIGIT=20, WS=21;
	public static final int
		RULE_program = 0, RULE_method = 1, RULE_statement = 2, RULE_intOperation = 3, 
		RULE_floatOperation = 4, RULE_valueDeclaration = 5, RULE_stackDeclaration = 6, 
		RULE_methodCall = 7, RULE_externalMethodCall = 8, RULE_instantiation = 9, 
		RULE_return = 10, RULE_operator = 11, RULE_integer = 12, RULE_float = 13, 
		RULE_variable = 14, RULE_string = 15, RULE_value = 16, RULE_pushesToStack = 17, 
		RULE_argumentSet = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "method", "statement", "intOperation", "floatOperation", "valueDeclaration", 
			"stackDeclaration", "methodCall", "externalMethodCall", "instantiation", 
			"return", "operator", "integer", "float", "variable", "string", "value", 
			"pushesToStack", "argumentSet"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'{'", "'}'", "';'", "'='", "'.'", "'new '", "'return '", 
			"'+'", "'-'", "'*'", "'/'", "'f'", "'\"'", "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Id", "Number", "DIGIT", "WS"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				method();
				}
				}
				setState(41); 
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
			setState(43);
			((MethodContext)_localctx).type = match(Id);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(T__0);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(49);
			((MethodContext)_localctx).name = match(Id);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(50);
				match(T__0);
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(T__1);
			setState(58); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(57);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(60); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(62);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(64);
				intOperation();
				}
				break;
			case 2:
				{
				setState(65);
				floatOperation();
				}
				break;
			case 3:
				{
				setState(66);
				valueDeclaration();
				}
				break;
			case 4:
				{
				setState(67);
				stackDeclaration();
				}
				break;
			case 5:
				{
				setState(68);
				methodCall();
				}
				break;
			case 6:
				{
				setState(69);
				externalMethodCall();
				}
				break;
			case 7:
				{
				setState(70);
				instantiation();
				}
				break;
			case 8:
				{
				setState(71);
				return_();
				}
				break;
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(74);
				match(T__0);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
			setState(88); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(84);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Number:
						{
						setState(82);
						integer();
						}
						break;
					case Id:
						{
						setState(83);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(86);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(92);
				integer();
				}
				break;
			case Id:
				{
				setState(93);
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
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(98);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Number:
						{
						setState(96);
						float_();
						}
						break;
					case Id:
						{
						setState(97);
						variable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(100);
					operator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(106);
				float_();
				}
				break;
			case Id:
				{
				setState(107);
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
			setState(110);
			((ValueDeclarationContext)_localctx).type = match(Id);
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(T__0);
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(116);
			((ValueDeclarationContext)_localctx).name = match(Id);
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
			match(T__4);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(124);
				match(T__0);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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
			setState(132);
			((StackDeclarationContext)_localctx).type = match(Id);
			setState(134); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133);
				match(T__0);
				}
				}
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(138);
			((StackDeclarationContext)_localctx).name = match(Id);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(139);
				match(T__0);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(T__4);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(146);
				match(T__0);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
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
		public ArgumentSetContext arguments;
		public TerminalNode Id() { return getToken(FoliageParser.Id, 0); }
		public ArgumentSetContext argumentSet() {
			return getRuleContext(ArgumentSetContext.class,0);
		}
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
			setState(154);
			((MethodCallContext)_localctx).name = match(Id);
			setState(155);
			((MethodCallContext)_localctx).arguments = argumentSet();
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
		public ArgumentSetContext arguments;
		public List<TerminalNode> Id() { return getTokens(FoliageParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(FoliageParser.Id, i);
		}
		public ArgumentSetContext argumentSet() {
			return getRuleContext(ArgumentSetContext.class,0);
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
			setState(157);
			((ExternalMethodCallContext)_localctx).klass = match(Id);
			setState(158);
			match(T__5);
			setState(159);
			((ExternalMethodCallContext)_localctx).name = match(Id);
			setState(160);
			((ExternalMethodCallContext)_localctx).arguments = argumentSet();
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
		public ArgumentSetContext arguments;
		public TerminalNode Id() { return getToken(FoliageParser.Id, 0); }
		public ArgumentSetContext argumentSet() {
			return getRuleContext(ArgumentSetContext.class,0);
		}
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
			setState(162);
			match(T__6);
			setState(163);
			((InstantiationContext)_localctx).klass = match(Id);
			setState(164);
			((InstantiationContext)_localctx).arguments = argumentSet();
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
			setState(166);
			match(T__7);
			setState(167);
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
			setState(169);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7680L) != 0) ) {
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
			setState(171);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(174);
				match(Number);
				setState(175);
				match(T__12);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(176);
				match(Number);
				setState(177);
				match(T__5);
				setState(178);
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
			setState(181);
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
			setState(183);
			match(T__13);
			setState(184);
			match(Id);
			setState(185);
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
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				float_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
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
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				intOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				floatOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				externalMethodCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentSetContext extends ParserRuleContext {
		public ValueContext value;
		public List<ValueContext> items = new ArrayList<ValueContext>();
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArgumentSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).enterArgumentSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FoliageListener ) ((FoliageListener)listener).exitArgumentSet(this);
		}
	}

	public final ArgumentSetContext argumentSet() throws RecognitionException {
		ArgumentSetContext _localctx = new ArgumentSetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_argumentSet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__14);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					match(T__0);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==Number) {
				{
				{
				setState(206);
				((ArgumentSetContext)_localctx).value = value();
				((ArgumentSetContext)_localctx).items.add(((ArgumentSetContext)_localctx).value);
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__0) {
							{
							{
							setState(207);
							match(T__0);
							}
							}
							setState(212);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(213);
						match(T__15);
						setState(217);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__0) {
							{
							{
							setState(214);
							match(T__0);
							}
							}
							setState(219);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(220);
						((ArgumentSetContext)_localctx).value = value();
						((ArgumentSetContext)_localctx).items.add(((ArgumentSetContext)_localctx).value);
						}
						} 
					}
					setState(225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(231);
				match(T__0);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__16);
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
		"\u0004\u0001\u0015\u00f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0001"+
		"\u0001\u0001\u0004\u0001.\b\u0001\u000b\u0001\f\u0001/\u0001\u0001\u0001"+
		"\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001;\b\u0001\u000b\u0001\f\u0001<\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002\u0005\u0002"+
		"L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"Y\b\u0003\u000b\u0003\f\u0003Z\u0001\u0003\u0001\u0003\u0003\u0003_\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004g\b\u0004\u000b\u0004\f\u0004h\u0001\u0004\u0001\u0004"+
		"\u0003\u0004m\b\u0004\u0001\u0005\u0001\u0005\u0004\u0005q\b\u0005\u000b"+
		"\u0005\f\u0005r\u0001\u0005\u0001\u0005\u0005\u0005w\b\u0005\n\u0005\f"+
		"\u0005z\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005~\b\u0005\n\u0005\f"+
		"\u0005\u0081\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u0087\b\u0006\u000b\u0006\f\u0006\u0088\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u008d\b\u0006\n\u0006\f\u0006\u0090\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0094\b\u0006\n\u0006\f\u0006\u0097\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00b4\b\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00bf\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00c6\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00ca\b\u0012\n\u0012\f\u0012\u00cd\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u00d1\b\u0012\n\u0012\f\u0012\u00d4\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00d8\b\u0012\n\u0012\f\u0012\u00db\t\u0012\u0001\u0012\u0005"+
		"\u0012\u00de\b\u0012\n\u0012\f\u0012\u00e1\t\u0012\u0005\u0012\u00e3\b"+
		"\u0012\n\u0012\f\u0012\u00e6\t\u0012\u0001\u0012\u0005\u0012\u00e9\b\u0012"+
		"\n\u0012\f\u0012\u00ec\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"<\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0001\u0001\u0000\t\f\u0102\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004H\u0001\u0000"+
		"\u0000\u0000\u0006X\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000\u0000"+
		"\nn\u0001\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u009a"+
		"\u0001\u0000\u0000\u0000\u0010\u009d\u0001\u0000\u0000\u0000\u0012\u00a2"+
		"\u0001\u0000\u0000\u0000\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00a9"+
		"\u0001\u0000\u0000\u0000\u0018\u00ab\u0001\u0000\u0000\u0000\u001a\u00b3"+
		"\u0001\u0000\u0000\u0000\u001c\u00b5\u0001\u0000\u0000\u0000\u001e\u00b7"+
		"\u0001\u0000\u0000\u0000 \u00be\u0001\u0000\u0000\u0000\"\u00c5\u0001"+
		"\u0000\u0000\u0000$\u00c7\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001"+
		"\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0001\u0001\u0000\u0000\u0000"+
		"+-\u0005\u0012\u0000\u0000,.\u0005\u0001\u0000\u0000-,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u000015\u0005\u0012\u0000\u000024\u0005"+
		"\u0001\u0000\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u0000"+
		"53\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u00008:\u0005\u0002\u0000\u00009;\u0003\u0004"+
		"\u0002\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">?\u0005\u0003\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@I\u0003\u0006"+
		"\u0003\u0000AI\u0003\b\u0004\u0000BI\u0003\n\u0005\u0000CI\u0003\f\u0006"+
		"\u0000DI\u0003\u000e\u0007\u0000EI\u0003\u0010\b\u0000FI\u0003\u0012\t"+
		"\u0000GI\u0003\u0014\n\u0000H@\u0001\u0000\u0000\u0000HA\u0001\u0000\u0000"+
		"\u0000HB\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HD\u0001\u0000"+
		"\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000IM\u0001\u0000\u0000\u0000JL\u0005\u0001\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0004\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000"+
		"RU\u0003\u0018\f\u0000SU\u0003\u001c\u000e\u0000TR\u0001\u0000\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0003\u0016\u000b"+
		"\u0000WY\u0001\u0000\u0000\u0000XT\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[^\u0001"+
		"\u0000\u0000\u0000\\_\u0003\u0018\f\u0000]_\u0003\u001c\u000e\u0000^\\"+
		"\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_\u0007\u0001\u0000"+
		"\u0000\u0000`c\u0003\u001a\r\u0000ac\u0003\u001c\u000e\u0000b`\u0001\u0000"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0003"+
		"\u0016\u000b\u0000eg\u0001\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jm\u0003\u001a\r\u0000km\u0003\u001c\u000e"+
		"\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\t\u0001\u0000"+
		"\u0000\u0000np\u0005\u0012\u0000\u0000oq\u0005\u0001\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tx\u0005\u0012\u0000"+
		"\u0000uw\u0005\u0001\u0000\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{\u007f\u0005\u0005\u0000"+
		"\u0000|~\u0005\u0001\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000"+
		"\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0003 \u0010\u0000\u0083\u000b\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0005\u0012\u0000\u0000\u0085\u0087\u0005\u0001\u0000"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008e\u0005\u0012\u0000"+
		"\u0000\u008b\u008d\u0005\u0001\u0000\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0095\u0005\u0005\u0000"+
		"\u0000\u0092\u0094\u0005\u0001\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0003\"\u0011\u0000"+
		"\u0099\r\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0012\u0000\u0000\u009b"+
		"\u009c\u0003$\u0012\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\u0012\u0000\u0000\u009e\u009f\u0005\u0006\u0000\u0000\u009f\u00a0"+
		"\u0005\u0012\u0000\u0000\u00a0\u00a1\u0003$\u0012\u0000\u00a1\u0011\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0012\u0000\u0000\u00a4\u00a5\u0003$\u0012\u0000\u00a5\u0013\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\b\u0000\u0000\u00a7\u00a8\u0003 \u0010"+
		"\u0000\u00a8\u0015\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0000\u0000"+
		"\u0000\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0013\u0000"+
		"\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00b4\u0005\u0013\u0000"+
		"\u0000\u00ae\u00af\u0005\u0013\u0000\u0000\u00af\u00b4\u0005\r\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0013\u0000\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000"+
		"\u00b2\u00b4\u0005\u0013\u0000\u0000\u00b3\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b3\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b4\u001b\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0012\u0000\u0000"+
		"\u00b6\u001d\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u000e\u0000\u0000"+
		"\u00b8\u00b9\u0005\u0012\u0000\u0000\u00b9\u00ba\u0005\u000e\u0000\u0000"+
		"\u00ba\u001f\u0001\u0000\u0000\u0000\u00bb\u00bf\u0003\u0018\f\u0000\u00bc"+
		"\u00bf\u0003\u001a\r\u0000\u00bd\u00bf\u0003\u001e\u000f\u0000\u00be\u00bb"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf!\u0001\u0000\u0000\u0000\u00c0\u00c6\u0003"+
		"\u0006\u0003\u0000\u00c1\u00c6\u0003\b\u0004\u0000\u00c2\u00c6\u0003\u000e"+
		"\u0007\u0000\u00c3\u00c6\u0003\u0010\b\u0000\u00c4\u00c6\u0003\u0012\t"+
		"\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6#\u0001\u0000\u0000\u0000"+
		"\u00c7\u00cb\u0005\u000f\u0000\u0000\u00c8\u00ca\u0005\u0001\u0000\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cc\u00e4\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ce\u00df\u0003 \u0010\u0000\u00cf\u00d1\u0005\u0001\u0000\u0000\u00d0"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d9\u0005\u0010\u0000\u0000\u00d6\u00d8\u0005\u0001\u0000\u0000\u00d7"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00de\u0003 \u0010\u0000\u00dd\u00d2\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00ce\u0001\u0000\u0000\u0000\u00e3\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00ea\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005\u0001\u0000\u0000\u00e8\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005\u0011\u0000\u0000\u00ee%\u0001\u0000\u0000\u0000\u001b)/5<HMTZ"+
		"^bhlrx\u007f\u0088\u008e\u0095\u00b3\u00be\u00c5\u00cb\u00d2\u00d9\u00df"+
		"\u00e4\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}