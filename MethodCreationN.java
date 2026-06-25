package sample;

public class MethodCreationN {
	public static void main(String[] args) {
		MethodCreation creation = new MethodCreation();
		int output = creation.sortingOperation(100, 200);
		MethodCreation.sortingOperation(11, 11);
		System.out.println(output);
	}

}
