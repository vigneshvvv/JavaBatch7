package sample;

public class ObjectCreation {
	public static void main(String[] args) {
		UserInformation information = new UserInformation();
		information.setId(1);
		information.setFirstName("Deva");
		information.setLastName("M");
		information.setExperience(10);
		
		System.out.println(information);
		UserInformation information2 = new UserInformation();
		information2.setId(2);
		information2.setFirstName("Abdul");
		information2.setLastName("Majit");
		information2.setExperience(5);
		System.out.println(information2);
		
		System.out.println(information2.getFirstName());
		
	}
	
	
	
	
	
	
	
	
	

}
