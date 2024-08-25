import Util.Tipagem;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends giriaScriptBaseListener{

    private Map<String, Tipagem> tabelaSimbolos = new HashMap<String, Tipagem>();
    //Caso queira verificar tipos criar um Hash com cada um relacionado a um tipo

    @Override
    public void enterAtribuicao(giriaScriptParser.AtribuicaoContext ctx) {
        System.out.println("Será atribuido: " + ctx.getText());
    }

    @Override
    public void exitAtribuicao(giriaScriptParser.AtribuicaoContext ctx) {
        if(ctx.TIPOS()!=null) { //Com tipo declarado
            String tipo = ctx.TIPOS().getText();
            String ident = ctx.ID().getText();
            if (tabelaSimbolos.containsKey(ident)) { //Verifica se ja existe
                throw new RuntimeException("Declaração duplicada! Variável: " + ident + " já declarada");
            } else {
                 if(ctx.valores() != null){ //para caso ao declara receba um valor
                     String valor = ctx.valores().getText();
                     Tipagem tipagem = Tipagem.confereTipo(tipo, valor) ;
                     if(tipagem == null){
                         throw new RuntimeException("Tipo incompativel");
                    }
                 }
                 tabelaSimbolos.put(ident, Tipagem.getTipagem(tipo));
            }
            System.out.println("Tipo: " + tipo + "\nIdentificador: " + ident);
        }else { //Caso de operação
            String ident = ctx.ID().getText();
            if (!tabelaSimbolos.containsKey(ident)) { //Verifica se ja existe
                throw new RuntimeException("Variável: " + ident + " não foi declarada!");
            }
        }
    }

    //Variavel não declarada
    @Override
    public void enterOperacaoMaquina(giriaScriptParser.OperacaoMaquinaContext ctx) {
        System.out.println("Operacao: " + ctx.getText());
    }

    @Override
    public void exitOperacaoCondicinaMaquina(giriaScriptParser.OperacaoCondicinaMaquinaContext ctx) {
        System.out.println("Condicional: " + ctx.getText());
        List<giriaScriptParser.ValoresContext> valores = ctx.valores(); //criar uma label para verificar valores
        for (giriaScriptParser.ValoresContext valorCtx : valores) {
            String valor = valorCtx.getText();
            if(tabelaSimbolos.containsKey(valor)){
                throw new RuntimeException("Variável: " + valor + " não foi declarada!");
            }
            }
    }

    @Override
    public void exitOperacaoMaquina(giriaScriptParser.OperacaoMaquinaContext ctx) {
        System.out.println("Executando: " + ctx.getText());
    }

    @Override
    public void exitOperacaoMaquinaFim(giriaScriptParser.OperacaoMaquinaFimContext ctx) {
        System.out.println("Executando: " + ctx.getText());
    }

    //Verificacao de tipo

}