package hackerrank.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();

		List<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < N; i++) {
			seqList.add(new ArrayList<>());
		}

		int lastAns = 0;

		for (int i = 0; i < Q; i++) {
			int queryType = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			List<Integer> sequence = seqList.get((x ^ lastAns) % N);
			if (queryType == 1) {
				sequence.add(y);
			} else {
				lastAns = sequence.get(y % sequence.size());
				System.out.println(lastAns);
			}
		}
	}
}
