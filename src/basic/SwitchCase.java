package basic;
import java.util.Scanner;

public class SwitchCase {

	static Scanner sc = new Scanner(System.in);
	// switch case code
	public static void main(String[] args) {
		
		int case_value = 5;
		
		switch(case_value) {
		
		case 1:
			System.out.println("In case 1");
			break;		// break statement is used to get out of switch-case 
		case 2:			// two cases can be combined
		case 3: 
			System.out.println("In case 2 & 3");
			break;
		case 4:
			System.out.println("In case 4");
			break;
		default:		// default case gets executed if no other case does
			System.out.println("In default");
			break;
		}
		
		System.out.print("Enter gender: ");
		String gender = sc.nextLine();
		
		// Strings can also be used in switch-case
		switch(gender) {
		
		case "M":
			System.out.println("You are male!");
			break;
		case "F":
			System.out.println("You are female!");
			break;
		default:
			System.out.println("unknown");
			break;
		}

	}

}
