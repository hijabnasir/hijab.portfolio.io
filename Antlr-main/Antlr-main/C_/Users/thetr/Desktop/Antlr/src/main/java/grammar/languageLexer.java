// Generated from /Users/abdallahziadalnaif/Desktop/Antlr/src/main/java/grammar/language.g4 by ANTLR 4.9.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GREATHER=1, LESSER=2, EQUAL=3, GREATHEROREQUAL=4, LESSEROREQUAL=5, ISNOTEQUAL=6, 
		BREAK=7, IF=8, ELSE=9, PLUS=10, MINUS=11, MULTIPLICATION=12, DIVISION=13, 
		POWER_OF=14, OR=15, STOP=16, FOR=17, WHILE=18, FOREVER=19, START=20, COMMA=21, 
		AT_SIGN=22, VOID=23, LPAR=24, RPAR=25, LCBRAC=26, RCBRAC=27, TYPE=28, 
		INT_TYPE=29, DOUBLE_TYPE=30, TXT_TYPE=31, BOOL_TYPE=32, ASSIGN=33, VALUE=34, 
		INT=35, DOT=36, DOUBLE=37, TXT=38, BOOL=39, TRUE=40, FALSE=41, ID=42, 
		WS=43, COMMENT=44, LINE_COMMENT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GREATHER", "LESSER", "EQUAL", "GREATHEROREQUAL", "LESSEROREQUAL", "ISNOTEQUAL", 
			"BREAK", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", 
			"POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", "COMMA", 
			"AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "TYPE", "INT_TYPE", 
			"DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "VALUE", "INT", "DOT", 
			"DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'break'", "'if'", "'else'", 
			"'+'", "'-'", "'*'", "'/'", "'^'", "'||'", "'stop'", "'for'", "'while'", 
			"'forever'", "'start'", "','", "'@'", "'void'", "'('", "')'", "'{'", 
			"'}'", null, "'int'", "'double'", "'txt'", "'bool'", "'='", null, null, 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GREATHER", "LESSER", "EQUAL", "GREATHEROREQUAL", "LESSEROREQUAL", 
			"ISNOTEQUAL", "BREAK", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLICATION", 
			"DIVISION", "POWER_OF", "OR", "STOP", "FOR", "WHILE", "FOREVER", "START", 
			"COMMA", "AT_SIGN", "VOID", "LPAR", "RPAR", "LCBRAC", "RCBRAC", "TYPE", 
			"INT_TYPE", "DOUBLE_TYPE", "TXT_TYPE", "BOOL_TYPE", "ASSIGN", "VALUE", 
			"INT", "DOT", "DOUBLE", "TXT", "BOOL", "TRUE", "FALSE", "ID", "WS", "COMMENT", 
			"LINE_COMMENT"
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


	public languageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "language.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u016e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2g\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4y\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u008e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u00a1\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00b1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0100\n\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3\"\3\"\3#\3#\5#\u011a\n#\3$\6$\u011d\n$\r$\16$\u011e\3%\3%\3&\6&"+
		"\u0124\n&\r&\16&\u0125\3&\3&\6&\u012a\n&\r&\16&\u012b\3\'\3\'\6\'\u0130"+
		"\n\'\r\'\16\'\u0131\3(\3(\5(\u0136\n(\3)\3)\3)\3)\3)\5)\u013d\n)\3*\3"+
		"*\3*\3*\3*\3*\5*\u0145\n*\3+\5+\u0148\n+\3+\6+\u014b\n+\r+\16+\u014c\3"+
		",\6,\u0150\n,\r,\16,\u0151\3,\3,\3-\3-\3-\3-\7-\u015a\n-\f-\16-\u015d"+
		"\13-\3-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u0168\n.\f.\16.\u016b\13.\3.\3.\3\u015b"+
		"\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\t\3\2\62;\3\2c|\3\2C\\\4\2"+
		"aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0183\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3f\3\2\2\2\5o\3\2\2\2\7x\3\2\2\2\t\u008d"+
		"\3\2\2\2\13\u00a0\3\2\2\2\r\u00b0\3\2\2\2\17\u00b2\3\2\2\2\21\u00b8\3"+
		"\2\2\2\23\u00bb\3\2\2\2\25\u00c0\3\2\2\2\27\u00c2\3\2\2\2\31\u00c4\3\2"+
		"\2\2\33\u00c6\3\2\2\2\35\u00c8\3\2\2\2\37\u00ca\3\2\2\2!\u00cd\3\2\2\2"+
		"#\u00d2\3\2\2\2%\u00d6\3\2\2\2\'\u00dc\3\2\2\2)\u00e4\3\2\2\2+\u00ea\3"+
		"\2\2\2-\u00ec\3\2\2\2/\u00ee\3\2\2\2\61\u00f3\3\2\2\2\63\u00f5\3\2\2\2"+
		"\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00ff\3\2\2\2;\u0101\3\2\2\2=\u0105"+
		"\3\2\2\2?\u010c\3\2\2\2A\u0110\3\2\2\2C\u0115\3\2\2\2E\u0119\3\2\2\2G"+
		"\u011c\3\2\2\2I\u0120\3\2\2\2K\u0123\3\2\2\2M\u012d\3\2\2\2O\u0135\3\2"+
		"\2\2Q\u013c\3\2\2\2S\u0144\3\2\2\2U\u0147\3\2\2\2W\u014f\3\2\2\2Y\u0155"+
		"\3\2\2\2[\u0163\3\2\2\2]g\7@\2\2^_\7I\2\2_`\7t\2\2`a\7g\2\2ab\7c\2\2b"+
		"c\7v\2\2cd\7j\2\2de\7g\2\2eg\7t\2\2f]\3\2\2\2f^\3\2\2\2g\4\3\2\2\2hp\7"+
		">\2\2ij\7N\2\2jk\7g\2\2kl\7u\2\2lm\7u\2\2mn\7g\2\2np\7t\2\2oh\3\2\2\2"+
		"oi\3\2\2\2p\6\3\2\2\2qr\7?\2\2ry\7?\2\2st\7G\2\2tu\7s\2\2uv\7w\2\2vw\7"+
		"c\2\2wy\7n\2\2xq\3\2\2\2xs\3\2\2\2y\b\3\2\2\2z{\7@\2\2{\u008e\7?\2\2|"+
		"}\7I\2\2}~\7t\2\2~\177\7g\2\2\177\u0080\7c\2\2\u0080\u0081\7v\2\2\u0081"+
		"\u0082\7j\2\2\u0082\u0083\7g\2\2\u0083\u0084\7t\2\2\u0084\u0085\7a\2\2"+
		"\u0085\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087\u0088\7a\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7s\2\2\u008a\u008b\7w\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008e\7n\2\2\u008dz\3\2\2\2\u008d|\3\2\2\2\u008e\n\3\2\2\2\u008f\u0090"+
		"\7>\2\2\u0090\u00a1\7?\2\2\u0091\u0092\7N\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\u0097\7t\2\2"+
		"\u0097\u0098\7a\2\2\u0098\u0099\7q\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7a\2\2\u009b\u009c\7g\2\2\u009c\u009d\7s\2\2\u009d\u009e\7w\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a1\7n\2\2\u00a0\u008f\3\2\2\2\u00a0\u0091\3\2\2"+
		"\2\u00a1\f\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3\u00b1\7?\2\2\u00a4\u00a5\7"+
		"K\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7a\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7a\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7s\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7c\2\2\u00af\u00b1\7n\2\2"+
		"\u00b0\u00a2\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b1\16\3\2\2\2\u00b2\u00b3"+
		"\7d\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7m\2\2\u00b7\20\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"\22\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7u\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\24\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1\26\3\2\2\2\u00c2"+
		"\u00c3\7/\2\2\u00c3\30\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\32\3\2\2\2\u00c6"+
		"\u00c7\7\61\2\2\u00c7\34\3\2\2\2\u00c8\u00c9\7`\2\2\u00c9\36\3\2\2\2\u00ca"+
		"\u00cb\7~\2\2\u00cb\u00cc\7~\2\2\u00cc \3\2\2\2\u00cd\u00ce\7u\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7r\2\2\u00d1\"\3\2\2\2\u00d2"+
		"\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2\u00d5$\3\2\2\2\u00d6"+
		"\u00d7\7y\2\2\u00d7\u00d8\7j\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7n\2\2"+
		"\u00da\u00db\7g\2\2\u00db&\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7q\2"+
		"\2\u00de\u00df\7t\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\u00e3\7t\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6"+
		"\7v\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"*\3\2\2\2\u00ea\u00eb\7.\2\2\u00eb,\3\2\2\2\u00ec\u00ed\7B\2\2\u00ed."+
		"\3\2\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7k\2\2\u00f1"+
		"\u00f2\7f\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4\62\3\2\2\2\u00f5"+
		"\u00f6\7+\2\2\u00f6\64\3\2\2\2\u00f7\u00f8\7}\2\2\u00f8\66\3\2\2\2\u00f9"+
		"\u00fa\7\177\2\2\u00fa8\3\2\2\2\u00fb\u0100\5;\36\2\u00fc\u0100\5=\37"+
		"\2\u00fd\u0100\5? \2\u00fe\u0100\5A!\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100:\3\2\2\2\u0101"+
		"\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103\u0104\7v\2\2\u0104<\3\2\2\2\u0105"+
		"\u0106\7f\2\2\u0106\u0107\7q\2\2\u0107\u0108\7w\2\2\u0108\u0109\7d\2\2"+
		"\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2\u010b>\3\2\2\2\u010c\u010d\7v\2"+
		"\2\u010d\u010e\7z\2\2\u010e\u010f\7v\2\2\u010f@\3\2\2\2\u0110\u0111\7"+
		"d\2\2\u0111\u0112\7q\2\2\u0112\u0113\7q\2\2\u0113\u0114\7n\2\2\u0114B"+
		"\3\2\2\2\u0115\u0116\7?\2\2\u0116D\3\2\2\2\u0117\u011a\5G$\2\u0118\u011a"+
		"\5K&\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011aF\3\2\2\2\u011b\u011d"+
		"\t\2\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011fH\3\2\2\2\u0120\u0121\7\60\2\2\u0121J\3\2\2\2\u0122"+
		"\u0124\t\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\5I%\2\u0128\u012a"+
		"\t\2\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012cL\3\2\2\2\u012d\u012f\t\3\2\2\u012e\u0130\t\4\2\2"+
		"\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132N\3\2\2\2\u0133\u0136\5Q)\2\u0134\u0136\5S*\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0134\3\2\2\2\u0136P\3\2\2\2\u0137\u013d\7\63\2\2\u0138"+
		"\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a\u013b\7w\2\2\u013b\u013d\7g\2\2"+
		"\u013c\u0137\3\2\2\2\u013c\u0138\3\2\2\2\u013dR\3\2\2\2\u013e\u0145\7"+
		"\62\2\2\u013f\u0140\7h\2\2\u0140\u0141\7c\2\2\u0141\u0142\7n\2\2\u0142"+
		"\u0143\7u\2\2\u0143\u0145\7g\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2\2"+
		"\2\u0145T\3\2\2\2\u0146\u0148\t\5\2\2\u0147\u0146\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\t\6\2\2\u014a\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014dV\3\2\2\2"+
		"\u014e\u0150\t\7\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\b,\2\2\u0154"+
		"X\3\2\2\2\u0155\u0156\7\61\2\2\u0156\u0157\7,\2\2\u0157\u015b\3\2\2\2"+
		"\u0158\u015a\13\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u015f\7,\2\2\u015f\u0160\7\61\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b-"+
		"\2\2\u0162Z\3\2\2\2\u0163\u0164\7\61\2\2\u0164\u0165\7\61\2\2\u0165\u0169"+
		"\3\2\2\2\u0166\u0168\n\b\2\2\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016c\u016d\b.\2\2\u016d\\\3\2\2\2\27\2fox\u008d\u00a0\u00b0\u00ff"+
		"\u0119\u011e\u0125\u012b\u0131\u0135\u013c\u0144\u0147\u014c\u0151\u015b"+
		"\u0169\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}