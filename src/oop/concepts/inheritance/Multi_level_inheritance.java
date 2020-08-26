package oop.concepts.inheritance;

public class Multi_level_inheritance {

	// Multilevel inheritance demo //
	// Java does not support multiple inheritance //
	
	public static void main(String[] args) {
		
		int a = 7, b = 2;
		AddSubMul obj = new AddSubMul();		// object of latest derived class
		System.out.println(obj.add(a, b));		// method from Add class
		System.out.println(obj.sub(a, b));		// method from AddSub class
		System.out.println(obj.mul(a, b));		// method from AddSubMul class
	}

}


class Add {
	int add(int a, int b) {
		return a+b;
	}
}
class AddSub extends Add{
	int sub(int a , int b) {
		return a-b;
	}
}
class AddSubMul extends AddSub {
	int mul(int a ,int b) {
		return a*b;
	}
}