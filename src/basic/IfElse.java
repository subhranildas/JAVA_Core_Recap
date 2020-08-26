package basic;

public class IfElse {

	// finding the greatest number with nested if else
	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		int c = 24;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is the greatest number.");
			}
			else {
				System.out.println("c is the greatest number.");
			}
		}
		else {
			if(b>c) {
				System.out.println("b is the greatest number.");
			}
			else {
				System.out.println("c is the greatest number.");
			}
		}

	}

}
