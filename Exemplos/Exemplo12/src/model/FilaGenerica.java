package model;

public interface FilaGenerica<T> {

    public boolean enqueue(T c);

    public T dequeue();

    public boolean isFull();

    public boolean isEmpty();
}
