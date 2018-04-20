package composicao.model;

public class Nota {

    private String Descricao;
    private double valor;
    private double peso;

    public Nota(String descricao, double valor, double peso) {
        Descricao = descricao;
        this.valor = valor;
        this.peso = peso;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
