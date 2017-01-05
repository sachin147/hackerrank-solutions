package hackerrank.maths.impl;

import java.util.Scanner;

public class SpecialMultiple {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=N; ; i=i+N) {
            if(isAllNine(i) || isAllNineAndZero(i)) {
                System.out.println(i);
                break;
            }
        }
    }
    
    private static boolean isAllNineAndZero(int x) {
        String num = String.valueOf(x);
        int length = num.length();
        for(int i=0; i<length; i++) {
            
            if(!(num.charAt(i) == '0' || num.charAt(i) == '9')) {
                return false;                  
            }
        }
        return true;
    }
    
    private static boolean isAllNine(int x) {
        String num = String.valueOf(x);
        int length = num.length();
        for(int i=0; i<length; i++) {
            if(!(num.charAt(i) == '9')) {
                return false;
            }
        }
        return true;
    }
	
}
