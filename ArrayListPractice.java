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
		
		List<String> list = new ArrayList<String>(); 
		UserInformation information3 = new UserInformation(3, "Deva", "assdas", 4);
		UserInformation information2 = new UserInformation(2, "Abdul", "assdas", 5);
		UserInformation information1 = new UserInformation(1, "Revanth", "assdas", 6);
		List<UserInformation> information = new ArrayList<>();
		information.add(information1);
		information.add(information2);
		information.add(information3);
		System.out.println(information);
		
		List<UserInformation> expSorted = new ArrayList<>();
		for(UserInformation details : information) {
			if(details.getExperience() > 4) {
				expSorted.add(details);
			}
		}
		
		System.out.println(expSorted);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
