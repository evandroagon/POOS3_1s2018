package model;

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

    @Override
    public String toString() {
        return "Funcionário: " + this.nome + " \nSalário: R$ " + this.salario;
    }
}


