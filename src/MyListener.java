import Util.Tipagem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends giriaScriptBaseListener{

    private Map<String, Tipagem> tabelaSimbolos = new HashMap<String, Tipagem>();

    public Map<String, Tipagem> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    @Override
    public void exitAtribuicao(giriaScriptParser.AtribuicaoContext ctx) {
        System.out.println("Atribuindo: " + ctx.getText());
        if(ctx.TIPOS()!=null) { //Com tipo declarado
            String tipo = ctx.TIPOS().getText();
            String ident = ctx.ID().getText();
            System.out.println("Tipo: " + tipo + "\nIdentificador: " + ident);
            if (tabelaSimbolos.containsKey(ident)) { //Verifica se ja existe
                throw new RuntimeException("Declaração duplicada! Variável: " + ident + " já declarada");
            } else {
                tabelaSimbolos.put(ident, Tipagem.getTipagem(tipo));
            }
        }else { //Caso de operação sem atribuição de tipo
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
        List<Tipagem> operacao = avaliaOperacaoTipos(ctx.valores()); //criar uma label para verificar valores
        Tipagem operacaoSemelhante = operacao.getFirst(); // verificar operacao compativel
        for (int i = 1; i < operacao.size(); i++) {
            if (!operacao.get(i).equals(operacaoSemelhante)) {
                System.out.println("Operação incompativel entre tipos " + operacao.get(i) + " " + operacaoSemelhante);
            }
        }
    }


    @Override
    public void exitOperacaoMaquina(giriaScriptParser.OperacaoMaquinaContext ctx) { //quando terminar este analisar se a operacao e compativel
        System.out.println("Executando Inico: " + ctx.getText());
        List<Tipagem> operacao = avaliaOperacaoTipos(ctx.valores()); //criar uma label para verificar valores
        Tipagem operacaoSemelhante = operacao.getFirst(); // verificar operacao compativel
        for (int i = 1; i < operacao.size(); i++) {
            if (!operacao.get(i).equals(operacaoSemelhante)) {
                System.out.println("Operação incompativel entre tipos " + operacao.get(i) + " " + operacaoSemelhante);
            }
        }
    }

    private List<Tipagem> avaliaOperacaoTipos(List<giriaScriptParser.ValoresContext> valores){
        List<Tipagem> operacao = new ArrayList<Tipagem>(); // variavel para verificar operacao
        for (giriaScriptParser.ValoresContext valorCtx : valores) {
            String valor = valorCtx.getText();
            Tipagem verificaTipo = Tipagem.confereDentreTipos(valor);
            if(verificaTipo!=null){ // verifica variável não declarada ou tipo incorreto
                operacao.add(verificaTipo);
                continue;
            }
            if(tabelaSimbolos.containsKey(valor)){
                operacao.add(tabelaSimbolos.get(valor));
                continue;
            }
            System.out.println("Não foi possivel resolver: " + valor);
        }
        return  operacao;
    }
}