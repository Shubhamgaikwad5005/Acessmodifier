package named.com.assignment.main;

import com.assignment.defaultaccess.DefaultClass;
import com.assignment.protectedaccess.ProtectedClass;
import com.assignment.publicaccess.PublicClass;

import PrivateAccess.PrivateClass;

public class MainClass {

	public static void main(String[] args) {
		//public class instances
		PublicClass public1=new PublicClass(); // public class instances can be access from any where inside package or outside packkage
		public1.publicMethod();
		
		//private class instances
		
		PrivateClass P=new PrivateClass(); //private class members can not called from out side the class
		P.privatemethod();
		
	//	protected class instances
		ProtectedClass A=new ProtectedClass(); //protected class members can not called from out side the package class
		A.protectedMethod();
		
		//default class instances
		DefaultClass D=new DefaultClass(); 
		D.DefaultMethod();
		/*Default class behave like private-package  class this means it can only be access inside same package
        
        */

	}

}
