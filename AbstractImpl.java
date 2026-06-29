package sample;

public class AbstractImpl extends AbstractPractice {
	
	@Override
	double calculateInterest() {
		return 7.5;
	}

	
	public static void main(String[] args) {
		AbstractImpl abstractImpl = new AbstractImpl();
		
	}
}
