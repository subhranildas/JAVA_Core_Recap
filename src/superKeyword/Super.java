package superKeyword;

public class Super {

	public static void main(String[] args) {
		
		B obj = new B();
		B obj1 = new B(5);
		
	}

}

class A extends Object{					// super class
	public A() {
		super();	// in java every class extends Object class so Object constructor gets called
		System.out.println("In const A");
	}
	public A(int j) {					// constructor with parameter
		System.out.println("In const A Int");
	}
}

class B extends A{			// sub class
	
	public B() {
		super();			// Calls the default constructor of super class even without super();
		System.out.println("In const B");
	}
	public B(int i) {
		super(i);			// super method to call the parent constructor with parameter
		System.out.println("In const B Int");
	}
}