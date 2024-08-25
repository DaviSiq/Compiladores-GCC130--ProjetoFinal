// Generated from giriaScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link giriaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface giriaScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Inicializacao}
	 * labeled alternative in {@link giriaScriptParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacao(giriaScriptParser.InicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoInicial}
	 * labeled alternative in {@link giriaScriptParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoInicial(giriaScriptParser.BlocoInicialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoFuncional}
	 * labeled alternative in {@link giriaScriptParser#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoFuncional(giriaScriptParser.BlocoFuncionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Funcionalidades}
	 * labeled alternative in {@link giriaScriptParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionalidades(giriaScriptParser.FuncionalidadesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atribuicao}
	 * labeled alternative in {@link giriaScriptParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(giriaScriptParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Interacao}
	 * labeled alternative in {@link giriaScriptParser#interc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteracao(giriaScriptParser.InteracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Funcao}
	 * labeled alternative in {@link giriaScriptParser#acao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(giriaScriptParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TiposValores}
	 * labeled alternative in {@link giriaScriptParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiposValores(giriaScriptParser.TiposValoresContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoMaquina}
	 * labeled alternative in {@link giriaScriptParser#operacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoMaquina(giriaScriptParser.OperacaoMaquinaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacaoCondicinaMaquina}
	 * labeled alternative in {@link giriaScriptParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacaoCondicinaMaquina(giriaScriptParser.OperacaoCondicinaMaquinaContext ctx);
}