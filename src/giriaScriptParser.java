// Generated from giriaScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class giriaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COD=1, TIPOS=2, ARIT=3, ATRIB=4, DF=5, ER=6, EC=7, ESC=8, LEIT=9, AB=10, 
		FB=11, AP=12, FP=13, FL=14, LOGIC=15, RELAC=16, ID=17, NUM=18, BOOL=19, 
		WS=20, ERROR=21;
	public static final int
		RULE_inicio = 0, RULE_declaracao = 1, RULE_algoritmo = 2, RULE_instr = 3, 
		RULE_atrib = 4, RULE_interc = 5, RULE_acao = 6, RULE_valores = 7, RULE_operacao = 8, 
		RULE_operando_cauda = 9, RULE_condicao = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracao", "algoritmo", "instr", "atrib", "interc", "acao", 
			"valores", "operacao", "operando_cauda", "condicao"
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

	@Override
	public String getGrammarFileName() { return "giriaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public giriaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(giriaScriptParser.EOF, 0); }
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COD) {
				{
				setState(22);
				declaracao();
				setState(23);
				algoritmo();
				}
			}

			setState(27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode COD() { return getToken(giriaScriptParser.COD, 0); }
		public TerminalNode ID() { return getToken(giriaScriptParser.ID, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(COD);
			setState(30);
			match(ID);
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
	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode AB() { return getToken(giriaScriptParser.AB, 0); }
		public TerminalNode FB() { return getToken(giriaScriptParser.FB, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(AB);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				instr();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 132036L) != 0) );
			setState(38);
			match(FB);
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
	public static class InstrContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public IntercContext interc() {
			return getRuleContext(IntercContext.class,0);
		}
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instr);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPOS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				atrib();
				}
				break;
			case ESC:
			case LEIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				interc();
				}
				break;
			case ER:
			case EC:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				acao();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AtribContext extends ParserRuleContext {
		public TerminalNode TIPOS() { return getToken(giriaScriptParser.TIPOS, 0); }
		public TerminalNode ID() { return getToken(giriaScriptParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(giriaScriptParser.ATRIB, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode FL() { return getToken(giriaScriptParser.FL, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atrib);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(TIPOS);
				setState(46);
				match(ID);
				setState(47);
				match(ATRIB);
				setState(48);
				valores();
				setState(49);
				match(FL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(TIPOS);
				setState(52);
				match(ID);
				setState(53);
				match(FL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(ID);
				setState(55);
				match(ATRIB);
				setState(56);
				operacao();
				setState(57);
				match(FL);
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
	public static class IntercContext extends ParserRuleContext {
		public TerminalNode ESC() { return getToken(giriaScriptParser.ESC, 0); }
		public TerminalNode ID() { return getToken(giriaScriptParser.ID, 0); }
		public TerminalNode FL() { return getToken(giriaScriptParser.FL, 0); }
		public TerminalNode LEIT() { return getToken(giriaScriptParser.LEIT, 0); }
		public IntercContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterInterc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitInterc(this);
		}
	}

	public final IntercContext interc() throws RecognitionException {
		IntercContext _localctx = new IntercContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interc);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESC:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(ESC);
				setState(62);
				match(ID);
				setState(63);
				match(FL);
				}
				break;
			case LEIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(LEIT);
				setState(65);
				match(ID);
				setState(66);
				match(FL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class AcaoContext extends ParserRuleContext {
		public TerminalNode ER() { return getToken(giriaScriptParser.ER, 0); }
		public TerminalNode AP() { return getToken(giriaScriptParser.AP, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(giriaScriptParser.FP, 0); }
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode EC() { return getToken(giriaScriptParser.EC, 0); }
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitAcao(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_acao);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ER:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ER);
				setState(70);
				match(AP);
				setState(71);
				condicao();
				setState(72);
				match(FP);
				setState(73);
				algoritmo();
				}
				break;
			case EC:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(EC);
				setState(76);
				match(AP);
				setState(77);
				condicao();
				setState(78);
				match(FP);
				setState(79);
				algoritmo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ValoresContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(giriaScriptParser.ID, 0); }
		public TerminalNode NUM() { return getToken(giriaScriptParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(giriaScriptParser.BOOL, 0); }
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitValores(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
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
	public static class OperacaoContext extends ParserRuleContext {
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public List<TerminalNode> ARIT() { return getTokens(giriaScriptParser.ARIT); }
		public TerminalNode ARIT(int i) {
			return getToken(giriaScriptParser.ARIT, i);
		}
		public List<Operando_caudaContext> operando_cauda() {
			return getRuleContexts(Operando_caudaContext.class);
		}
		public Operando_caudaContext operando_cauda(int i) {
			return getRuleContext(Operando_caudaContext.class,i);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			valores();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARIT) {
				{
				{
				setState(86);
				match(ARIT);
				setState(87);
				operando_cauda();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class Operando_caudaContext extends ParserRuleContext {
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public Operando_caudaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando_cauda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterOperando_cauda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitOperando_cauda(this);
		}
	}

	public final Operando_caudaContext operando_cauda() throws RecognitionException {
		Operando_caudaContext _localctx = new Operando_caudaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operando_cauda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			valores();
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
	public static class CondicaoContext extends ParserRuleContext {
		public List<ValoresContext> valores() {
			return getRuleContexts(ValoresContext.class);
		}
		public ValoresContext valores(int i) {
			return getRuleContext(ValoresContext.class,i);
		}
		public TerminalNode RELAC() { return getToken(giriaScriptParser.RELAC, 0); }
		public TerminalNode LOGIC() { return getToken(giriaScriptParser.LOGIC, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			valores();
			setState(96);
			match(RELAC);
			setState(97);
			valores();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGIC) {
				{
				setState(98);
				match(LOGIC);
				setState(99);
				condicao();
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015g\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u001a\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004\u0002#\b\u0002\u000b"+
		"\u0002\f\u0002$\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003,\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004<\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005D\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006R\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0005\bY\b\b\n\b\f\b\\\t\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ne\b\n\u0001\n\u0000"+
		"\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0001\u0001\u0000\u0011\u0013e\u0000\u0019\u0001\u0000\u0000\u0000\u0002"+
		"\u001d\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000\u0006+\u0001"+
		"\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000"+
		"\fQ\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000\u0000\u0010U\u0001"+
		"\u0000\u0000\u0000\u0012]\u0001\u0000\u0000\u0000\u0014_\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0003\u0004\u0002"+
		"\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f\u0005\u0011\u0000"+
		"\u0000\u001f\u0003\u0001\u0000\u0000\u0000 \"\u0005\n\u0000\u0000!#\u0003"+
		"\u0006\u0003\u0000\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u000b\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000(,\u0003"+
		"\b\u0004\u0000),\u0003\n\u0005\u0000*,\u0003\f\u0006\u0000+(\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0007"+
		"\u0001\u0000\u0000\u0000-.\u0005\u0002\u0000\u0000./\u0005\u0011\u0000"+
		"\u0000/0\u0005\u0004\u0000\u000001\u0003\u000e\u0007\u000012\u0005\u000e"+
		"\u0000\u00002<\u0001\u0000\u0000\u000034\u0005\u0002\u0000\u000045\u0005"+
		"\u0011\u0000\u00005<\u0005\u000e\u0000\u000067\u0005\u0011\u0000\u0000"+
		"78\u0005\u0004\u0000\u000089\u0003\u0010\b\u00009:\u0005\u000e\u0000\u0000"+
		":<\u0001\u0000\u0000\u0000;-\u0001\u0000\u0000\u0000;3\u0001\u0000\u0000"+
		"\u0000;6\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000\u0000=>\u0005\b"+
		"\u0000\u0000>?\u0005\u0011\u0000\u0000?D\u0005\u000e\u0000\u0000@A\u0005"+
		"\t\u0000\u0000AB\u0005\u0011\u0000\u0000BD\u0005\u000e\u0000\u0000C=\u0001"+
		"\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000D\u000b\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0006\u0000\u0000FG\u0005\f\u0000\u0000GH\u0003\u0014\n"+
		"\u0000HI\u0005\r\u0000\u0000IJ\u0003\u0004\u0002\u0000JR\u0001\u0000\u0000"+
		"\u0000KL\u0005\u0007\u0000\u0000LM\u0005\f\u0000\u0000MN\u0003\u0014\n"+
		"\u0000NO\u0005\r\u0000\u0000OP\u0003\u0004\u0002\u0000PR\u0001\u0000\u0000"+
		"\u0000QE\u0001\u0000\u0000\u0000QK\u0001\u0000\u0000\u0000R\r\u0001\u0000"+
		"\u0000\u0000ST\u0007\u0000\u0000\u0000T\u000f\u0001\u0000\u0000\u0000"+
		"UZ\u0003\u000e\u0007\u0000VW\u0005\u0003\u0000\u0000WY\u0003\u0012\t\u0000"+
		"XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000]^\u0003\u000e\u0007\u0000^\u0013\u0001\u0000\u0000"+
		"\u0000_`\u0003\u000e\u0007\u0000`a\u0005\u0010\u0000\u0000ad\u0003\u000e"+
		"\u0007\u0000bc\u0005\u000f\u0000\u0000ce\u0003\u0014\n\u0000db\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\u0015\u0001\u0000\u0000\u0000"+
		"\b\u0019$+;CQZd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}