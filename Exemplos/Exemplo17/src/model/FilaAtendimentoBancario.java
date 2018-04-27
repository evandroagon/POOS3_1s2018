package model;

import java.util.ArrayList;

public class FilaAtendimentoBancario<T> implements Fila<T>, FilaComPrioridade<T> {

    private ArrayList<T> elementos;

    public FilaAtendimentoBancario() {
        elementos = new ArrayList<>();
    }

    @Override
    public boolean enqueue(T c) {
        elementos.add(c);
        return true;
    }

    @Override
    public T dequeue() {
        T retorno = null;
        if(!elementos.isEmpty()){
            retorno = elementos.get(0);
            elementos.remove(retorno);
        }
        return retorno;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    @Override
    public T dequeuePrioritario() {
        T retorno = null;
        for(int i=0; i<elementos.size() && retorno == null; i++){
            Cliente c = (Cliente) elementos.get(i);
            if(c.isPreferencial()){
                retorno = elementos.get(i);
                elementos.remove(i);
            }
        }
        return retorno;
    }
}
