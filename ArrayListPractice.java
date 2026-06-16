package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	public static void main(String[] args) {
		List<Integer> info = new ArrayList<Integer>();
		info.add(1);
		info.add(1);
		info.add(2);
		System.out.println(info);
		System.out.println(info.get(2));
		info.remove(0);
		System.out.println(info);
		System.out.println(info.size());
	}

	
	
	
	
	
	
	
	
}
