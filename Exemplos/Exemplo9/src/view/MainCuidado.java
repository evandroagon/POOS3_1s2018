package view;

import java.util.Scanner;
import model.Pessoa;

public class MainCuidado {
    public static final int MAXIMO = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoas[] = new Pessoa[MAXIMO];
        Pessoa p;
        int i;
        p = new Pessoa();
        for(i=0; i<MAXIMO; i++){
            p.setNome(input.nextLine());
            pessoas[i] = p;
        }
        System.out.println("Pessoas no array:");
        for(i=0;i<MAXIMO;i++){
            System.out.println(pessoas[i].getNome());
        }
    }
}
