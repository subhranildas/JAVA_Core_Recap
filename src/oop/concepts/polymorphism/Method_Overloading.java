package oop.concepts.polymorphism;

public class Method_Overloading {

	// basic method overloading //
	
	public static void main(String[] args) {
		
		int i=10,j=12,k=14;
		Calculator obj = new Calculator();
		int sum2 = obj.sum(i, j);
		int sum3 = obj.sum(i,j,k);
		System.out.println("Sum of two numbers: "+ sum2);
		System.out.println("Sum of three numbers: " + sum3);
	}

}

class Calculator{
	
	int sum(int i , int j) {		// method 1 with name sum with two parameters
		return i+j;
	}
	int sum (int i, int j, int k) {	// method 2 with name sum with three parameters
		return i+j+k;
	}
}