package fila;

import model.FilaComPrioridade;

public class FilaEstatica<T> implements Fila<T>, FilaComPrioridade {

    private Object elementos[];
    private int maximo;
    private int tamanhoAtual;

    /**
     * Define o tamanho máximo da fila. Caso o argumento não seja um inteiro positivo define-se
     * uma fila padrão com 100 elementos.
     *
     * @param maximo inteiro positivo maior que zero. Valor mínimo aceito é 2;
     */
    public FilaEstatica(int maximo) {
        this.maximo = maximo > 1?maximo:2;
        init();
    }

    /**
     * Define uma fila com 2 elementos.
     */
    public FilaEstatica(){
        this.maximo = 2;
        init();
    }


    private void init(){
        elementos = new Object[maximo];
        tamanhoAtual = 0;
    }

    @Override
    public boolean enqueue(T elemento) {
        boolean deuCerto = false;
        if(!isFull() && elemento != null){
            elementos[tamanhoAtual] = elemento;
            tamanhoAtual += 1;
            deuCerto = true;
        }
        return deuCerto;
    }

    @Override
    public T dequeue() {
        T objeto = null;
        if(!isEmpty()){
            objeto = (T)elementos[0];
            for(int i=1; i<tamanhoAtual; i++){
                elementos[i-1] = elementos[i];
            }
            tamanhoAtual-=1;
        }
        return objeto;
    }

    @Override
    public boolean isEmpty() {
        return tamanhoAtual == 0;
    }

    @Override
    public boolean isFull() {
        return tamanhoAtual == maximo;
    }

    @Override
    public Object dequeuePrioritario() {
        return null;
    }
}
