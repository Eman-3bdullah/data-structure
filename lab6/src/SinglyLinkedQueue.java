
public class SinglyLinkedQueue <E> implements Queue<E> {

    SinglyLinkedList<E> L = new SinglyLinkedList<E>();


    @Override
    public boolean isEmpty() {
        return L.isEmpty();
    }

    @Override
    public int size() {
        return L.Size();
    }

    @Override
    public void enqueue(E element) {
        L.addLast(element);
    }

    @Override
    public E dequeue() {
        return L.removeFirst();
    }

    @Override
    public E first() {
        return L.first();
    }
}
