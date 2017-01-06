package hackerrank.maths.impl;

import java.io.*;
import java.util.*;

public class ConnectingTowns {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int total = 1;
            for(int j=0;j<n-1;j++){
                int x = sc.nextInt();
                total = (total*x)% 1234567;
            }
            System.out.println(total);
        }
    
    }
}
