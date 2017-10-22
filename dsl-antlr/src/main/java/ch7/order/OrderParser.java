// Generated from /Users/sunyan/github/dsl/dsl-antlr/src/main/antlr3/ch7/order/OrderParser.g4 by ANTLR 4.7

  package ch7.order;
  import java.util.List;
  import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OrderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, BUY=2, SELL=3, AT=4, FOR=5, LPRICE=6, ID=7, INT=8, NEWLINE=9, WS=10;
	public static final int
		RULE_orders = 0, RULE_order = 1, RULE_line = 2, RULE_security = 3, RULE_limitprice = 4, 
		RULE_price = 5, RULE_account = 6;
	public static final String[] ruleNames = {
		"orders", "order", "line", "security", "limitprice", "price", "account"
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

	@Override
	public String getGrammarFileName() { return "OrderParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  private List<Order> orders = new ArrayList<Order>();
	  public List<Order> getOrders() {
	    return orders;
	  }

	public OrderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OrdersContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OrderParser.EOF, 0); }
		public List<OrderContext> order() {
			return getRuleContexts(OrderContext.class);
		}
		public OrderContext order(int i) {
			return getRuleContext(OrderContext.class,i);
		}
		public OrdersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orders; }
	}

	public final OrdersContext orders() throws RecognitionException {
		OrdersContext _localctx = new OrdersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_orders);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				order();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BUY || _la==SELL );
			setState(19);
			match(EOF);
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

	public static class OrderContext extends ParserRuleContext {
		public LineContext line;
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(OrderParser.NEWLINE, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_order);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			((OrderContext)_localctx).line = line();
			setState(22);
			match(NEWLINE);
			orders.add(((OrderContext)_localctx).line.value);
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

	public static class LineContext extends ParserRuleContext {
		public Order value;
		public Token e;
		public SecurityContext security;
		public PriceContext price;
		public AccountContext account;
		public SecurityContext security() {
			return getRuleContext(SecurityContext.class,0);
		}
		public PriceContext price() {
			return getRuleContext(PriceContext.class,0);
		}
		public AccountContext account() {
			return getRuleContext(AccountContext.class,0);
		}
		public TerminalNode BUY() { return getToken(OrderParser.BUY, 0); }
		public TerminalNode SELL() { return getToken(OrderParser.SELL, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUY:
				{
				setState(25);
				((LineContext)_localctx).e = match(BUY);
				}
				break;
			case SELL:
				{
				setState(26);
				((LineContext)_localctx).e = match(SELL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(29);
			((LineContext)_localctx).security = security();
			setState(30);
			((LineContext)_localctx).price = price();
			setState(31);
			((LineContext)_localctx).account = account();

			      ((LineContext)_localctx).value =  new Order((((LineContext)_localctx).e!=null?((LineContext)_localctx).e.getText():null), ((LineContext)_localctx).security.value,
			                 ((LineContext)_localctx).price.value, ((LineContext)_localctx).account.value);
			    
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

	public static class SecurityContext extends ParserRuleContext {
		public String value;
		public Token ID;
		public TerminalNode ID() { return getToken(OrderParser.ID, 0); }
		public SecurityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_security; }
	}

	public final SecurityContext security() throws RecognitionException {
		SecurityContext _localctx = new SecurityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_security);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((SecurityContext)_localctx).ID = match(ID);
			((SecurityContext)_localctx).value =  (((SecurityContext)_localctx).ID!=null?((SecurityContext)_localctx).ID.getText():null);
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

	public static class LimitpriceContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public TerminalNode LPRICE() { return getToken(OrderParser.LPRICE, 0); }
		public TerminalNode EQ() { return getToken(OrderParser.EQ, 0); }
		public TerminalNode INT() { return getToken(OrderParser.INT, 0); }
		public LimitpriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitprice; }
	}

	public final LimitpriceContext limitprice() throws RecognitionException {
		LimitpriceContext _localctx = new LimitpriceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_limitprice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LPRICE);
			setState(38);
			match(EQ);
			setState(39);
			((LimitpriceContext)_localctx).INT = match(INT);
			((LimitpriceContext)_localctx).value =  Integer.parseInt((((LimitpriceContext)_localctx).INT!=null?((LimitpriceContext)_localctx).INT.getText():null));
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

	public static class PriceContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public LimitpriceContext limitprice;
		public TerminalNode AT() { return getToken(OrderParser.AT, 0); }
		public TerminalNode INT() { return getToken(OrderParser.INT, 0); }
		public LimitpriceContext limitprice() {
			return getRuleContext(LimitpriceContext.class,0);
		}
		public PriceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_price; }
	}

	public final PriceContext price() throws RecognitionException {
		PriceContext _localctx = new PriceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_price);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(AT);
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(43);
				((PriceContext)_localctx).INT = match(INT);
				((PriceContext)_localctx).value =  Integer.parseInt((((PriceContext)_localctx).INT!=null?((PriceContext)_localctx).INT.getText():null));
				}
				break;
			case LPRICE:
				{
				setState(45);
				((PriceContext)_localctx).limitprice = limitprice();
				((PriceContext)_localctx).value =  ((PriceContext)_localctx).limitprice.value;
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

	public static class AccountContext extends ParserRuleContext {
		public String value;
		public Token ID;
		public TerminalNode FOR() { return getToken(OrderParser.FOR, 0); }
		public TerminalNode ID() { return getToken(OrderParser.ID, 0); }
		public AccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_account; }
	}

	public final AccountContext account() throws RecognitionException {
		AccountContext _localctx = new AccountContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_account);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(FOR);
			setState(51);
			((AccountContext)_localctx).ID = match(ID);
			((AccountContext)_localctx).value =  (((AccountContext)_localctx).ID!=null?((AccountContext)_localctx).ID.getText():null);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\36\n\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\63\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2\64\2\21\3\2\2\2\4\27\3\2\2\2\6"+
		"\35\3\2\2\2\b$\3\2\2\2\n\'\3\2\2\2\f,\3\2\2\2\16\64\3\2\2\2\20\22\5\4"+
		"\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\25\3\2"+
		"\2\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\5\6\4\2\30\31\7\13\2\2\31\32\b\3"+
		"\1\2\32\5\3\2\2\2\33\36\7\4\2\2\34\36\7\5\2\2\35\33\3\2\2\2\35\34\3\2"+
		"\2\2\36\37\3\2\2\2\37 \5\b\5\2 !\5\f\7\2!\"\5\16\b\2\"#\b\4\1\2#\7\3\2"+
		"\2\2$%\7\t\2\2%&\b\5\1\2&\t\3\2\2\2\'(\7\b\2\2()\7\3\2\2)*\7\n\2\2*+\b"+
		"\6\1\2+\13\3\2\2\2,\62\7\6\2\2-.\7\n\2\2.\63\b\7\1\2/\60\5\n\6\2\60\61"+
		"\b\7\1\2\61\63\3\2\2\2\62-\3\2\2\2\62/\3\2\2\2\63\r\3\2\2\2\64\65\7\7"+
		"\2\2\65\66\7\t\2\2\66\67\b\b\1\2\67\17\3\2\2\2\5\23\35\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}