package z_questions_basic;

import java.util.*;

public class temp {
	
	//

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String input = sc.nextLine();
		 int inc = sc.nextInt();
		 char[] input_arr = input.toCharArray();
		 for(int i=0;i<input_arr.length;i++) {
			 int temp = input_arr[i];
			 if(temp>=48 && temp<=57) {	 
					 temp = (temp-48+inc)%10;
					 temp += 48;
				 input_arr[i] = (char)temp;
			 }
			 else if(temp>=65 && temp<=90) {
					 temp = (temp-65+inc)%26;
					 temp += 65;
				 input_arr[i] = (char)temp;
			 }
			 else if(temp>=97 && temp<=122) {
					 temp = (temp-97+inc)%26;
					 temp += 97;				 
				 input_arr[i] = (char)temp;
			 }
		 }
		 for(char i:input_arr) {
			 System.out.print(i);
		 }
		 System.out.println();
	}
	
}
