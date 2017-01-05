package hackerrankproj.algorithms.impl;

import java.io.*;
import java.util.*;

public class SherlockAndDivisors {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            List<Integer> divisors = getDivisors(n);
            System.out.println(divisors);
            long count = divisors.stream().filter(num -> num%2 == 0).count();
            System.out.println(count);
        }
    }
    
    static List<Integer> getDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}
