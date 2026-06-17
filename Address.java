package sample;

public class Address {

	String address;
	String state;
	int pincode;
	
	public Address(String address, String state, int pincode) {
		super();
		this.address = address;
		this.state = state;
		this.pincode = pincode;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	@Override
	public String toString() {
		return "Address [address=" + address + ", state=" + state + ", pincode=" + pincode + "]";
	}


}
