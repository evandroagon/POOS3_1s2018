package model;

public abstract class Fila {

    /**
     * Insere um cliente no final da fila
     * @param item
     * @return
     */
    public abstract boolean enqueue(Cliente item);

    /**
     * Remove o primeiro Cliente da fila
     * @return
     */
    public abstract Cliente dequeue();

    /**
     * Remove o primeiro cliente prioritário da fila
     * @return
     */
    public abstract Cliente dequeuePrioritario();

    /**
     * Informa se a fila está ou não cheia
     * @return
     */
    public abstract boolean isFull();

    /**
     * Informa se a fila está vazia
     * @return
     */
    public abstract boolean isEmpty();

    /**
     * Informa a proxima senha para ser atribuída ao próximo cliente.
     * @return
     */
    public abstract int proximaSenha();


}
