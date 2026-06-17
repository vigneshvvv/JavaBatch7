package sample;

import java.util.Arrays;

public class arrayDelcaration {
	public static void main(String[] args) {
		
		
		int[] arr = new int[6];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 10;
		arr[3] = 5;
		arr[4] = 15;
		arr[5] = 3;
		arr[5] = 6;
		int[] arr1 = new int[] {2,3,10,5,15,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr[1]);
		System.out.println(arr[4]);
		
//		== -> EqualTO
//	    != -> Not Equal TO
//	    >= ->greater than or Equal To
//	    <= -> less than or Equal TO 
//	    > -> greater than
//	    < -> less than 
		
		if(arr[0] >= 2) {
			System.out.println("The number Exist");
		} else if (arr[1] == 4) {
			System.out.println("The number present in index 1");
		}
		
		else {
			System.out.println("The number doesn't exist");
		}
		
		
		String userName = "vignesh";
		String password = "vignesh";
		
		if(userName == "vignesh" || password == "vignesh@123") {
			System.out.println("Login successful");
		}else {
			System.out.println("either username or password incorrect");
		}
	}

}












