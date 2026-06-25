package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodCreation {
	
	public static int sortingOperation(int a, int b) {
		return a*b;
	}
	
	public static List<StudentDetails> objectCreation() {
		StudentDetails details = new StudentDetails(101, "Revanth", 450);
		StudentDetails details2 = new StudentDetails(102, "karthik", 460);
		StudentDetails details3 = new StudentDetails(104, "Anand", 490);
		StudentDetails details5 = new StudentDetails(104, "Pradeep", 490);
		
		List<StudentDetails> studentDetailsList = new ArrayList<StudentDetails>();
		studentDetailsList.add(details);
		studentDetailsList.add(details2);
		studentDetailsList.add(details3);
		studentDetailsList.add(details5);
		
		return studentDetailsList;
	}
	
	public static List<Integer> sorting(List<Integer> numbers) {
		
//		List<Integer> result = numbers.stream().sorted()
//				.collect(Collectors.toList());
//		return result;
		
		return numbers.stream().sorted()
				.collect(Collectors.toList());
		
	}
	
	
	public static void main(String[] args) {
		
		int result = sortingOperation(100,232);
		int result1 = sortingOperation(232,232);
		
		if(result1%2 == 0) {
			System.out.println("The result is even");
		}else {
			System.out.println("The result is odd number");
		}
		
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(10);
		integers.add(5);
		integers.add(20);
		
		System.out.println(sorting(integers));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
