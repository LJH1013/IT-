package Student;

import java.util.*;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sList = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		System.out.println("반\t번호\t체중");
		Student student = null;
		int ban;
		int num;
		int wei;

		while (true) {

			ban = scan.nextInt();
			if (ban == 0)
				break;
			num = scan.nextInt();
			wei = scan.nextInt();

			student = new Student(ban, num, wei);
			sList.add(student);

		}
		
		int min;
		int max;
		System.out.println(sList.get(0).ban);
		System.out.println("반\t번호\t체중");
		min = sList.get(0).wei;
		max = sList.get(0).wei;
		for (int i = 0; i < sList.size(); i++) {
			

			if (sList.get(i).wei < min) {
				min = sList.get(i).wei;
			} else if (sList.get(i).wei > max) {
				max = sList.get(i).wei;
			}
			
			if (i > 0 && sList.get(i).ban == sList.get(i - 1).ban) {
				System.out.print("\t" + sList.get(i).num + "\t" + sList.get(i).wei);
			} else {
				System.out.print(sList.get(i).ban + "반\t" + sList.get(i).num + "\t" + sList.get(i).wei);
			}

			
			System.out.println();
		}

		System.out.println("최소 체중" + min);
		System.out.println("최대 체중" + max);
	}

}
