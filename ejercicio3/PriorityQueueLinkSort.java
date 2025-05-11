package ejercicio3;



public class PriorityQueueLinkSort <E, N extends Comparable<N>> implements PriorityQueue<E,N> {
	class EntryNode {
        E data;
        N priority;

        EntryNode(E data, N priority) {
            this.data = data;
            this.priority = priority;
        }
        
    	@Override
        public String toString() {
    		return "(" + data.toString() + ", " + priority.toString() + ")";
            }
	}
	
	private Node<EntryNode> first;
	private Node<EntryNode> Last;
	
	public PriorityQueueLinkSort(){
		first = Last = null;
	
	}
	
	
	public void enqueue(E x, N pr) {
	    if (isEmpty()|| first.getData().priority.compareTo(pr) > 0) {
	        first = new Node <EntryNode>(new EntryNode(x,pr));
	        if(Last == null) {
	        	Last = first;
	        }
	    } 
	    else {
	        Node<EntryNode> i = first;
	        while (i.getNext() != null && i.getNext().getData().priority.compareTo(pr) >= 0) {
	            i = i.getNext();
	        }
	        i.setNext(new Node<EntryNode>(new EntryNode(x, pr), i.getNext()));
	        if(i.getNext().getNext() == null){
	        	Last = i.getNext();
	        	}
	        }
	    }
	
	 public E dequeue() throws ExceptionIsEmpty { 
		 if (isEmpty()) 
			 throw new ExceptionIsEmpty("removido");  
		 E aux = this.first.getData().data; 
		 this.first = this.first.getNext(); 
		 if (this.first == null) 
			 this.Last = null; 
		 return aux; 
		 } 
    
    public E front() throws ExceptionIsEmpty{
		if(isEmpty()){
			throw new ExceptionIsEmpty("Esta vacio");
		}
		return first.getData().data;
    	
    }
    public E back() throws ExceptionIsEmpty{
		if(isEmpty()){
			throw new ExceptionIsEmpty("Esta vacio");
		}
		return Last.getData().data;
    	
    }
    public boolean isEmpty() {
    	return first == null;
    }

    public String toString() {
        String str = "";
        for (Node<EntryNode> i = first; i != null; i = i.getNext())
            str += i.getData() + " ";
        return str.trim();
    }
}
    


