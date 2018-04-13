package fila;

public interface Fila<T> {

    /**
     * Insere elemento no final da fila.
     * @param elemento
     * @return
     */
    public boolean enqueue(T elemento);

    /**
     * Remove o primeiro elemento da fila e o retorna.
     * @return objeto da fila
     */
    T dequeue();

    /**
     * Informa se a fila está vazia.
     * @return
     */
    boolean isEmpty();

    /**
     * Informa se a fila está cheia.
     * @return
     */
    boolean isFull();
}
