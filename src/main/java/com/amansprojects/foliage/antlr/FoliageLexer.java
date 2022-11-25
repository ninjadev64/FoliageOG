// Generated from java-escape by ANTLR 4.11.1
package com.amansprojects.foliage.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FoliageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Id=18, Number=19, DIGIT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"Id", "Number", "IDEN", "DIGIT", "WS"
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


	public FoliageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Foliage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015j\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0004\u0011Z\b\u0011\u000b\u0011\f\u0011[\u0001\u0012\u0004\u0012"+
		"_\b\u0012\u000b\u0012\f\u0012`\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0000)\u0014+\u0015\u0001"+
		"\u0000\u0003\u0004\u0000--AZ__az\u0001\u000009\u0002\u0000\t\n\r\rj\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001"+
		"-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000"+
		"\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f"+
		">\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013H\u0001"+
		"\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000"+
		"\u0000\u0019N\u0001\u0000\u0000\u0000\u001bP\u0001\u0000\u0000\u0000\u001d"+
		"R\u0001\u0000\u0000\u0000\u001fT\u0001\u0000\u0000\u0000!V\u0001\u0000"+
		"\u0000\u0000#Y\u0001\u0000\u0000\u0000%^\u0001\u0000\u0000\u0000\'b\u0001"+
		"\u0000\u0000\u0000)d\u0001\u0000\u0000\u0000+f\u0001\u0000\u0000\u0000"+
		"-.\u0005 \u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005{\u0000\u0000"+
		"0\u0004\u0001\u0000\u0000\u000012\u0005}\u0000\u00002\u0006\u0001\u0000"+
		"\u0000\u000034\u0005;\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005="+
		"\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005.\u0000\u00008\f\u0001"+
		"\u0000\u0000\u00009:\u0005n\u0000\u0000:;\u0005e\u0000\u0000;<\u0005w"+
		"\u0000\u0000<=\u0005 \u0000\u0000=\u000e\u0001\u0000\u0000\u0000>?\u0005"+
		"r\u0000\u0000?@\u0005e\u0000\u0000@A\u0005t\u0000\u0000AB\u0005u\u0000"+
		"\u0000BC\u0005r\u0000\u0000CD\u0005n\u0000\u0000DE\u0005 \u0000\u0000"+
		"E\u0010\u0001\u0000\u0000\u0000FG\u0005+\u0000\u0000G\u0012\u0001\u0000"+
		"\u0000\u0000HI\u0005-\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005"+
		"*\u0000\u0000K\u0016\u0001\u0000\u0000\u0000LM\u0005/\u0000\u0000M\u0018"+
		"\u0001\u0000\u0000\u0000NO\u0005f\u0000\u0000O\u001a\u0001\u0000\u0000"+
		"\u0000PQ\u0005\"\u0000\u0000Q\u001c\u0001\u0000\u0000\u0000RS\u0005(\u0000"+
		"\u0000S\u001e\u0001\u0000\u0000\u0000TU\u0005,\u0000\u0000U \u0001\u0000"+
		"\u0000\u0000VW\u0005)\u0000\u0000W\"\u0001\u0000\u0000\u0000XZ\u0003\'"+
		"\u0013\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\$\u0001\u0000\u0000\u0000"+
		"]_\u0003)\u0014\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a&\u0001\u0000\u0000"+
		"\u0000bc\u0007\u0000\u0000\u0000c(\u0001\u0000\u0000\u0000de\u0007\u0001"+
		"\u0000\u0000e*\u0001\u0000\u0000\u0000fg\u0007\u0002\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0006\u0015\u0000\u0000i,\u0001\u0000\u0000\u0000"+
		"\u0003\u0000[`\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}