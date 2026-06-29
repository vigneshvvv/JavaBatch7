package sample;

public class CreditPayment implements PaymentInterface{

	@Override
	public void payment(double amount) {
		System.out.println("payment using credit"+ amount);
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		
	}

}
