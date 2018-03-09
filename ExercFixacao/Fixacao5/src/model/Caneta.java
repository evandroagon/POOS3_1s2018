package model;

public class Caneta {
    public static final int AZUL = 0;
    public static final int VERMELHA = 1;
    public static final int PRETA = 2;
    public static final int ESFEROGRAFICA = 0;
    public static final int TINTEIRO = 1;
    private final double CONSUMO_ESFEROGRAFICA = 0.00001;
    private final double CONSUMO_TINTEIRO = 0.001;

    private int cor;
    private double carga;
    private boolean tampa;
    private int tipo;

    public Caneta(int cor, double carga, boolean tampa, int tipo) {
        this.cor = cor;
        this.carga = carga;
        this.tampa = tampa;
        this.tipo = tipo;
    }

    public boolean escrevePalavra(String palavra){
        int tamanho;
        double consumo=0;
        boolean escreve;

        tamanho = palavra.length();
        switch (tipo){
            case ESFEROGRAFICA:
                consumo = tamanho * CONSUMO_ESFEROGRAFICA;
                break;
            case TINTEIRO:
                consumo = tamanho * CONSUMO_TINTEIRO;
        }
        if(consumo < carga){
            carga -= consumo;
            escreve = true;
        }else{
            escreve = false;
        }
        return escreve;
    }

    public String writeWord(String palavra){
        int tamanho;
        double consumo=0, porPalavra=0;
        boolean escreve;

        tamanho = palavra.length();
        switch (tipo){
            case ESFEROGRAFICA:
                consumo = tamanho * CONSUMO_ESFEROGRAFICA;
                porPalavra = CONSUMO_ESFEROGRAFICA;
                break;
            case TINTEIRO:
                consumo = tamanho * CONSUMO_TINTEIRO;
                porPalavra = CONSUMO_TINTEIRO;
        }
        if(consumo < carga){
            carga -= consumo;
        }else{
            palavra = palavra.substring(0, (int) (carga/porPalavra));
        }
        return palavra;
    }
}
