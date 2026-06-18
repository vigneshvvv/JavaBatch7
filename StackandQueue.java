package sample;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

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
		
		
		
		
		
		
		
		
		
		
		
	}

}
