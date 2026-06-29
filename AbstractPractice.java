package sample;

public abstract class AbstractPractice {
	
	AbstractPractice(){
		System.out.println("constructor inside Abstract class");
	}
	
	abstract double calculateInterest();
	
	void printDetails() {
		System.out.println("method inside abstract class");
	}

}
