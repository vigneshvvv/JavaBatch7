package sample;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = new int[] {10,20,30,40,50,60};
		int[] arrNew = new int[arr.length];
		int arrNewIndex = 0;
		
		for(int i = arr.length-1;i >=0; i--) {
			arrNew[arrNewIndex] = arr[i];
			arrNewIndex++;
		}
		System.out.println(Arrays.toString(arrNew));
	}

}










