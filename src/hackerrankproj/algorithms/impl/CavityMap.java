package hackerrankproj.algorithms.impl;

public class CavityMap {

	public static void main(String args[]) {

		int[][] input = { { 1, 1, 1, 2 }, { 1, 9, 1, 2 }, { 1, 8, 9, 2 },
				{ 1, 2, 3, 4 } };

		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				if (input[i - 1][j] < input[i][j]
						&& input[i][j - 1] < input[i][j]
						&& input[i][j + 1] < input[i][j]
						&& input[i + 1][j] < input[i][j]) {
					input[i][j] = -1;
				}
			}
		}

		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print(" "+input[i][j]);
			}
			System.out.println();
		}

	}
}
