package Exam_01;

import java.util.*;

public class HumanExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Human> hList = new ArrayList<Human>();
		
		Human human = null;
		String name;
		int dong;
		int age;
		
		System.out.println("���ڵ�\t����\t����");
		while(true) {
			dong = scan.nextInt();
			//scan.nextLine();
			if(dong == 0) break;
			name = scan.next();
			age = scan.nextInt();
			
			human = new Human(dong, name, age);
			
			hList.add(human);
		}
		System.out.println("��\t0~9��\t10~19��\t20~29��\t30~39��\t40~49��\t50~59��\t60���̻�\t�հ�");
		Human.print();
		
	}

}
