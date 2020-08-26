package finalKeyword;

public class FinalMethod {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}

}

class A{
	final void show(){
		System.out.println("Hello from A");
	}
}

class B extends A{	// final methods can not be overriden. uncomment below to see the error.
//	void show() {
//		System.out.println("Hello from B");
//	}
}