package model;

public class FilaGenericaCircular<T> implements FilaGenerica<T> {
    private final int MAXIMO = 300;
    private Object[] elementos;
    private int inicio, fim, tamanho;

    public FilaGenericaCircular() {
        elementos = new Object[MAXIMO];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    @Override
    public boolean enqueue(T c) {
        boolean deuCerto = false;
        if(!isFull() && c != null){
            if(fim == MAXIMO-1){
                fim = 0;
            }else{
                fim = fim + 1;
            }
            elementos[fim] = c;
            tamanho = tamanho + 1;
            deuCerto = true;
        }
        return deuCerto;
    }

    public T dequeue() {
        T c = null;
        if(!isEmpty()){
            c = (T)elementos[inicio];
            tamanho = tamanho - 1;
            if(inicio == MAXIMO-1){
                inicio = 0;
            }else{
                inicio = inicio + 1;
            }
        }
        return c;
    }

    public boolean isFull() {
        return tamanho == MAXIMO;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int getTamanho() {
        return tamanho;
    }
}
