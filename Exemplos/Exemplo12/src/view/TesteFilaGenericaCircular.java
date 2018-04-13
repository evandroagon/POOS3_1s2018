package view;

import model.Cliente;
import model.FilaGenericaCircular;

public class TesteFilaGenericaCircular {

    public static void main(String[] args) {
        FilaGenericaCircular<Cliente> fila = new FilaGenericaCircular<>();

        fila.enqueue(new Cliente(1, false));
        fila.enqueue(new Cliente(2, false));
        fila.enqueue(new Cliente(3, false));
        fila.enqueue(new Cliente(4, false));

        while(!fila.isEmpty()){
            System.out.println(fila.dequeue().toString());
        }
    }
}
