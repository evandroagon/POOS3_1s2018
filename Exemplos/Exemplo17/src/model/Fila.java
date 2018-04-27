package model;

public interface Fila<T> {

    public boolean enqueue(T c);

    public T dequeue();

    public boolean isFull();

    public boolean isEmpty();
}
