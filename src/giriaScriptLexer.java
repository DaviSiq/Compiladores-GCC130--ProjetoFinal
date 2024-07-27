// Generated from giriaScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class giriaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COD=1, TIPOS=2, ARIT=3, ATRIB=4, DF=5, ER=6, EC=7, ESC=8, LEIT=9, AB=10, 
		FB=11, AP=12, FP=13, FL=14, LOGIC=15, RELAC=16, ID=17, NUM=18, BOOL=19, 
		WS=20, ERROR=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COD", "TIPOS", "ARIT", "ATRIB", "DF", "ER", "EC", "ESC", "LEIT", "AB", 
			"FB", "AP", "FP", "FL", "LOGIC", "RELAC", "ID", "NUM", "BOOL", "WS", 
			"ERROR", "LETRA", "DIGITO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'codigo'", null, null, "'<-'", null, "'repete'", null, "'lequemSabe'", 
			"'mandaAi'", "'{'", "'}'", "'('", "')'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COD", "TIPOS", "ARIT", "ATRIB", "DF", "ER", "EC", "ESC", "LEIT", 
			"AB", "FB", "AP", "FP", "FL", "LOGIC", "RELAC", "ID", "NUM", "BOOL", 
			"WS", "ERROR"
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


	public giriaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "giriaScript.g4"; }

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
		"\u0004\u0000\u0015\u0108\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001P\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002i\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0083\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u009a\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00c1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00de"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e3\b\u0010"+
		"\n\u0010\f\u0010\u00e6\t\u0010\u0001\u0011\u0004\u0011\u00e9\b\u0011\u000b"+
		"\u0011\f\u0011\u00ea\u0001\u0011\u0001\u0011\u0003\u0011\u00ef\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00fa\b\u0012\u0001\u0013"+
		"\u0004\u0013\u00fd\b\u0013\u000b\u0013\f\u0013\u00fe\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0000-\u0000\u0001\u0000\u0003\u0003\u0000\t\n\r\r  \u0002"+
		"\u0000AZaz\u0001\u000009\u0119\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u0003O"+
		"\u0001\u0000\u0000\u0000\u0005h\u0001\u0000\u0000\u0000\u0007j\u0001\u0000"+
		"\u0000\u0000\t\u0082\u0001\u0000\u0000\u0000\u000b\u0084\u0001\u0000\u0000"+
		"\u0000\r\u0099\u0001\u0000\u0000\u0000\u000f\u009b\u0001\u0000\u0000\u0000"+
		"\u0011\u00a6\u0001\u0000\u0000\u0000\u0013\u00ae\u0001\u0000\u0000\u0000"+
		"\u0015\u00b0\u0001\u0000\u0000\u0000\u0017\u00b2\u0001\u0000\u0000\u0000"+
		"\u0019\u00b4\u0001\u0000\u0000\u0000\u001b\u00b6\u0001\u0000\u0000\u0000"+
		"\u001d\u00c0\u0001\u0000\u0000\u0000\u001f\u00dd\u0001\u0000\u0000\u0000"+
		"!\u00df\u0001\u0000\u0000\u0000#\u00e8\u0001\u0000\u0000\u0000%\u00f9"+
		"\u0001\u0000\u0000\u0000\'\u00fc\u0001\u0000\u0000\u0000)\u0102\u0001"+
		"\u0000\u0000\u0000+\u0104\u0001\u0000\u0000\u0000-\u0106\u0001\u0000\u0000"+
		"\u0000/0\u0005c\u0000\u000001\u0005o\u0000\u000012\u0005d\u0000\u0000"+
		"23\u0005i\u0000\u000034\u0005g\u0000\u000045\u0005o\u0000\u00005\u0002"+
		"\u0001\u0000\u0000\u000067\u0005f\u0000\u000078\u0005i\u0000\u000089\u0005"+
		"r\u0000\u00009:\u0005m\u0000\u0000:P\u0005e\u0000\u0000;<\u0005m\u0000"+
		"\u0000<=\u0005o\u0000\u0000=>\u0005l\u0000\u0000>P\u0005e\u0000\u0000"+
		"?@\u0005d\u0000\u0000@A\u0005u\u0000\u0000AB\u0005a\u0000\u0000BC\u0005"+
		"s\u0000\u0000CD\u0005c\u0000\u0000DE\u0005a\u0000\u0000EF\u0005r\u0000"+
		"\u0000FP\u0005a\u0000\u0000GH\u0005l\u0000\u0000HI\u0005e\u0000\u0000"+
		"IJ\u0005t\u0000\u0000JK\u0005r\u0000\u0000KL\u0005i\u0000\u0000LM\u0005"+
		"n\u0000\u0000MN\u0005h\u0000\u0000NP\u0005a\u0000\u0000O6\u0001\u0000"+
		"\u0000\u0000O;\u0001\u0000\u0000\u0000O?\u0001\u0000\u0000\u0000OG\u0001"+
		"\u0000\u0000\u0000P\u0004\u0001\u0000\u0000\u0000QR\u0005j\u0000\u0000"+
		"RS\u0005u\u0000\u0000ST\u0005n\u0000\u0000TU\u0005t\u0000\u0000Ui\u0005"+
		"a\u0000\u0000VW\u0005t\u0000\u0000WX\u0005i\u0000\u0000XY\u0005r\u0000"+
		"\u0000Yi\u0005a\u0000\u0000Z[\u0005m\u0000\u0000[\\\u0005u\u0000\u0000"+
		"\\]\u0005t\u0000\u0000]^\u0005i\u0000\u0000^_\u0005p\u0000\u0000_`\u0005"+
		"r\u0000\u0000`a\u0005i\u0000\u0000ab\u0005c\u0000\u0000bi\u0005a\u0000"+
		"\u0000cd\u0005r\u0000\u0000de\u0005a\u0000\u0000ef\u0005c\u0000\u0000"+
		"fg\u0005h\u0000\u0000gi\u0005a\u0000\u0000hQ\u0001\u0000\u0000\u0000h"+
		"V\u0001\u0000\u0000\u0000hZ\u0001\u0000\u0000\u0000hc\u0001\u0000\u0000"+
		"\u0000i\u0006\u0001\u0000\u0000\u0000jk\u0005<\u0000\u0000kl\u0005-\u0000"+
		"\u0000l\b\u0001\u0000\u0000\u0000mn\u0005e\u0000\u0000no\u0005s\u0000"+
		"\u0000op\u0005s\u0000\u0000pq\u0005e\u0000\u0000qr\u0005v\u0000\u0000"+
		"rs\u0005o\u0000\u0000st\u0005r\u0000\u0000tu\u0005t\u0000\u0000u\u0083"+
		"\u0005a\u0000\u0000vw\u0005e\u0000\u0000wx\u0005s\u0000\u0000xy\u0005"+
		"s\u0000\u0000yz\u0005e\u0000\u0000z{\u0005n\u0000\u0000{|\u0005u\u0000"+
		"\u0000|}\u0005m\u0000\u0000}~\u0005v\u0000\u0000~\u007f\u0005o\u0000\u0000"+
		"\u007f\u0080\u0005r\u0000\u0000\u0080\u0081\u0005t\u0000\u0000\u0081\u0083"+
		"\u0005a\u0000\u0000\u0082m\u0001\u0000\u0000\u0000\u0082v\u0001\u0000"+
		"\u0000\u0000\u0083\n\u0001\u0000\u0000\u0000\u0084\u0085\u0005r\u0000"+
		"\u0000\u0085\u0086\u0005e\u0000\u0000\u0086\u0087\u0005p\u0000\u0000\u0087"+
		"\u0088\u0005e\u0000\u0000\u0088\u0089\u0005t\u0000\u0000\u0089\u008a\u0005"+
		"e\u0000\u0000\u008a\f\u0001\u0000\u0000\u0000\u008b\u008c\u0005V\u0000"+
		"\u0000\u008c\u009a\u0005o\u0000\u0000\u008d\u008e\u0005n\u0000\u0000\u008e"+
		"\u008f\u0005u\u0000\u0000\u008f\u0090\u0005m\u0000\u0000\u0090\u0091\u0005"+
		"V\u0000\u0000\u0091\u009a\u0005o\u0000\u0000\u0092\u0093\u0005v\u0000"+
		"\u0000\u0093\u0094\u0005o\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095"+
		"\u0096\u0005u\u0000\u0000\u0096\u0097\u0005m\u0000\u0000\u0097\u0098\u0005"+
		"v\u0000\u0000\u0098\u009a\u0005o\u0000\u0000\u0099\u008b\u0001\u0000\u0000"+
		"\u0000\u0099\u008d\u0001\u0000\u0000\u0000\u0099\u0092\u0001\u0000\u0000"+
		"\u0000\u009a\u000e\u0001\u0000\u0000\u0000\u009b\u009c\u0005l\u0000\u0000"+
		"\u009c\u009d\u0005e\u0000\u0000\u009d\u009e\u0005q\u0000\u0000\u009e\u009f"+
		"\u0005u\u0000\u0000\u009f\u00a0\u0005e\u0000\u0000\u00a0\u00a1\u0005m"+
		"\u0000\u0000\u00a1\u00a2\u0005S\u0000\u0000\u00a2\u00a3\u0005a\u0000\u0000"+
		"\u00a3\u00a4\u0005b\u0000\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5\u0010"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005m\u0000\u0000\u00a7\u00a8\u0005"+
		"a\u0000\u0000\u00a8\u00a9\u0005n\u0000\u0000\u00a9\u00aa\u0005d\u0000"+
		"\u0000\u00aa\u00ab\u0005a\u0000\u0000\u00ab\u00ac\u0005A\u0000\u0000\u00ac"+
		"\u00ad\u0005i\u0000\u0000\u00ad\u0012\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005{\u0000\u0000\u00af\u0014\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"}\u0000\u0000\u00b1\u0016\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005(\u0000"+
		"\u0000\u00b3\u0018\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005)\u0000\u0000"+
		"\u00b5\u001a\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005|\u0000\u0000\u00b7"+
		"\u001c\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005a\u0000\u0000\u00b9\u00ba"+
		"\u0005n\u0000\u0000\u00ba\u00c1\u0005d\u0000\u0000\u00bb\u00bc\u0005o"+
		"\u0000\u0000\u00bc\u00c1\u0005r\u0000\u0000\u00bd\u00be\u0005n\u0000\u0000"+
		"\u00be\u00bf\u0005o\u0000\u0000\u00bf\u00c1\u0005t\u0000\u0000\u00c0\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c0\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c1\u001e\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0005e\u0000\u0000\u00c3\u00c4\u0005n\u0000\u0000\u00c4\u00c5\u0005g"+
		"\u0000\u0000\u00c5\u00c6\u0005u\u0000\u0000\u00c6\u00c7\u0005a\u0000\u0000"+
		"\u00c7\u00de\u0005l\u0000\u0000\u00c8\u00c9\u0005t\u0000\u0000\u00c9\u00ca"+
		"\u0005a\u0000\u0000\u00ca\u00cb\u0005C\u0000\u0000\u00cb\u00cc\u0005h"+
		"\u0000\u0000\u00cc\u00cd\u0005a\u0000\u0000\u00cd\u00ce\u0005p\u0000\u0000"+
		"\u00ce\u00cf\u0005a\u0000\u0000\u00cf\u00d0\u0005n\u0000\u0000\u00d0\u00de"+
		"\u0005o\u0000\u0000\u00d1\u00d2\u0005d\u0000\u0000\u00d2\u00d3\u0005m"+
		"\u0000\u0000\u00d3\u00d4\u0005a\u0000\u0000\u00d4\u00d5\u0005i\u0000\u0000"+
		"\u00d5\u00d6\u0005o\u0000\u0000\u00d6\u00de\u0005r\u0000\u0000\u00d7\u00d8"+
		"\u0005d\u0000\u0000\u00d8\u00d9\u0005m\u0000\u0000\u00d9\u00da\u0005e"+
		"\u0000\u0000\u00da\u00db\u0005n\u0000\u0000\u00db\u00dc\u0005o\u0000\u0000"+
		"\u00dc\u00de\u0005r\u0000\u0000\u00dd\u00c2\u0001\u0000\u0000\u0000\u00dd"+
		"\u00c8\u0001\u0000\u0000\u0000\u00dd\u00d1\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d7\u0001\u0000\u0000\u0000\u00de \u0001\u0000\u0000\u0000\u00df\u00e4"+
		"\u0003+\u0015\u0000\u00e0\u00e3\u0003-\u0016\u0000\u00e1\u00e3\u0003+"+
		"\u0015\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\"\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003-\u0016\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005.\u0000\u0000\u00ed"+
		"\u00ef\u0003-\u0016\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef$\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005"+
		"d\u0000\u0000\u00f1\u00f2\u0005b\u0000\u0000\u00f2\u00f3\u0005o\u0000"+
		"\u0000\u00f3\u00fa\u0005a\u0000\u0000\u00f4\u00f5\u0005j\u0000\u0000\u00f5"+
		"\u00f6\u0005u\u0000\u0000\u00f6\u00f7\u0005d\u0000\u0000\u00f7\u00f8\u0005"+
		"a\u0000\u0000\u00f8\u00fa\u0005s\u0000\u0000\u00f9\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000\u00fa&\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fd\u0007\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0006\u0013\u0000\u0000\u0101(\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\t\u0000\u0000\u0000\u0103*\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0007\u0001\u0000\u0000\u0105,\u0001\u0000\u0000\u0000\u0106\u0107\u0007"+
		"\u0002\u0000\u0000\u0107.\u0001\u0000\u0000\u0000\r\u0000Oh\u0082\u0099"+
		"\u00c0\u00dd\u00e2\u00e4\u00ea\u00ee\u00f9\u00fe\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}