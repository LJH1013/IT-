package Exam_01;

public class Exam_01 {

	public static void main(String[] args) {

		int[][] jusa = new int[2][7];
		int ju;
		int total = 0;

		for (int i = 0; i < 100; i++) {
			ju = (int) (Math.random() * 6 + 1);
			if (ju == 6) {
				jusa[1][5]++;
				total++;
			} else if (ju == 5) {
				jusa[1][4]++;
				total++;
			} else if (ju == 4) {
				jusa[1][3]++;
				total++;
			} else if (ju == 3) {
				jusa[1][2]++;
				total++;
			} else if (ju == 2) {
				jusa[1][1]++;
				total++;
			} else {
				jusa[1][0]++;
				total++;
			}

		}

		for (int i = 0; i < 7; i++) {
			jusa[0][i] = i + 1;
			if (i == 6) {
				System.out.println("гу╟Х");
			} else {
				System.out.print(jusa[0][i] + "\t");
			}

		}
		for (int j = 0; j < 7; j++) {
			if (j == 6) {
				System.out.println(total);
			} else {
				System.out.print(jusa[1][j] + "\t");
			}
		}

	}

}
