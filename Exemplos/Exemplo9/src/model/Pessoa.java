package model;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(int idade) {
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade >= 0 ? idade : 0 ;
    }
}
