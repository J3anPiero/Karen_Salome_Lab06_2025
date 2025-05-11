package actividad2;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        try {
            // Cola de Strings
            Queue<String> colaCadenas = new QueueLink<>();
            colaCadenas.enqueue("uno");
            colaCadenas.enqueue("dos");
            colaCadenas.enqueue("tres");
            System.out.println("Cola de Strings: " + colaCadenas);
            System.out.println("Frente: " + colaCadenas.front());
            System.out.println("Final: " + colaCadenas.back());
            colaCadenas.dequeue();
            System.out.println("Cola después de dequeue: " + colaCadenas);

            // Cola de enteros
            Queue<Integer> colaEnteros = new QueueLink<>();
            colaEnteros.enqueue(100);
            colaEnteros.enqueue(200);
            System.out.println("\nCola de enteros: " + colaEnteros);
            colaEnteros.dequeue();
            System.out.println("Después de dequeue: " + colaEnteros);
            System.out.println("¿Está vacía?: " + colaEnteros.isEmpty());

            // Cola vacía
            Queue<Double> colaDoubles = new QueueLink<>();
            System.out.println("\n¿Cola vacía?: " + colaDoubles.isEmpty());

        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}
