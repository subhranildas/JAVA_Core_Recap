/*
 * Standard Input
 * 1		--> Number of test cases
 * 3		--> Matrix height and width
 * 1 2 3	-->	Row one of Matrix
 * 4 5 6	-->	Row two of Matrix
 * 7 8 9	-->	Row three of Matrix
 * 
 * Standard Output
 * 0		--> Output i.e. the number of inversion
 * */



package z_questions_basic;
import java.util.Scanner;
public class NumberOfInversions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int t_case = sc.nextInt();

        while(t_case>0){

            int N = sc.nextInt();
            int[][] input = new int[N][N];
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    input[i][j] = sc.nextInt();
                }
            }
            sc.close();
            int count = 0;
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    for(int m=i;m<N;m++){
                        for(int n=j;n<N;n++){
                            if(input[i][j] > input[m][n]){
                                count++;
                            }
                        }
                    }
                }
            }

            System.out.println(count);    
            t_case--;
        }

	}

}
