package hackerrank.maths.impl;

import java.io.*;
import java.util.*;
import java.math.*;

public class SummingNSeries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int s = 0;
            for(int j=1; j<=n; j++) {
                int nminus = n-1;
                int npos = (n*n) - (nminus*nminus);
                s=s+npos;
            }
            double total = s % (Math.pow(10,9) + 7);
            System.out.println(total);
        }*/
        
        Scanner in  = new Scanner(System.in);
		int t = in.nextInt();
		BigInteger n[] = new BigInteger[t];
		BigInteger s[] = new BigInteger[t];
		for (int i=0;i<t;i++){
			n[i] = in.nextBigInteger();
		}
		for(int i=0;i<t;i++){
			s[i] = n[i].modPow(BigInteger.valueOf(2), BigInteger.valueOf(1000000007));
		}
		for(BigInteger i: s){
			System.out.println(i);
		}
    }
}
