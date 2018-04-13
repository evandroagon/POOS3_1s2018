package model;

public abstract class Fila {

    public abstract boolean enqueue(Cliente c);

    public abstract Cliente dequeue();

    public abstract boolean isFull();

    public abstract boolean isEmpty();
}
