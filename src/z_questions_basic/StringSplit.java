package z_questions_basic;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();	// this line is very important its to avoid useless spaces up front
        
        String[] tokens = s.split("[!,_ @?'.]+");
        int length = 0;
        if(!(s.isEmpty())) length = tokens.length; // This is for no input and still len 1 problem
        System.out.println(length); 
        for(String a: tokens){
            System.out.println(a);
        }

	}

}
