
/* 1. �Է� ����
 * ��ȣ : (1~10)
 * �̸� : 
 * �Ի��� : (2019/01/01)
 * �⺻�� : (50000 ~ 500000)
 * 
 * 2. ���
 * ��ȣ �̸� �Ի����� �⺻�� ��������
 * 
 * 3. ��ȣ ������ ���
 */
public class Person {
	int num; // ��ȣ (1~10)
	String name; // �̸� (������)
	String days; // �Ի��� (2019/01.01)
	int money; // ���� (50000 ~ 5000000)
	int Rank;// ��������

	public Person() {

	}

	public Person(int num, String name, String days, int money) {
		this.num = num;
		this.name = name;
		this.days = days;
		this.money = money;
		Rank = 0;
		
	}
	
	void printIndex() {
		System.out.print(num + "\t" + name + "\t" + days + "\t" + money);
	}
	
	void printIndex2() {
		System.out.print(money + "\t" + name + "\t" + days + "\t" + num);
	}
}
