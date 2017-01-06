package hackerrank.maths.impl;

import java.io.*;
import java.util.*;
import java.math.*;

public class DiwaliLights {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger t = sc.nextBigInteger();
        for(int i=0; i<t.intValue(); i++) {
            BigInteger n = sc.nextBigInteger();
            BigInteger two = new BigInteger("2");
            BigInteger m = new BigInteger("100000");
            BigInteger pow = two.modPow(n, m);
            BigInteger ans = pow.subtract(new BigInteger("1"));
            System.out.println(ans);
        }
    }
}
