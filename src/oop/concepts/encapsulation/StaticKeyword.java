package oop.concepts.encapsulation;

public class StaticKeyword {

	public static void main(String[] args) {
		
		A.i = 34;			// we don't need to create an object to access static variable/method
		A.show(A.i);		// we need only the class name
		
		B obj = new B();	// for non static object and variable we need to create an object
		obj.val = 56;		// we use the object to access variable
		obj.print(obj.val);	// each object has its own instance 
		obj.name = "Subhranil";	// a value is assigned to name variable
		
		// static variables are same throughout objects
		
		B obj1 = new B();		// a new instance is created obj1
		System.out.println(obj1.name);	// the static variable remains same as assigned
		
		// Also eclipse gives a warning while accessing the variable as obj.name where it should 
		// be B.name.
		
		// Non static variables or methods can not be used inside a static method without creating
		// an object of the class
		
	}

}

class A{
	
	static int i;
	
	static void show(int j) {
		System.out.println(j);
	}
}

class B{
	int val;
	static String name = "Miko";
	void print(int j) {
		System.out.println(j);
	}
}