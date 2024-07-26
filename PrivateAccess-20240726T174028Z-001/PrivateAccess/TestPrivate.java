package PrivateAccess;

public class TestPrivate {

	public static void main(String[] args) {
		
		PrivateClass P=new PrivateClass();
		P.privatemethod();   // method is private so it can tot be called from another class
	}

}
