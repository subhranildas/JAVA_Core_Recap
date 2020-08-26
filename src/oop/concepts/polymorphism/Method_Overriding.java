package oop.concepts.polymorphism;

public class Method_Overriding {

	// Basic method overriding also known as runtime polymorphism //
	
	public static void main(String[] args) {
		
		A obj = new A();			// Instance of parent class is created
		obj.show();					// show from class A gets executed
		B objq = new B();			// Instance from child class is created
		objq.show();				// show from class B gets executed because method is overriden
		objq.disp();				// disp from parent gets executed coz no overriding
	}
}


class A{					// Parent class with method named show with 0 parameters
	void show() {
		System.out.println("Show from A");
	}
	void disp() {
		System.out.println("Disp from A");
	}
}

class B extends A{			 // Child class with method named show with 0 parameters
	void show() {
		System.out.println("Show from B");
	}
}