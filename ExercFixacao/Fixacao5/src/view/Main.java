package view;

import model.Caneta;

import java.util.Scanner;

public class Main {

    public static String PALAVRA = "java é melhor que python";


    public static void main(String[] args) {
        Scanner objLeitura = new Scanner(System.in);
        Caneta objBic, objCrown;
        String papel;
        int linha=0;
/*
        objBic = new Caneta(Caneta.PRETA, 1, true, Caneta.ESFEROGRAFICA);
        while (objBic.escrevePalavra(PALAVRA)){
            System.out.println("Linha: " + ++linha + " - " + PALAVRA);
        }
*/
        objCrown = new Caneta(Caneta.AZUL, 0.5, false, Caneta.TINTEIRO);
        do{
            papel = objCrown.writeWord(PALAVRA);
            System.out.println("Linha: " + ++linha + " - " + papel);
        }while (papel.equals(PALAVRA));

    }
}
