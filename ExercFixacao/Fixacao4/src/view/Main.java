package view;

import model.Calculadora;
import model.Expressao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String txtEntrada = "";
        Scanner input = new Scanner(System.in);
        Expressao expressao = new Expressao();
        Calculadora maquina = new Calculadora();
        int resultado;

        System.out.println("Calculadora de POOS3 - 1s2018");
        System.out.println("Digite: <operando> <operador> <operando> <ENTER> para executar os cálculos\n \t Suporte para soma (+), subtração (-), multiplicação(*) e divisão (/) de inteiros.");
        System.out.println("Para sair digite: <quit>.");

        while( ! (txtEntrada = input.nextLine()).equals("quit")){
            if(expressao.StrToExpressao(txtEntrada)){
                maquina.calcular(expressao.getOp1(), Calculadora.OPERADOR_SOMA);
                resultado = maquina.calcular(expressao.getOp2(), expressao.getOperador());
                maquina.limparMemoria();
                System.out.println("Resultado: " + resultado);
            }
        }
    }

}
