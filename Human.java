package Exam_01;

import java.util.ArrayList;
import java.util.List;

public class Human {
	int dong;
	String name;
	int age;
	int temp;

	public Human() {

	}

	List<int[]> dList = new ArrayList<int[]>();
	
	
	static int[][] totalArray = new int[11][8];

	public Human(int dong, String name, int age) {
		this.dong = dong;
		this.name = name;
		this.age = age;
		temp = 0;

		if (age < 10) {
			temp = 0;
		} else if (age >= 10 && age < 20) {
			temp = 1;
		} else if (age >= 20 && age < 30) {
			temp = 2;
		} else if (age >= 30 && age < 40) {
			temp = 3;
		} else if (age >= 40 && age < 50) {
			temp = 4;
		} else if (age >= 50 && age < 60) {
			temp = 5;
		} else {
			temp = 6;
		}

		totalArray[dong-1][temp]++;
		totalArray[dong-1][7]++;
		totalArray[10][temp]++;
		totalArray[10][7]++;

	}

	public static void print() {
		for (int i = 0; i < totalArray.length; i++) {
			if (i == totalArray.length - 1) {
				System.out.print("ÇÕ°è\t");
			} else {
				System.out.print(i + 1 + "µ¿\t");
			}
			for (int j = 0; j < totalArray[i].length; j++) {

				System.out.print(totalArray[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
