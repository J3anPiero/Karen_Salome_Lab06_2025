package ejercicio2;

import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        try {
            Queue<Integer> colaEnteros = new QueueArray<>(5);
            colaEnteros.enqueue(1);
            colaEnteros.enqueue(2);
            colaEnteros.enqueue(3);

            System.out.println("Cola de enteros:");
            System.out.println(colaEnteros);
            System.out.println("Frente: " + colaEnteros.front());
            System.out.println("Final: " + colaEnteros.back());

            colaEnteros.dequeue();
            System.out.println("Después de dequeue:");
            System.out.println(colaEnteros);

            Queue<String> colaCadenas = new QueueArray<>(3);
            colaCadenas.enqueue("A");
            colaCadenas.enqueue("B");

            System.out.println("\nCola de cadenas:");
            System.out.println(colaCadenas);

        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}