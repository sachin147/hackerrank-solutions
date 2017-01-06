package hackerrankproj.algorithms.impl;

import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        double positive = Arrays.stream(a).filter(i -> i > 0).count();
        double negative = Arrays.stream(a).filter(i -> i < 0).count();
        double zeros = Arrays.stream(a).filter(i -> i == 0).count();
        double p = positive/n;
        double neg = negative/n;
        double z = zeros/n;
        //System.out.println(positive);
        //System.out.println(negative);
        //System.out.println(zeros);
        //System.out.println(n);
        System.out.println(p);
        System.out.println(neg);
        System.out.println(z);
    }
}
