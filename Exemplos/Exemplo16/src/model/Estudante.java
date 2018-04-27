package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Estudante {
    private int prontuario;
    private String nome;
    private List<Nota> notas;

    public Estudante(int prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
        notas = new Vector<>(4);
    }

    public void limparNotas(){
        notas.clear();
    }

    public void addNota(double valor, double porcentagem){
        notas.add(new Nota(valor, porcentagem));
    }

    public void addNota(int nota, double valor, double porcentagem){
        notas.add(nota, new Nota(valor, porcentagem));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno: ");
        sb.append(getNome());
        sb.append("\nProntuário: ");
        sb.append(getProntuario());
        sb.append("\nNotas:");
        for (Nota n:notas) {
            sb.append("\nValor: ");
            sb.append(n.getNota());
            sb.append("\tPorcentagem: ");
            sb.append(n.getPorcentagem());
            sb.append("%");
        }
        return sb.toString();
    }

    public double media(){
        double soma=0;
        for(Nota n : notas){
            soma += n.parcial();
        }
        return soma;
    }

//    public double media(){
//        double soma=0;
//        for(int i=0; i<notas.size(); i++){
//            soma += notas.get(i).parcial();
//        }
//        return soma;
//    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
