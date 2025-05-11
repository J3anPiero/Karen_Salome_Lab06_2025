package ejercicio1;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
        try {
            Stack<Integer> pilaEnteros = new StackLink<>();
            pilaEnteros.push(10);
            pilaEnteros.push(20);
            pilaEnteros.push(30);

            System.out.println("Pila de enteros:");
            System.out.println(pilaEnteros);
            System.out.println("Elemento tope: " + pilaEnteros.top());

            pilaEnteros.pop();
            System.out.println("Después de pop:");
            System.out.println(pilaEnteros);

            Stack<String> pilaCadenas = new StackLink<>();
            pilaCadenas.push("uno");
            pilaCadenas.push("dos");
            pilaCadenas.push("tres");

            System.out.println("\nPila de cadenas:");
            System.out.println(pilaCadenas);
            System.out.println("Elemento tope: " + pilaCadenas.top());

        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}