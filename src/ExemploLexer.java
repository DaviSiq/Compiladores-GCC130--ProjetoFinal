import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.IOException;

public class ExemploLexer {
    public static void main() {
        //Coloque o path do arquivo de teste da sua maquina aqui.
        String filename = "C:\\Insira\\Seu\\Path\\Compiladores-GCC130--ProjetoFinal\\casosTeste\\fatorial giriaScript.txt";

        try {
            CharStream input = CharStreams.fromFileName(filename);
            giriaScriptLexer lexer = new giriaScriptLexer(input);

            Token token;

            int errorFlag = 0;

            //Enquanto o lexer não atingir o final do arquivo ele mostra Token | Lexema | Classe no prompt
            while(!lexer._hitEOF) {
                token = lexer.nextToken();
                System.out.println("Token:" + token.toString());
                System.out.println("  Lexema: " + token.getText());
                System.out.println("  Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));

                if(lexer.getVocabulary().getDisplayName(token.getType()).equals("ERROR") ) {
                    errorFlag = 1;
                }
            }

            // Caso exista um erro ele avisa com uma mensagem ao final da leitura do arquivo
            if(errorFlag == 1) {
                System.out.println("Existe um erro no seu programa!");
            }

        }
        catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
