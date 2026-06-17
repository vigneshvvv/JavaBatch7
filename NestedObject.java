package sample;

public class NestedObject {
	
	public static void main(String[] args) {
		
		Address address = new Address("karapakam",  "TamilNadu", 600119);
		
		UserDetails details = new UserDetails(1, "kumar", null, 6, address);
		System.out.println(details);
		
		System.out.println(details.getAddress().getPincode());
		
	}

}
