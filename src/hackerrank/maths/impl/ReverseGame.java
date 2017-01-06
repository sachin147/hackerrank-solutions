package hackerrank.maths.impl;

import java.io.*;
import java.util.*;
import java.util.stream.*;


public class ReverseGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++){
                list.add(j);
            }
            List<Integer> modifiedList = modifyList(list, n);
            int index = modifiedList.indexOf(k) ;
            System.out.println(index);
        }
    }
    
    static List<Integer> modifyList(List<Integer> list, int n) {
        List<Integer> lower = list.subList(0, n/2);
        List<Integer> upper = list.subList(n/2, n);
        //List<Integer> newList = Stream.concat(upper.stream(), lower.stream()).collect(Collectors.toList());
        Collections.reverse(upper);
        List<Integer> newList = merge(upper,lower);
        return newList;
    }
    
    static List<Integer> merge(List<Integer> a, List<Integer> b) {
        int c1 = 0, c2 = 0;
        List<Integer> res = new ArrayList<Integer>();
        while(c1 < a.size() || c2 < b.size()) {
            if(c1 < a.size())
                res.add((Integer) a.get(c1++));
            if(c2 < b.size())
                res.add((Integer) b.get(c2++));
        }
        return res;
    }
}
