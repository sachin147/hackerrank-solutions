package hackerrankproj.algorithms.impl;

public class ACMICPCTeam {
	public static void main(String args[]) {
		boolean student1[] = { true, false, true, false, true };
		boolean student2[] = { true, true, true, false, false };
		boolean student3[] = { true, true, false, true, false };
		boolean student4[] = { false, false, true, false, true };

		boolean[][] students = { student1, student2, student3, student4 };

		int maxKnown = 0;

		int i, j, k;
		for (i = 0; i <= 3; i++) {
			for (j = i + 1; j <= 3; j++) {
				int known = 0;
				for (k = 0; k <= 4; k++) {
					if (students[i][k] || students[j][k]) {
						known++;
					}
				}
				if (known == 5) {
					System.out.println(" All known to team of " + i + "  " + j);
				}
			}
		}

	}
}
