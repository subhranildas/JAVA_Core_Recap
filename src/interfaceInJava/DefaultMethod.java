package interfaceInJava;

// previously we knew that methods can only be declared not defined inside a interface
// from java8 and above default methods can be defined inside a method
// static methods can also be defined inside interfaces
// static methods can be called by using the interface name. applicable from java 8

interface miko{		
	default void show(){		// default method inside interface miko which is defined
		System.out.println("Hello world");
	}
	static void disp() {		// static method inside interface miko which is defined
		System.out.println("Displaying");
	}
}

class HH implements miko{
	
}

public class DefaultMethod {

	public static void main(String[] args) {
		
		miko.disp();	// static method is called using interface name 
		HH obj = new HH();// object of class HH is created 
		obj.show();	// static object show is called using HH class object which implements miko
		
		

	}

}
