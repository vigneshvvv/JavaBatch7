package sample;

public class MethodOverloading {
	
	public int add(int a , int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		MethodOverloading methodOverloading = new MethodOverloading();
		int result = methodOverloading.add(100, 120);
		int result1 = methodOverloading.add(100, 120,220);
		System.out.println("The result is"+ result);
		System.out.println("The result is"+ result1);
	}

}
