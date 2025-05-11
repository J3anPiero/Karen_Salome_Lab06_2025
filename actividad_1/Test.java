package actividad1;

public class Test {
    public static void main(String[] args) {
        try {
            // Pila de enteros
            Stack<Integer> pilaEnteros = new StackArray<>(5);
            pilaEnteros.push(10);
            pilaEnteros.push(20);
            pilaEnteros.push(30);
            System.out.println("Pila de enteros: " + pilaEnteros);
            System.out.println("Elemento en el tope: " + pilaEnteros.top());
            System.out.println("Elemento extraído: " + pilaEnteros.pop());
            System.out.println("Pila después del pop: " + pilaEnteros);

            // Pila de Strings
            Stack<String> pilaCadenas = new StackArray<>(3);
            pilaCadenas.push("Hola");
            pilaCadenas.push("Mundo");
            System.out.println("\nPila de strings: " + pilaCadenas);
            System.out.println("Tope: " + pilaCadenas.top());
            pilaCadenas.pop();
            System.out.println("Después del pop: " + pilaCadenas);

            // Pila vacía
            Stack<Double> pilaVacia = new StackArray<>(2);
            System.out.println("\n¿Pila de doubles vacía?: " + pilaVacia.isEmpty());
            pilaVacia.push(3.14);
            System.out.println("¿Vacía después de push?: " + pilaVacia.isEmpty());

        } catch (ExceptionIsEmpty e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}

