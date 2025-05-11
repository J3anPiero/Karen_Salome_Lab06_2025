	package actividad3;
	import actividad1.ExceptionIsEmpty;
	
	public class Test {
	    public static void main(String[] args) {
	        try {
	            PriorityQueue<String, Integer> pq = new PriorityQueueLinkSort<>();
	
	            pq.enqueue("correo urgente", 5);
	            pq.enqueue("tarea regular", 2);
	            pq.enqueue("mensaje importante", 4);
	            pq.enqueue("spam", 1);
	
	            System.out.println("Cola de prioridad:");
	            System.out.println(pq);
	
	            System.out.println("Elemento con mayor prioridad (front): " + pq.front());
	            System.out.println("Elemento con menor prioridad (back): " + pq.back());
	
	            pq.dequeue();
	            System.out.println("Después de hacer dequeue:");
	            System.out.println(pq);
	
	        } catch (ExceptionIsEmpty e) {
	            System.out.println("Excepción atrapada: " + e.getMessage());
	        }
	    }
	}
