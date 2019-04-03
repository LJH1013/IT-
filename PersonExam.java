import java.util.Scanner;

public class PersonExam {
	static int x = 5;
	static Person[] person = new Person[x];
	static int index = 0;// 인원수 제한 10명
	static void personRank() {
		Person temp = new Person();
		for (int i = 0; i < index; i++) {
			//person[i].Rank = 1;
			for (int j = 0; j < index; j++) {
				if (person[i].Rank < person[j].Rank) {
					temp = person[i];
					person[i] = person[j];
					person[j] = temp;
				}

			}
		}
	}
	
	static void personMoney() {
		for (int i = 0; i < index; i++) {
			person[i].Rank = 1;
			for (int j = 0; j < index; j++) {
				if (person[i].money < person[j].money) {
					person[i].Rank += 1;
				}

			}

		}
	}
	

	static void personSort() {
		Person temp = new Person();
		for (int i = 0; i < index; i++) {
			//person[i].Rank = 1;
			for (int j = 0; j < index; j++) {
				if (person[i].num < person[j].num) {
					temp = person[i];
					person[i] = person[j];
					person[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		
		int num; // 번호 (1~10)
		String name; // 이름 (무작위)
		String days; // 입사일 (2019/01.01)
		int money; // 연봉 (50000 ~ 5000000)

		Scanner scan = new Scanner(System.in);
		Person person2 = new Person();

		// TODO Auto-generated method stub
		while (true) {
			if (index > 5) // 최대인원수
				break;
			if(index >= x) x = index;
			
			System.out.printf("번호 : ");
			num = scan.nextInt();
			
			if (num == 0)
				break;

			System.out.printf("이름 : ");
			name = scan.next();

			System.out.printf("입사일자 : ");
			days = scan.next();

			System.out.printf("기본급 : ");
			money = scan.nextInt();

			person2 = new Person(num, name, days, money);
			person[index] = person2;

			index++;
			
		}
		scan.close();
		personSort();
		personMoney();
		
		System.out.println("번호순 정렬");
		System.out.println("번호"+ "\t" + "이름" + "\t" + "입사일자" + "\t" + "기본금 " + "\t" + "연봉순위");
		
		for (int i = 0; i < person.length; i++) {
			person[i].printIndex();
			System.out.println("\t" + person[i].Rank);
		}
		
		personRank();
		
		System.out.println("연봉순 정렬");
		System.out.println("연봉순위" + "\t" + "이름" + "\t" + "입사일자" + "\t" + "기본금 " + "\t" + "번호" );
		
		for (int i = 0; i < person.length; i++) {
			System.out.print(person[i].Rank + "\t");
			person[i].printIndex2();
			System.out.print("\n");
			
		}
		
	}

}
