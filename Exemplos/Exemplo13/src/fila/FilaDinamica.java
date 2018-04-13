package fila;

public class FilaDinamica<T> implements Fila<T> {

    private Node<T> head;
    private Node<T> tail;

    public FilaDinamica() {
        head = null;
        tail = null;
    }

    @Override
    public boolean enqueue(T elemento) {
        boolean deuCerto = false;
        if(!isFull() && elemento != null){
            if(isEmpty()){
                head = new Node<>(elemento);
                tail = head;
            }else{
                Node<T> node = new Node<>(elemento);
                tail.setNext(node);
                tail = node;
            }
            deuCerto = true;
        }
        return deuCerto;
    }

    @Override
    public T dequeue() {
        T objeto = null;
        if(!isEmpty()){
            objeto = head.getInformacao();
            head = head.getNext();
            if (head == null){
                tail = null;
            }
        }
        return objeto;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
