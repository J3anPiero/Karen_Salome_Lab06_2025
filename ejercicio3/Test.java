package ejercicio3;

public class Test {
	    public static void main(String[] args) {
	        PriorityQueue<Character, Integer> q = new PriorityQueueLinkSort<>();
	        try {
	            q.enqueue('v', 4);
	            System.out.println("First: " + q.front() + "\tLast: " + q.back());
	            System.out.println(q);
	            q.enqueue('c', 3);
	            System.out.println("First: " + q.front() + "\tLast: " + q.back());
	            System.out.println(q);
	            q.enqueue('a', 1);
	            System.out.println("First: " + q.front() + "\tLast: " + q.back());
	            System.out.println(q);
	            q.enqueue('d', 2);
	            System.out.println("First: " + q.front() + "\tLast: " + q.back());
	            System.out.println(q);
	            q.enqueue('g', 4);
	            System.out.println("First: " + q.front() + "\tLast: " + q.back());
	            System.out.println(q);
	            q.enqueue('h', 1);
	            System.out.println("First: " + q.front() + "\tLast: " + q.back());
	            System.out.println(q);
	            q.dequeue();
	            System.out.println("First after dequeue: " + q.front() + "\tLast: " + q.back());
	            q.dequeue();
	            System.out.println("First after dequeue: " + q.front() + "\tLast: " + q.back());
	            q.dequeue();
	            System.out.println("First after dequeue: " + q.front() + "\tLast: " + q.back());
	            q.dequeue();
	            System.out.println("First after dequeue: " + q.front() + "\tLast: " + q.back());
	            q.dequeue();
	            System.out.println("First after dequeue: " + q.front() + "\tLast: " + q.back());
	                        q.dequeue();
	            System.out.println("First after dequeue: " + q.front() + "\tLast: " + q.back());
	        } catch (ExceptionIsEmpty e) {
	            System.out.println(e.getMessage());
	        }
	        
	        
	    }    
	}