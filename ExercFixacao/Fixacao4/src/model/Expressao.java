package model;

public class Expressao {

    private int op1;
    private int op2;
    private char operador;

    public int getOp1() {
        return op1;
    }

    public int getOp2() {
        return op2;
    }

    public char getOperador() {
        return operador;
    }

    public boolean StrToExpressao(String expressao){
        boolean deuCerto = true;
        int posicaoOperador;
        String nro1, nro2;

        if(expressao.length() >= 3) {
            posicaoOperador = expressao.indexOf(Calculadora.OPERADOR_SOMA);
            operador = Calculadora.OPERADOR_SOMA;
            if (posicaoOperador == -1) {
                posicaoOperador = expressao.indexOf(Calculadora.OPERADOR_SUBTRACAO);
                operador = Calculadora.OPERADOR_SUBTRACAO;
                if (posicaoOperador == -1) {
                    posicaoOperador = expressao.indexOf(Calculadora.OPERADOR_MULTIPLICACAO);
                    operador = Calculadora.OPERADOR_MULTIPLICACAO;
                    if (posicaoOperador == -1) {
                        posicaoOperador = expressao.indexOf(Calculadora.OPERADOR_DIVISAO);
                        operador = Calculadora.OPERADOR_DIVISAO;
                    }
                }
            }
            if (posicaoOperador != -1) {
                nro1 = expressao.substring(0, posicaoOperador);
                nro2 = expressao.substring(posicaoOperador+1);
                try{
                    op1 = Integer.parseInt(nro1);
                    op2 = Integer.parseInt(nro2);
                    deuCerto = true;
                }catch (Exception exception){
                    System.out.println("Erro");
                }
            }
        }
        return deuCerto;
    }
}
