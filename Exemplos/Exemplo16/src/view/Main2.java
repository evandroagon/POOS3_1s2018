package view;

import model.Estudante;

public class Main2 {
    public static void main(String[] args) {
        Estudante estudante;

        estudante = new Estudante(123, "Diego");
        estudante.addNota(5, 15);
        estudante.addNota(10, 5);
        estudante.addNota(0,3, 80);
        System.out.println(estudante.toString());
        System.out.println("Média: " + estudante.media());
    }
}
