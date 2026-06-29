package sample;

public class InterfaceImpl implements PaymentInterface, RefundDetails {

	@Override
	public void payment(double amount) {
		System.out.println("paying using UPI"+ amount);
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void refundStatus() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		impl.payment(20000);
	}



}
