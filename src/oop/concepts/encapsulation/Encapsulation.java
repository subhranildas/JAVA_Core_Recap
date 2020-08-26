package oop.concepts.encapsulation;

public class Encapsulation {

	
	// simple demonstration of encapsulation
	
	public static void main(String[] args) {
		
		AA obj = new AA();
		obj.Setname("Subhranil");
		String val = obj.Getname();
		System.out.println(val);

	}

}

class AA {
	
	private String name;		// not accessible outside class A
	
	public void Setname(String name) {	// setter to set string 
		this.name = name;
	}
	
	public String Getname() {			// getter to get string
		return this.name;
	}
}