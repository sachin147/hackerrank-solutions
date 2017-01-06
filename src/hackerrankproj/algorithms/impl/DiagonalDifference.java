package hackerrankproj.algorithms.impl;

import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
               a[i][j]=in.nextInt();
            }
        }
        int diag1sum = 0, diag2sum = 0, j = n-1;
        for(int i=0;i<n;i++) {
            diag1sum += a[i][i];
            diag2sum += a[i][j];
            j--;
        }
        System.out.println(Math.abs(diag1sum - diag2sum));
    }
}
