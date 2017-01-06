package hackerrankproj.algorithms.impl;

import java.io.*;
import java.util.*;

public class SimpleArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        

        
    }
}
