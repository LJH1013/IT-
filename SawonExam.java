package Sawon;

import java.util.*;

public class SawonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sawon> list = new ArrayList<Sawon>();
		String name;
		int rank;
		int time;
		Sawon sawon = null;
		Scanner scan = new Scanner(System.in);

		System.out.println("��� ���� �Է� \t ex) user01 1 25");
		
		while (true) {

			name = scan.next();
			if (name.equalsIgnoreCase("end"))
				break;
			
			rank = scan.nextInt();
			
			if(rank >= 4 || rank <= 0) {
				System.out.println("����� 1,2,3 ���Դϴ�.");
				scan.nextLine();
				continue;
			}
			
			time = scan.nextInt();
			
			if(time >= 50) {
				System.out.println("�ٹ��ð��� 50�ð� ������ �����˴ϴ�.");
				scan.nextLine();
			}
			
			sawon = new Sawon(name, rank, time);

			list.add(sawon);

		}
		
		scan.close();
		int total_time = 0;
		int total_pay = 0;

		System.out.println("���̵�\t���\t�ñ�\t�ٹ��ð�\t�ְ��޿�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			total_time = total_time + list.get(i).work_time;
			total_pay = total_pay + list.get(i).week_pay;
		}
		System.out.println("�հ�\t\t\t" + total_time + "\t" + total_pay);
	}

}
