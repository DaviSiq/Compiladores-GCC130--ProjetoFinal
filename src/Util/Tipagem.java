package Util;

// deus sabe
public enum Tipagem {
    FIRME("\\d+"),          // Corresponde a um número inteiro (ex: 12345)
    MOLE("\\d+\\.\\d+"),    // Corresponde a um número com ponto flutuante (ex: 1234.12345)
    DUASCARA("(?i)dboa|judas"), // Corresponde a 'dboa' ou 'judas', insensível a maiúsculas e minúsculas
    LETRINHA("\"(\\\\[\"\\\\]|[^\"\\\\\\r\\n])*\""); // Corresponde a uma string entre aspas (ex: "letrinha")

    private final String regex;

    Tipagem(String regex) {
        this.regex = regex;
    }

    public boolean matches(String text) {
        return text.matches(this.regex);
    }

    public static Tipagem getTipagem(String nome) {
        return Tipagem.valueOf(nome.toUpperCase());
    }

    public static Tipagem confereTipo(String tipoValor, String valor) {
        for (Tipagem tipo : Tipagem.values()) {
            if (getTipagem(tipoValor)!=null) {
                if (tipo.matches(valor)) {
                    return tipo;
                }
            }
        }
        return null;
    }

    public static Tipagem confereDentreTipos(String valor){
        for(Tipagem tipo: Tipagem.values()){
            if(tipo.matches(valor)){
                return tipo;
            }
        }
        return null;
    }
}
