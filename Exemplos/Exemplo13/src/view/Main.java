package view;

import fila.Fila;
import fila.FilaDinamica;
import model.Livro;

public class Main {

    public static void main(String[] args) {
        FilaDinamica<Livro> queue = new FilaDinamica<Livro>();

        queue.enqueue(new Livro(1));
        queue.enqueue(new Livro(2));
        queue.enqueue(new Livro(3));
        queue.enqueue(new Livro(4));
        queue.enqueue(new Livro(5));

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue().getIsbn());
        }
    }
}
