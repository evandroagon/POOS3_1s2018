package model;

public class FilaCircular extends Fila {

    private final int MAXIMO = 300;
    private Cliente[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaCircular() {
        elementos = new Cliente[MAXIMO];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    @Override
    public boolean enqueue(Cliente c) {
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

    @Override
    public Cliente dequeue() {
        Cliente c = null;
        if(!isEmpty()){
            c = elementos[inicio];
            tamanho = tamanho - 1;
            if(inicio == MAXIMO-1){
                inicio = 0;
            }else{
                inicio = inicio + 1;
            }
        }
        return c;
    }

    @Override
    public boolean isFull() {
        return tamanho == MAXIMO;
    }

    @Override
    public boolean isEmpty() {
        return tamanho == 0;
    }
}
