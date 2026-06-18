package sample;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(6);
		pq.add(12);
		pq.add(4);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		PriorityQueue<Integer> descOrder 
		= new PriorityQueue<>(Collections.reverseOrder());
		descOrder.add(10);
		descOrder.add(6);
		descOrder.add(12);
		descOrder.add(4);
		System.out.println(descOrder);	
		
	}

}








