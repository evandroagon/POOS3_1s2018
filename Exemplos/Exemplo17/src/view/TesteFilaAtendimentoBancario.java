package view;

import model.Cliente;
import model.FilaAtendimentoBancario;

public class TesteFilaAtendimentoBancario {
    public static void main(String[] args) {
        FilaAtendimentoBancario<Cliente> fila = new FilaAtendimentoBancario();
        boolean flag;

        fila.enqueue(new Cliente(1, false));
        fila.enqueue(new Cliente(2, true));
        fila.enqueue(new Cliente(3, false));
        fila.enqueue(new Cliente(4, false));
        fila.enqueue(new Cliente(5, false));
        fila.enqueue(new Cliente(6, false));
        fila.enqueue(new Cliente(7, true));
        fila.enqueue(new Cliente(8, false));
        fila.enqueue(new Cliente(9, false));
        fila.enqueue(new Cliente(10, false));
        fila.enqueue(new Cliente(11, false));
        fila.enqueue(new Cliente(12, false));
        fila.enqueue(new Cliente(13, true));
        fila.enqueue(new Cliente(14, false));
        fila.enqueue(new Cliente(15, false));
        fila.enqueue(new Cliente(16, false));
        fila.enqueue(new Cliente(17, true));
        fila.enqueue(new Cliente(18, false));
        fila.enqueue(new Cliente(19, false));
        fila.enqueue(new Cliente(20, false));

        flag = true;
        Cliente c;
        while(!fila.isEmpty()){
            if(flag){
                c = fila.dequeuePrioritario();
                flag = false;
            }else{
                c = fila.dequeue();
                flag = true;
            }

            if(c != null)
                System.out.println(c.toString());
        }


    }


}
