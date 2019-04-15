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
		
		System.out.println("悼内靛\t己疙\t唱捞");
		while(true) {
			dong = scan.nextInt();
			//scan.nextLine();
			if(dong == 0) break;
			name = scan.next();
			age = scan.nextInt();
			
			human = new Human(dong, name, age);
			
			hList.add(human);
		}
		System.out.println("悼\t0~9技\t10~19技\t20~29技\t30~39技\t40~49技\t50~59技\t60技捞惑\t钦拌");
		Human.print();
		
	}

}
