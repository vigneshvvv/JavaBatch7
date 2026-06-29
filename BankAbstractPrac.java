package sample;

public class BankAbstractPrac extends AbstractPractice {

	@Override
	double calculateInterest() {
		return 6.5;
	}
	
	public static void main(String[] args) {
		BankAbstractPrac abstractPrac = new BankAbstractPrac();
	   System.out.println(abstractPrac.calculateInterest());
		abstractPrac.printDetails();
	}

}
