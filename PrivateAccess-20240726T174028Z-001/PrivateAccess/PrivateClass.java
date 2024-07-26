package PrivateAccess;

public class PrivateClass {
	private void privatemethod() {
		System.out.println("This is a private method");
	}

	public static void main(String[] args) {

		PrivateClass P=new PrivateClass();
		P.privatemethod();

	}

}
