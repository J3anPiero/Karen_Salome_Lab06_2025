package actividad2;

import actividad1.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;

    public QueueLink() {
        this.first = null;
        this.last = null;
    }

    public void enqueue(E x) {
        Node<E> aux = new Node<>(x);
        if (this.isEmpty()) {
            this.first = aux;
        } else {
            this.last.setNext(aux);
        }
        this.last = aux;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty. Cannot dequeue.");
        }
        E value = this.first.getData();
        this.first = this.first.getNext();
        if (this.first == null) this.last = null; // se vació la cola
        return value;
    }

    public E front() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty. No front element.");
        }
        return this.first.getData();
    }

    public E back() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty. No back element.");
        }
        return this.last.getData();
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Front -> ");
        Node<E> current = this.first;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }
        sb.append("<- Back");
        return sb.toString().trim();
    }
}
