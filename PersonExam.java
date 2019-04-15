import java.util.Scanner;

public class PersonExam {
	static int x = 5;
	static Person[] person = new Person[x];
	static int index = 0;// 인원수 제한 10명
	
	static void personRank() { // 월급 순위를 가지고 랭크를 찾아 정렬하는 클래스
		Person temp = new Person(); //교환 기능을 수행하기 위해 빈 Person 객체를 하나 만들어 줌
		for (int i = 0; i < index; i++) { // 인원수만큼 반복
			for (int j = 0; j < index; j++) { // 각 인원 x 인원수 만큼 반복.
				if (person[i].Rank < person[j].Rank) { // A라는 인원을 A를 포함한 나머지 인원에 비교
					temp = person[i];
					person[i] = person[j];
					person[j] = temp;
				}

			}
		}
	}
	
	static void personMoney() {//월급 순위를 측정하는 클래스
		for (int i = 0; i < index; i++) { //인원수 만큼 반복
			person[i].Rank = 1; //모든 인원의 순위를 1로 초기화
			for (int j = 0; j < index; j++) { // A를 A라는 인원을 포함한 나머지 인원과 비교
				if (person[i].money < person[j].money) {
					person[i].Rank += 1;
				}

			}

		}
	}
	
	static void personSort() { // 사원 번호로 정렬하는 클래스
		Person temp = new Person(); // 교환 기능을 구현하기 위해 빈 Personb 객체를 만듦
		for (int i = 0; i < index; i++) { //인원수 만큼 반복
			for (int j = 0; j < index; j++) { //A를 A라는 인원을 포함한 나머지 인원과 비교
				if (person[i].num < person[j].num) { //각 인원의 번호를 비교
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
		
		for (int i = 0; i < person.length; i++) { // 출력
			person[i].printIndex();
			System.out.println("\t" + person[i].Rank);
		}
		
		personRank();
		
		System.out.println("연봉순 정렬");
		System.out.println("연봉순위" + "\t" + "이름" + "\t" + "입사일자" + "\t" + "기본금 " + "\t" + "번호" );
		
		for (int i = 0; i < person.length; i++) { //출력
			System.out.print(person[i].Rank + "\t");
			person[i].printIndex2();
			System.out.print("\n");
		}
		
	}

}
