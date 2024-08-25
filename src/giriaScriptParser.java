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
		STR=20, WS=21, ERROR=22;
	public static final int
		RULE_start = 0, RULE_declaracao = 1, RULE_algoritmo = 2, RULE_instr = 3, 
		RULE_atrib = 4, RULE_interc = 5, RULE_acao = 6, RULE_valores = 7, RULE_operacao = 8, 
		RULE_condicao = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaracao", "algoritmo", "instr", "atrib", "interc", "acao", 
			"valores", "operacao", "condicao"
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
			"STR", "WS", "ERROR"
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
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InicializacaoContext extends StartContext {
		public TerminalNode EOF() { return getToken(giriaScriptParser.EOF, 0); }
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public InicializacaoContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitInicializacao(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			_localctx = new InicializacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COD) {
				{
				setState(20);
				declaracao();
				setState(21);
				algoritmo();
				}
			}

			setState(25);
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
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoInicialContext extends DeclaracaoContext {
		public TerminalNode COD() { return getToken(giriaScriptParser.COD, 0); }
		public TerminalNode ID() { return getToken(giriaScriptParser.ID, 0); }
		public BlocoInicialContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterBlocoInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitBlocoInicial(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			_localctx = new BlocoInicialContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(COD);
			setState(28);
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
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
	 
		public AlgoritmoContext() { }
		public void copyFrom(AlgoritmoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoFuncionalContext extends AlgoritmoContext {
		public TerminalNode AB() { return getToken(giriaScriptParser.AB, 0); }
		public TerminalNode FB() { return getToken(giriaScriptParser.FB, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public BlocoFuncionalContext(AlgoritmoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterBlocoFuncional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitBlocoFuncional(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_algoritmo);
		int _la;
		try {
			_localctx = new BlocoFuncionalContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(AB);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				instr();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 132036L) != 0) );
			setState(36);
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
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
	 
		public InstrContext() { }
		public void copyFrom(InstrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncionalidadesContext extends InstrContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public IntercContext interc() {
			return getRuleContext(IntercContext.class,0);
		}
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public FuncionalidadesContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterFuncionalidades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitFuncionalidades(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instr);
		try {
			_localctx = new FuncionalidadesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPOS:
			case ID:
				{
				setState(38);
				atrib();
				}
				break;
			case ESC:
			case LEIT:
				{
				setState(39);
				interc();
				}
				break;
			case ER:
			case EC:
				{
				setState(40);
				acao();
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
	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends AtribContext {
		public TerminalNode TIPOS() { return getToken(giriaScriptParser.TIPOS, 0); }
		public TerminalNode ID() { return getToken(giriaScriptParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(giriaScriptParser.ATRIB, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode FL() { return getToken(giriaScriptParser.FL, 0); }
		public AtribuicaoContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atrib);
		try {
			_localctx = new AtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(43);
				match(TIPOS);
				setState(44);
				match(ID);
				setState(45);
				match(ATRIB);
				setState(46);
				operacao();
				setState(47);
				match(FL);
				}
				break;
			case 2:
				{
				setState(49);
				match(TIPOS);
				setState(50);
				match(ID);
				setState(51);
				match(FL);
				}
				break;
			case 3:
				{
				setState(52);
				match(ID);
				setState(53);
				match(ATRIB);
				setState(54);
				operacao();
				setState(55);
				match(FL);
				}
				break;
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
	public static class IntercContext extends ParserRuleContext {
		public IntercContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interc; }
	 
		public IntercContext() { }
		public void copyFrom(IntercContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InteracaoContext extends IntercContext {
		public TerminalNode ESC() { return getToken(giriaScriptParser.ESC, 0); }
		public TerminalNode ID() { return getToken(giriaScriptParser.ID, 0); }
		public TerminalNode FL() { return getToken(giriaScriptParser.FL, 0); }
		public TerminalNode LEIT() { return getToken(giriaScriptParser.LEIT, 0); }
		public InteracaoContext(IntercContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterInteracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitInteracao(this);
		}
	}

	public final IntercContext interc() throws RecognitionException {
		IntercContext _localctx = new IntercContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interc);
		try {
			_localctx = new InteracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESC:
				{
				setState(59);
				match(ESC);
				setState(60);
				match(ID);
				setState(61);
				match(FL);
				}
				break;
			case LEIT:
				{
				setState(62);
				match(LEIT);
				setState(63);
				match(ID);
				setState(64);
				match(FL);
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
	public static class AcaoContext extends ParserRuleContext {
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
	 
		public AcaoContext() { }
		public void copyFrom(AcaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends AcaoContext {
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
		public FuncaoContext(AcaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitFuncao(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_acao);
		try {
			_localctx = new FuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ER:
				{
				setState(67);
				match(ER);
				setState(68);
				match(AP);
				setState(69);
				condicao();
				setState(70);
				match(FP);
				setState(71);
				algoritmo();
				}
				break;
			case EC:
				{
				setState(73);
				match(EC);
				setState(74);
				match(AP);
				setState(75);
				condicao();
				setState(76);
				match(FP);
				setState(77);
				algoritmo();
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
	public static class ValoresContext extends ParserRuleContext {
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
	 
		public ValoresContext() { }
		public void copyFrom(ValoresContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TiposValoresContext extends ValoresContext {
		public TerminalNode ID() { return getToken(giriaScriptParser.ID, 0); }
		public TerminalNode NUM() { return getToken(giriaScriptParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(giriaScriptParser.BOOL, 0); }
		public TerminalNode STR() { return getToken(giriaScriptParser.STR, 0); }
		public TiposValoresContext(ValoresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterTiposValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitTiposValores(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valores);
		int _la;
		try {
			_localctx = new TiposValoresContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
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
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
	 
		public OperacaoContext() { }
		public void copyFrom(OperacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoMaquinaContext extends OperacaoContext {
		public List<ValoresContext> valores() {
			return getRuleContexts(ValoresContext.class);
		}
		public ValoresContext valores(int i) {
			return getRuleContext(ValoresContext.class,i);
		}
		public List<TerminalNode> ARIT() { return getTokens(giriaScriptParser.ARIT); }
		public TerminalNode ARIT(int i) {
			return getToken(giriaScriptParser.ARIT, i);
		}
		public OperacaoMaquinaContext(OperacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterOperacaoMaquina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitOperacaoMaquina(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacao);
		int _la;
		try {
			_localctx = new OperacaoMaquinaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(83);
			valores();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARIT) {
				{
				{
				setState(84);
				match(ARIT);
				setState(85);
				valores();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	 
		public CondicaoContext() { }
		public void copyFrom(CondicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoCondicinaMaquinaContext extends CondicaoContext {
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
		public OperacaoCondicinaMaquinaContext(CondicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).enterOperacaoCondicinaMaquina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof giriaScriptListener ) ((giriaScriptListener)listener).exitOperacaoCondicinaMaquina(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicao);
		int _la;
		try {
			_localctx = new OperacaoCondicinaMaquinaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			valores();
			setState(92);
			match(RELAC);
			setState(93);
			valores();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGIC) {
				{
				setState(94);
				match(LOGIC);
				setState(95);
				condicao();
				}
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
		"\u0004\u0001\u0016c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0018\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0004\u0002!\b\u0002\u000b\u0002\f\u0002\"\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003*\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005B\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006P\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\bW\b\b\n\b\f\bZ\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\ta\b\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0001\u0001\u0000\u0011\u0014b\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000"+
		"\u0000\u0006)\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nA\u0001"+
		"\u0000\u0000\u0000\fO\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000"+
		"\u0000\u0010S\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016"+
		"\u0018\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0005\u0011\u0000\u0000\u001d"+
		"\u0003\u0001\u0000\u0000\u0000\u001e \u0005\n\u0000\u0000\u001f!\u0003"+
		"\u0006\u0003\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$%\u0005\u000b\u0000\u0000%\u0005\u0001\u0000\u0000\u0000"+
		"&*\u0003\b\u0004\u0000\'*\u0003\n\u0005\u0000(*\u0003\f\u0006\u0000)&"+
		"\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0005\u0002\u0000\u0000,-\u0005"+
		"\u0011\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0003\u0010\b\u0000/0\u0005"+
		"\u000e\u0000\u00000:\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u0000"+
		"23\u0005\u0011\u0000\u00003:\u0005\u000e\u0000\u000045\u0005\u0011\u0000"+
		"\u000056\u0005\u0004\u0000\u000067\u0003\u0010\b\u000078\u0005\u000e\u0000"+
		"\u00008:\u0001\u0000\u0000\u00009+\u0001\u0000\u0000\u000091\u0001\u0000"+
		"\u0000\u000094\u0001\u0000\u0000\u0000:\t\u0001\u0000\u0000\u0000;<\u0005"+
		"\b\u0000\u0000<=\u0005\u0011\u0000\u0000=B\u0005\u000e\u0000\u0000>?\u0005"+
		"\t\u0000\u0000?@\u0005\u0011\u0000\u0000@B\u0005\u000e\u0000\u0000A;\u0001"+
		"\u0000\u0000\u0000A>\u0001\u0000\u0000\u0000B\u000b\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0006\u0000\u0000DE\u0005\f\u0000\u0000EF\u0003\u0012\t"+
		"\u0000FG\u0005\r\u0000\u0000GH\u0003\u0004\u0002\u0000HP\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u0007\u0000\u0000JK\u0005\f\u0000\u0000KL\u0003\u0012\t"+
		"\u0000LM\u0005\r\u0000\u0000MN\u0003\u0004\u0002\u0000NP\u0001\u0000\u0000"+
		"\u0000OC\u0001\u0000\u0000\u0000OI\u0001\u0000\u0000\u0000P\r\u0001\u0000"+
		"\u0000\u0000QR\u0007\u0000\u0000\u0000R\u000f\u0001\u0000\u0000\u0000"+
		"SX\u0003\u000e\u0007\u0000TU\u0005\u0003\u0000\u0000UW\u0003\u000e\u0007"+
		"\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0011\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005\u0010\u0000"+
		"\u0000]`\u0003\u000e\u0007\u0000^_\u0005\u000f\u0000\u0000_a\u0003\u0012"+
		"\t\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\u0013\u0001"+
		"\u0000\u0000\u0000\b\u0017\")9AOX`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}