package oop.concepts.inheritance;

public class Single_level_inheritance {

	// basic single level inheritance demo.//
	
	
	public static void main(String[] args) {
		
		Child obj = new  Child();		// I create instance of the child class
		int sum = obj.sum(12, 5);		// now I call a method from parent class
		System.out.println("Sum of numbers: " + sum);
		int sub = obj.sub(12, 5);		// I also call a method from the child class
		System.out.println("Sub of numbers: "+ sub);
		
	}

}

class Parent{				// this is the parent class called as super class or base class
	
	int sum(int a, int b) {
		return a+b;
	}
	
}

class Child extends Parent{	// this is the child class which extends parent class or sub/derived
	
	int sub(int a, int b) {
		return a-b;
	}
}