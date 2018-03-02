import java.util.Scanner;

public class Revisao1{

        public static void main(String args[]){
                Scanner input;
                int i;

                System.out.println("Digite um número inteiro: ");
                i = input.nextInt();
                for(; i>=0;){
                    System.out.println(i--);
                }
        }
}
