package ejercicio2;

import actividad1.ExceptionIsEmpty;

public class QueueArray<E> implements Queue<E> {
    private E[] data;
    private int first;
    private int last;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.data = (E[]) new Object[capacity];
        this.first = 0;
        this.last = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(E x) {
        if (size == capacity) {
            throw new RuntimeException("Queue is full");
        }
        data[last] = x;
        last = (last + 1) % capacity;
        size++;
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Cannot dequeue from empty queue.");
        }
        E temp = data[first];
        data[first] = null; // limpieza opcional
        first = (first + 1) % capacity;
        size--;
        return temp;
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty.");
        }
        return data[first];
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("Queue is empty.");
        }
        return data[(last - 1 + capacity) % capacity];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Front -> ");
        for (int i = 0; i < size; i++) {
            sb.append(data[(first + i) % capacity]).append(" ");
        }
        sb.append("<- Back");
        return sb.toString().trim();
    }
}