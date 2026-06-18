package sample;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		Set<Integer> sample = new HashSet<Integer>();
		sample.add(10);
		sample.add(20);
		sample.add(10);
		sample.add(30);
		
		System.out.println(sample);
		sample.remove(10);
		System.out.println(sample);
	

	}

	
	
	
	
	
	
	
}
