package model;

public class FilaAtendimentoBancario<T>
        extends FilaGenericaCircular<T>
        implements FilaComPrioridade {


    @Override
    public Cliente dequeuePrioritario() {
        Cliente c = null;
        Cliente retorno =  null;
        int contador, diff;
        boolean achou;

        contador = 1;
        achou = false;
        while (contador <= getTamanho() && !achou){
            c = (Cliente) dequeue();
            contador++;
            if(c.isPreferencial()){
                retorno = c;
                achou = true;
            }else{
                enqueue((T) c);
            }
        }
        diff = (getTamanho() - contador)+1;
        while(diff >= 0){
            enqueue(dequeue());
            diff--;
        }

        return retorno;
    }
}
