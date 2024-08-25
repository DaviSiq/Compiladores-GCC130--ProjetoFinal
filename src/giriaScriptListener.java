// Generated from giriaScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link giriaScriptParser}.
 */
public interface giriaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Inicializacao}
	 * labeled alternative in {@link giriaScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void enterInicializacao(giriaScriptParser.InicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Inicializacao}
	 * labeled alternative in {@link giriaScriptParser#start}.
	 * @param ctx the parse tree
	 */
	void exitInicializacao(giriaScriptParser.InicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoInicial}
	 * labeled alternative in {@link giriaScriptParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterBlocoInicial(giriaScriptParser.BlocoInicialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoInicial}
	 * labeled alternative in {@link giriaScriptParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitBlocoInicial(giriaScriptParser.BlocoInicialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoFuncional}
	 * labeled alternative in {@link giriaScriptParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterBlocoFuncional(giriaScriptParser.BlocoFuncionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoFuncional}
	 * labeled alternative in {@link giriaScriptParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitBlocoFuncional(giriaScriptParser.BlocoFuncionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Funcionalidades}
	 * labeled alternative in {@link giriaScriptParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterFuncionalidades(giriaScriptParser.FuncionalidadesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcionalidades}
	 * labeled alternative in {@link giriaScriptParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitFuncionalidades(giriaScriptParser.FuncionalidadesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link giriaScriptParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(giriaScriptParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link giriaScriptParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(giriaScriptParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Interacao}
	 * labeled alternative in {@link giriaScriptParser#interc}.
	 * @param ctx the parse tree
	 */
	void enterInteracao(giriaScriptParser.InteracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Interacao}
	 * labeled alternative in {@link giriaScriptParser#interc}.
	 * @param ctx the parse tree
	 */
	void exitInteracao(giriaScriptParser.InteracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Funcao}
	 * labeled alternative in {@link giriaScriptParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(giriaScriptParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Funcao}
	 * labeled alternative in {@link giriaScriptParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(giriaScriptParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TiposValores}
	 * labeled alternative in {@link giriaScriptParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterTiposValores(giriaScriptParser.TiposValoresContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TiposValores}
	 * labeled alternative in {@link giriaScriptParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitTiposValores(giriaScriptParser.TiposValoresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoMaquina}
	 * labeled alternative in {@link giriaScriptParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoMaquina(giriaScriptParser.OperacaoMaquinaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoMaquina}
	 * labeled alternative in {@link giriaScriptParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoMaquina(giriaScriptParser.OperacaoMaquinaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoMaquinaFim}
	 * labeled alternative in {@link giriaScriptParser#operando_cauda}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoMaquinaFim(giriaScriptParser.OperacaoMaquinaFimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoMaquinaFim}
	 * labeled alternative in {@link giriaScriptParser#operando_cauda}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoMaquinaFim(giriaScriptParser.OperacaoMaquinaFimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacaoCondicinaMaquina}
	 * labeled alternative in {@link giriaScriptParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoCondicinaMaquina(giriaScriptParser.OperacaoCondicinaMaquinaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacaoCondicinaMaquina}
	 * labeled alternative in {@link giriaScriptParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoCondicinaMaquina(giriaScriptParser.OperacaoCondicinaMaquinaContext ctx);
}