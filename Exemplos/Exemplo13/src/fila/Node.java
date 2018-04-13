package fila;

import com.sun.istack.internal.NotNull;

public class Node<T> {
    private T informacao;
    private Node next;

    public Node(@NotNull T informacao) {
        this.informacao = informacao;
        this.next = null;
    }

    public T getInformacao() {
        return informacao;
    }

    public void setInformacao(T informacao) {
        this.informacao = informacao;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
