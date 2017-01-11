package hackerrank.datastructure;

import java.util.Scanner;

public class TwoDArrayDS {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int [][]A = new int [6][6];
        
        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                int sum = A[i][j] + A[i][j+1] + A[i][j+2] + A[i+1][j+1] + A[i+2][j] + A[i+2][j+1] + A[i+2][j+2];
                if( sum > max) 
                    max = sum;
            }
        }
        System.out.println(max);
    }
}
