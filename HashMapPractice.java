package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapPractice {
	
	public static void main(String[] args) {
		StudentDetails details = new StudentDetails(101, "Revanth", 450);
		StudentDetails details2 = new StudentDetails(102, "karthik", 460);
		StudentDetails details3 = new StudentDetails(101, "Anand", 490);
		
		List<StudentDetails> studentDetailsList = new ArrayList<StudentDetails>();
		studentDetailsList.add(details);
		studentDetailsList.add(details2);
		studentDetailsList.add(details3);
		
		Map<String, StudentDetails> studentsMap = new HashMap<>();
		
		for(StudentDetails students: studentDetailsList) {
			studentsMap.put(students.getName(), students);
		}
		
		
		
		System.out.println(studentsMap);
		System.out.println(studentsMap.get("Revanth"));
		
		Map<Integer, List<StudentDetails>> studentsMap2 = new HashMap<>();
	}

}
