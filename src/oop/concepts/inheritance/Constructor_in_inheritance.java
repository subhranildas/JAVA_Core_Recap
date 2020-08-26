package oop.concepts.inheritance;

public class Constructor_in_inheritance {

	public static void main(String[] args) {
		
		B obj = new B();
		System.out.println();
		B obj1 = new B(10);
		System.out.println();
		A obj2 = new B(32);
		System.out.println();
		A obj3 = new A();
	}

}

class A{
	public A() {
		System.out.println("In A const");
	}
	public A(int i) {
		System.out.println("In A const int");
	}
}

class B extends A{
	public B() {
		super();				// There is always a super method present
		System.out.println("In B const");
	}
	public B(int i) {
		super();				// super method calls the default constructor of super class
		System.out.println("In B const int");
		// the super method can be changed try putting 'i' as a parameter in super
	}
}
