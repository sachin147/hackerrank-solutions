package hackerrank.datastructure;

import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n ;i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i=a.length-1; i>=0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
