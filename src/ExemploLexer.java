import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;

import java.io.IOException;

public class ExemploLexer {
    public static void main(String args[]) {

        System.out.println("Compiladores - Projeto Final");
        //Coloque o path do arquivo de teste da sua maquina aqui.
        String filename = "C:\\Users\\marci\\Desktop\\Faculdade\\Compiladores\\Compiladores-GCC130--ProjetoFinal\\src\\fatorial_giriaScript.txt";

        try {
            CharStream input = CharStreams.fromFileName(filename);
            giriaScriptLexer lexer = new giriaScriptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            giriaScriptParser parser = new giriaScriptParser(tokens);
            //Obtendo a arvore
            ParserRuleContext ast = parser.start();

            // Obtém a árvore de análise sintática a partir da regra 'inicio'
            System.out.println(ast.toStringTree(parser));
        }
        catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
