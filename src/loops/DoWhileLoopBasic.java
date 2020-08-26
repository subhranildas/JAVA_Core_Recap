package loops;

public class DoWhileLoopBasic {

	public static void main(String[] args) {
		
		
		// basic do while loop
		// in do-while loop condition is checked after executing the body
		// where as in while loop condition is checked first
		// therefor in do-while loop, the statement is executed atleast once
		int i=0;
		do {
			System.out.println("hello");
			i++;
		}while(i<3);

	}

}
