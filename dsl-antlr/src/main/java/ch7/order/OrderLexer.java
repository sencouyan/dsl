// Generated from /Users/sunyan/github/dsl/dsl-antlr/src/main/antlr3/ch7/order/OrderLexer.g4 by ANTLR 4.7

    package ch7.order;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OrderLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, BUY=2, SELL=3, AT=4, FOR=5, LPRICE=6, ID=7, INT=8, NEWLINE=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EQ", "BUY", "SELL", "AT", "FOR", "LPRICE", "ID", "INT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'buy'", "'sell'", "'@'", "'for'", "'limitprice'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQ", "BUY", "SELL", "AT", "FOR", "LPRICE", "ID", "INT", "NEWLINE", 
		"WS"
	};
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


	public OrderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OrderLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 9:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fI\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\b\65\n\b\r\b\16\b"+
		"\66\3\t\6\t:\n\t\r\t\16\t;\3\n\5\n?\n\n\3\n\3\n\3\13\6\13D\n\13\r\13\16"+
		"\13E\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2"+
		"\4\4\2C\\c|\4\2\13\13\"\"\2L\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\35\3\2\2\2\t\"\3\2\2\2\13$\3"+
		"\2\2\2\r(\3\2\2\2\17\64\3\2\2\2\219\3\2\2\2\23>\3\2\2\2\25C\3\2\2\2\27"+
		"\30\7?\2\2\30\4\3\2\2\2\31\32\7d\2\2\32\33\7w\2\2\33\34\7{\2\2\34\6\3"+
		"\2\2\2\35\36\7u\2\2\36\37\7g\2\2\37 \7n\2\2 !\7n\2\2!\b\3\2\2\2\"#\7B"+
		"\2\2#\n\3\2\2\2$%\7h\2\2%&\7q\2\2&\'\7t\2\2\'\f\3\2\2\2()\7n\2\2)*\7k"+
		"\2\2*+\7o\2\2+,\7k\2\2,-\7v\2\2-.\7r\2\2./\7t\2\2/\60\7k\2\2\60\61\7e"+
		"\2\2\61\62\7g\2\2\62\16\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2"+
		"\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\20\3\2\2\28:\4\62;\298\3\2\2\2:;\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<\22\3\2\2\2=?\7\17\2\2>=\3\2\2\2>?\3\2\2\2"+
		"?@\3\2\2\2@A\7\f\2\2A\24\3\2\2\2BD\t\3\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2"+
		"\2EF\3\2\2\2FG\3\2\2\2GH\b\13\2\2H\26\3\2\2\2\7\2\66;>E\3\3\13\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}