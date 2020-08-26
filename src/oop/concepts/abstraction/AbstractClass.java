package oop.concepts.abstraction;

public class AbstractClass {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		obj.sum(15, 8);
	}

}

// If a method inside a class is abstract, the class has to be abstract
// An abstract class can have normal methods i.e. non abstract method
// An abstract class can not be instantiated 
// An abstract can be inherited

abstract class Calculator{		// Basic abstract class, can not instantiate this class
	public abstract void sum(int i,int j);	// declaration of method by default abstract
	public abstract void sub(int i,int j);	// declaration of method by default abstract
	public abstract void mul(int i,int j);	// declaration of method by default abstract
	public abstract void div(int i,int j);	//declaration of method by default abstract
}

class Calc extends Calculator{	// child class of abstract class which implements all methods
								// this class is not abstract so it can be instantiated
	@Override			// a way to identify the methods which are overriden 
	public void sum(int i, int j) {		// sum method is implemented 
		System.out.println(i+j);
	}

	@Override
	public void sub(int i,int j) {	// these methods can be implemented in farther child
		System.out.println(i-j);
	}

	@Override
	public void mul(int i,int j) {	// until all methods are implemented parents will remain abstract 
		System.out.println(i*j);
	}

	@Override
	public void div(int i, int j) { //if all the methods are implemented the class wont be abstract
		System.out.println(i/j);	// object of that class can be created
	}
}