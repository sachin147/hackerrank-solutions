package hackerrankproj.algorithms.impl;

import java.io.*;
import java.util.*;

public class VeryBigSum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s=new Scanner(System.in);

    
    int n=s.nextInt();

    long arr[]=new long[n];

    

    for(int i=0;i<n;i++){
        arr[i]=s.nextLong();

    }
        long sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        
    }
}
