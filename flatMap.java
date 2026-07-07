package sample;

import java.util.List;

public class flatMap {
	
	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
				List.of(1,2),
				List.of(3,4),
				List.of(5,6)
				);
		
		list.stream().forEach(System.out::println);
		
		list.stream().flatMap(List::stream).forEach(System.out::println);
		list.stream().flatMap(e -> e.stream()).forEach(System.out::println);
	
		
		for(List<Integer> a : list) {
			for(Integer b: a) {
				System.out.println(b);
			}
		}
		
		
		
		
		
		
		
		
	}

}
