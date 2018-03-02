import java.util.Scanner;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public void reajustarSalario(int reajuste){
        if(reajuste > 0)
            this.salario += this.salario * reajuste/100;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setSalario(double salario) {
        this.salario = salario >= 0? salario : 0;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public static void main(String args[]){
        Scanner scanner;
        Funcionario funcionario;
        String nome;
        double sal;
        int reaj, i;
        scanner = new Scanner(System.in);

        funcionario = new Funcionario();
        for(i=0; i<10; i++){
            System.out.println("Funcionário " + (i+1));
            System.out.println("Nome: ");
            nome = scanner.nextLine();
            System.out.println("Salario: ");
            sal = scanner.nextDouble();
            System.out.println("Reajuste: ");
            reaj = scanner.nextInt();
            funcionario.setNome(nome);
            funcionario.setSalario(sal);
            funcionario.reajustarSalario(reaj);
            System.out.println("Salario reajustado de " + nome + ": " + funcionario.getSalario());
        }
    }
}


