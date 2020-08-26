package z_questions_basic;

import java.util.Scanner;

public class CyclicShift {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		while(test_case>0) {
			
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			// get the binary and process
			sc.nextLine();
			String input = sc.nextLine();
			int B = Integer.parseInt(input,2);
			
			for(int i=0;i<N-1;i++) {
				input = input.substring(1,N) + input.substring(0,1);
				if(Integer.parseInt(input,2)>B) B = Integer.parseInt(input,2);
			}
			input = input.substring(1,N) + input.substring(0,1);
			int count = 0;
			while(true) {
				if(Integer.parseInt(input,2)==B) {
					K--;
					if(K==0)break;
				}
				input = input.substring(1,N) + input.substring(0,1);
				count++;	
			}
			System.out.println(count);
			// test case done
			input = "";
			test_case--;
		}
		sc.close();

	}
	
	

}
