import java.util.Scanner;

public class PersonExam {
	static int x = 5;
	static Person[] person = new Person[x];
	static int index = 0;// �ο��� ���� 10��
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
		
		int num; // ��ȣ (1~10)
		String name; // �̸� (������)
		String days; // �Ի��� (2019/01.01)
		int money; // ���� (50000 ~ 5000000)

		Scanner scan = new Scanner(System.in);
		Person person2 = new Person();

		// TODO Auto-generated method stub
		while (true) {
			if (index > 5) // �ִ��ο���
				break;
			if(index >= x) x = index;
			
			System.out.printf("��ȣ : ");
			num = scan.nextInt();
			
			if (num == 0)
				break;

			System.out.printf("�̸� : ");
			name = scan.next();

			System.out.printf("�Ի����� : ");
			days = scan.next();

			System.out.printf("�⺻�� : ");
			money = scan.nextInt();

			person2 = new Person(num, name, days, money);
			person[index] = person2;

			index++;
			
		}
		scan.close();
		personSort();
		personMoney();
		
		System.out.println("��ȣ�� ����");
		System.out.println("��ȣ"+ "\t" + "�̸�" + "\t" + "�Ի�����" + "\t" + "�⺻�� " + "\t" + "��������");
		
		for (int i = 0; i < person.length; i++) {
			person[i].printIndex();
			System.out.println("\t" + person[i].Rank);
		}
		
		personRank();
		
		System.out.println("������ ����");
		System.out.println("��������" + "\t" + "�̸�" + "\t" + "�Ի�����" + "\t" + "�⺻�� " + "\t" + "��ȣ" );
		
		for (int i = 0; i < person.length; i++) {
			System.out.print(person[i].Rank + "\t");
			person[i].printIndex2();
			System.out.print("\n");
			
		}
		
	}

}
