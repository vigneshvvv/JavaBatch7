package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamOperation {
	
	public static void main(String[] args) {
		StudentDetails details = new StudentDetails(101, "Revanth", 450);
		StudentDetails details2 = new StudentDetails(102, "karthik", 460);
		StudentDetails details3 = new StudentDetails(101, "Anand", 490);
		
		List<StudentDetails> studentDetailsList = new ArrayList<StudentDetails>();
		studentDetailsList.add(details);
		studentDetailsList.add(details2);
		studentDetailsList.add(details3);
		
//		Stream with Filter Operation
		List<StudentDetails> filtered = new ArrayList<StudentDetails>();
		
		for(StudentDetails details4: studentDetailsList) {
			if(details4.getMarks() > 450) {
				filtered.add(details4);
			}
			
		}
		
		System.out.println("The output from traditional for loop" + filtered);
		
      List<StudentDetails> result =	studentDetailsList.stream()
    		  							.filter((e) -> e.getMarks() >450)
    		  							.collect(Collectors.toList());
      
      System.out.println("Result from Stream operation"+ result);
      
//      Ends Here
      List<String> filteredName = new ArrayList<String>();
		
		for(StudentDetails details4: studentDetailsList) {
			if(details4.getMarks() > 450) {
				filteredName.add(details4.getName());
			}
			
		}
		
		System.out.println("The output from traditional for loop" + filteredName);
		
	List<String> names = studentDetailsList.stream()
						.filter((e) -> e.getMarks() > 450)
						.map((n) -> n.getName()).collect(Collectors.toList());
	
	System.out.println("The output from stream for loop" + names);
      
      
      List<Integer> nums = new ArrayList<>();
      nums.add(10);
      nums.add(20);
      nums.add(10);
      nums.add(30);
      nums.add(20);
      
     Set<Integer> output= nums.stream().collect(Collectors.toSet());
     System.out.println(output);
     
    List<Integer> sorted =  output.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
      System.out.println(sorted);
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
