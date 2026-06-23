package sample;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class StackandQueue {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(15);
		stack.add(8);
		stack.add(20);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.indexOf(10));
		
		
		Queue<Integer> integers = new ArrayDeque<>();
		integers.add(10);
		integers.add(8);
		integers.add(20);
		System.out.println(integers.peek());
		System.out.println(integers.poll());
		System.out.println(integers.poll());
		
		
		TreeSet<Integer> integers2 = new TreeSet<>();
		integers2.add(20);
		integers2.add(30);
		integers2.add(10);
		integers2.add(50);
		integers2.add(5);
		integers2.add(10);

		
		System.out.println(integers2);
		
		Map<Integer, String> studentDetails = new HashMap<>();
		studentDetails.put(101, "Deva");
		studentDetails.put(102, "Revanth");
		studentDetails.put(103, "Subhash");
		System.out.println(studentDetails.get(103));
		
		
		for(Map.Entry<Integer, String> sample: studentDetails.entrySet()) {
			System.out.println(sample.getKey());
			System.out.println(sample.getValue());
		}
		
		for(Integer key: studentDetails.keySet()) {
			System.out.println("The Key is" + key);
		}
		
		
		
		
		
		
	}

}
