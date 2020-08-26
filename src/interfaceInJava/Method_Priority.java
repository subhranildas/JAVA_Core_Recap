package interfaceInJava;


interface AAA{
	default void show() {
		System.out.println("Hello from AAA interface");
	}
}
interface BBB{
	default void show() {
		System.out.println("Hello from BBB interface");
	}
}

class CCC implements AAA{	
	// this class can not implement both interface since they have duplicate methods
	// if we tried this will give an error, this is why multiple inheritance was not supported
	
	public void show() {	// this has to be public 
		System.out.println("Hello from CCC class");
	}
	
}

class DDD extends CCC implements BBB{
	public void show() {
		System.out.println("Hello from DDD class");
	}
}


public class Method_Priority {

	public static void main(String[] args) {
		
		CCC obj = new CCC();
		obj.show();	
		// This will call the show function from the class since class has higher priority
		DDD obj1 = new DDD();
		obj1.show();	// current class has the highest priority compared to parent and interface

	}

}
