import java.util.Scanner;

/*Classe com a implementação errada. Ela foi base para a aula.*/

public class Funcionario1 {
    private String nome;
    private double salario;
    private int reajuste;

    public Funcionario1(String argNome, double argSalario, int argReajuste) {
        nome = argNome;
        salario = argSalario;
        reajuste = argReajuste;
    }

    public double salarioReajustado() {
        salario *= 1 + (reajuste / 100.0);
        return salario;
    }

    public static void main(String args[]){
        Scanner scanner;
        Funcionario1 funcionario;
        String nome;
        double sal;
        int reaj;
        scanner = new Scanner(System.in);


        System.out.println("Nome: ");
        nome = scanner.nextLine();
        System.out.println("Salario: ");
        sal = scanner.nextDouble();
        System.out.println("Reajuste: ");
        reaj = scanner.nextInt();
        funcionario = new Funcionario1(nome, sal, reaj);
        System.out.println("Salario reajustado de " + nome + ": " + funcionario.salarioReajustado());
        System.out.println("Salario reajustado de " + nome + ": " + funcionario.salarioReajustado());
        System.out.println("Salario reajustado de " + nome + ": " + funcionario.salarioReajustado());
    }

}