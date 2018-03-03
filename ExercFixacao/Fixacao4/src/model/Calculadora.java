package model;

public class Calculadora {
    public static final char OPERADOR_SOMA = '+';
    public static final char OPERADOR_SUBTRACAO = '-';
    public static final char OPERADOR_MULTIPLICACAO = '*';
    public static final char OPERADOR_DIVISAO = '/';

    private int memory;

    public Calculadora() {
        memory = 0;
    }

    public void limparMemoria(){
        memory = 0;
    }

    public int calcular(int operando, char operador){
        switch (operador){
            case OPERADOR_SOMA:
                memory = soma(operando);
                break;
            case OPERADOR_SUBTRACAO:
                memory = subtrai(operando);
                break;
            case OPERADOR_MULTIPLICACAO:
                memory = multiplica(operando);
                break;
            case OPERADOR_DIVISAO:
                memory = divisao(operando);
        }
        return memory;
    }

    private int soma(int n){
        return memory + n;
    }

    private int subtrai(int n){
        return memory - n;
    }

    private int multiplica(int n){
        return memory * n;
    }

    private int divisao(int n){
        return n!=0 ? memory/n : 0;
    }
}
