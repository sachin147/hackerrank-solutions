package hackerrank.maths.impl;

import java.io.*;
import java.util.*;

public class Restaurant {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
            int l = sc.nextInt();
            int b = sc.nextInt();
            int gcd = getGCD(l,b);
            int p = (l*b)/(gcd * gcd);
            System.out.println(p);
        }
        
    }
    
    static int getGCD(int l, int b) {
        while(l != b) {
          if(l > b)
          l = l-b;
          else
          b = b-l;
       }
        return l;
    }
}
