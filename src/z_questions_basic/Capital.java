package z_questions_basic;

import java.util.Scanner;

public class Capital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        int sumLen = A.length();
        sumLen += B.length();
        System.out.println(sumLen);

        if(A.compareTo(B)>0) {
        	System.out.println("Yes"); // A is lexiografically greated than B
        }
        else System.out.println("No");
        
        String aCap = A.substring(0, 1).toUpperCase();
        aCap += A.substring(1);
        String bCap = B.substring(0, 1).toUpperCase();
        bCap += B.substring(1);
        System.out.println(aCap + " " + bCap);
        
        
        
        

	}

}
