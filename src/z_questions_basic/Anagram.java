package z_questions_basic;

import java.util.Scanner;

public class Anagram {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
		
		// below to lines are when for not case sensative
		a = a.toLowerCase();
		b = b.toLowerCase();
		// ------------------ everything to lowercase
        int [] aa = new int[256];
        int [] bb = new int[256];
        boolean ret = true;
        
        if(a.length()==b.length()){
            
            for(int i=0;i<a.length();i++) {
            	aa[(int)a.charAt(i)]++;
            	bb[(int)b.charAt(i)]++;
            }
            
            for(int j=0;j<256;j++) {
            	if(aa[j]!=bb[j]) ret= false;
            }
               
        }  
        else {
        	ret = false;
        }
        return ret;
    }

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
