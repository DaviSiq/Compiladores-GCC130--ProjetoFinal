import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class ExemploLexer {
    public static void main(String args[]) {

        System.out.println("Compiladores - Projeto Final");
        //Coloque o path do arquivo de teste da sua maquina aqui.
        String filename = "C:\\Users\\marci\\Desktop\\Faculdade\\Compiladores\\Compiladores-GCC130--ProjetoFinal\\casosTeste\\variavelDuplicada giriaScript.txt";

        try {
            CharStream input = CharStreams.fromFileName(filename);
            giriaScriptLexer lexer = new giriaScriptLexer(input);

            //Etapa 2
            CommonTokenStream tokens = new CommonTokenStream(lexer); //Extrai um fluxo de token
            giriaScriptParser parser = new giriaScriptParser(tokens);
            ParserRuleContext ast = parser.start(); // Gera minha arvore de simbolos a partir do simbolo inicial

            // Obtém a árvore de análise sintática a partir da regra 'inicio'
            // System.out.println(ast.toStringTree(parser));

            //Etapa 3
            MyListener myListener = new MyListener();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(myListener, ast);

            //Imprime a tabela de simbolos
            System.out.println(myListener.tabelaSimbolos.toString());


        }
        catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
