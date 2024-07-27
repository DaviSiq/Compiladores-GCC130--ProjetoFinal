// Generated from giriaScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link giriaScriptParser}.
 */
public interface giriaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(giriaScriptParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(giriaScriptParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(giriaScriptParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(giriaScriptParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(giriaScriptParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(giriaScriptParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(giriaScriptParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(giriaScriptParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(giriaScriptParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(giriaScriptParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#interc}.
	 * @param ctx the parse tree
	 */
	void enterInterc(giriaScriptParser.IntercContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#interc}.
	 * @param ctx the parse tree
	 */
	void exitInterc(giriaScriptParser.IntercContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(giriaScriptParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(giriaScriptParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(giriaScriptParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(giriaScriptParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(giriaScriptParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(giriaScriptParser.OperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#operando_cauda}.
	 * @param ctx the parse tree
	 */
	void enterOperando_cauda(giriaScriptParser.Operando_caudaContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#operando_cauda}.
	 * @param ctx the parse tree
	 */
	void exitOperando_cauda(giriaScriptParser.Operando_caudaContext ctx);
	/**
	 * Enter a parse tree produced by {@link giriaScriptParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(giriaScriptParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link giriaScriptParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(giriaScriptParser.CondicaoContext ctx);
}