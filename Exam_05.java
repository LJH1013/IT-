interface ExampleInterface { // print �������̽� ����
	public void print();
}

class HH implements ExampleInterface { // �������̽� ��� ����

	@Override
	public void print() { // ��ӹ��� print �޼ҵ� �������̵�
		// TODO Auto-generated method stub
		System.out.println("implement�κ��� ���� print �޼ҵ� �Դϴ�..!");
	}
	
	//���� Ŭ������ default �����ڰ� ������ �ڽ� Ŭ������ ������ ����Ƿ� ���� Ŭ�������� default �����ڰ� �ʿ�
	//�Ű������� �ʿ�� �ϴ� �����ڰ� �����ϸ� default �����ڰ� ��� ������ ����
	public HH() { 
		System.out.println("HH ������ ȣ��");
	}

}

class GG extends HH { // HH�� ��ӹ���
	int c = 5;
	int d = 15;

	public GG() {
		System.out.println("GG ������ ȣ��");
		System.out.println("GG�� ������ �� c:" + c + "\td:" + d);
	}
}

class EE extends GG { // GG�� ��� ����
	int x = 10;
	int y = 20;
	int sum;

	int sum(int x, int y) {// 2���� �Ű� ������ �����ְ� �� ����� EE�� ���� x�� y�� ������
		sum = this.x + this.y;
		sum = sum + x + y;
		return sum;
	}
	
	public EE(int x) {
		this.x = x;
	}

	public EE() { 
		System.out.println("EE ������ ȣ��");
		System.out.println("EE�� ������ �� x:" + x + "\ty:" + y);
	}

}

class FF extends EE { // FF <- EE <- GG <- HH <-ExampleInterface ������ ��� ��ӹ���
	int a = 20;
	int b = 30;

	public FF() {
		System.out.println("FF ������ ȣ��");
		System.out.println("FF�� ������ �� c:" + a + "\td:" + b);
	}
	
	void printSum() {

		super.x = 11; // �θ��� �������� ���� �ϵ��� ��
		super.y = 21;
		super.c = 6;
		super.d = 16;

		super.sum(c, d); // super�� ���� Ŭ������ �����ڸ� ��������� �ҷ���
						 // ��ǻ� ����Ŭ������ default Ŭ������ ���� ���� �ʰ� �Ű������� �ʿ�� �ϴ� 
						 // �����ڰ� ������ �� ���

		sum = sum + a + b; // ��ӹ��� sum()�� ��갪�� FF�� ������ �ִ� a�� b�� ����

		System.out.println("EE�� x ���� �� : " + x + "\ty ���� �� : " + y);
		System.out.println("GG�� c ���� �� : " + c + "\td ���� �� : " + d);
		System.out.println("FF�� a �� : " + a + "\tb �� : " + b);

		System.out.println("a + b + c + d + x + y = " + sum);

		print(); // ��ӹ��� HH�� print()�� ȣ�� / HH�� print�� Example���� ������ ��
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ ȣ�� ����");
		FF ff = new FF(); // ���� ���� FF Ŭ���� �ʱ�ȭ

		ff.printSum(); // FF�� printSum �Լ� ȣ��

	}

}
