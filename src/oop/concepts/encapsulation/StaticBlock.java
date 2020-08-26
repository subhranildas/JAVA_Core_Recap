package oop.concepts.encapsulation;

public class StaticBlock {

	// static block gets executed whenever a class is loaded in jvm(java vartual machine)
	static {		// this block will be executed before main
		System.out.println("in static block of main class");
		// we can print without anything in  main
	}
	public static void main(String[] args) {
		
		miko obj = new miko();	// static block in miko class gets executed here
		obj.hello();			

	}

}

class miko{
	
	static {
		System.out.println("in static block 1");
	}
	
	public void hello() {
		System.out.println("Hello!");
	}
	static {
		System.out.println("in static block 2");	// we can use multiple static blocks
	}
}