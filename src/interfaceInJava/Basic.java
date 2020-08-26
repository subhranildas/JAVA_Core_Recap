package interfaceInJava;

// in interface we can declare methods
// like abstract class we can not make instance of a interface
// multiple inheritance is possible in interface unlike class
// we can not define methods in interface whereas in abstract classes methods can be defined
// implements keyword is used to inherit interface
// all the methods in an interface are abstract by default
// reference of an interface can be used to create an object of a class which implements that interface
// interfaces do not have constructors so obj can not be created directly
// variables inside a interface are final by deafault 

interface A{
	void Hello();
	int i = 0;
}

class AA implements A{

	@Override
	public void Hello() {
		System.out.println("Hello !");
	}
	
	public void hel() {
		System.out.println("Hel");
	}
}


public class Basic {

	public static void main(String[] args) {
		
		A obj = new AA(); // since the reference is A here, hel() can not be called using this obj
		obj.Hello();
		System.out.println(AA.i);
		
		
	}

}
