interface ExampleInterface { // print 인터페이스 생성
	public void print();
}

class HH implements ExampleInterface { // 인터페이스 상속 받음

	@Override
	public void print() { // 상속받은 print 메소드 오버라이딩
		// TODO Auto-generated method stub
		System.out.println("implement로부터 받은 print 메소드 입니다..!");
	}
	
	//조상 클래스에 default 생성자가 없으면 자식 클래스에 오류가 생기므로 조상 클래스에는 default 생성자가 필요
	//매개변수를 필요로 하는 생성자가 존재하면 default 생성자가 없어도 오류가 없음
	public HH() { 
		System.out.println("HH 생성자 호출");
	}

}

class GG extends HH { // HH를 상속받음
	int c = 5;
	int d = 15;

	public GG() {
		System.out.println("GG 생성자 호출");
		System.out.println("GG가 가지는 값 c:" + c + "\td:" + d);
	}
}

class EE extends GG { // GG를 상속 받음
	int x = 10;
	int y = 20;
	int sum;

	int sum(int x, int y) {// 2개의 매개 변수를 더해주고 그 결과에 EE가 가진 x와 y를 더해줌
		sum = this.x + this.y;
		sum = sum + x + y;
		return sum;
	}
	
	public EE(int x) {
		this.x = x;
	}

	public EE() { 
		System.out.println("EE 생성자 호출");
		System.out.println("EE가 가지는 값 x:" + x + "\ty:" + y);
	}

}

class FF extends EE { // FF <- EE <- GG <- HH <-ExampleInterface 순으로 계속 상속받음
	int a = 20;
	int b = 30;

	public FF() {
		System.out.println("FF 생성자 호출");
		System.out.println("FF가 가지는 값 c:" + a + "\td:" + b);
	}
	
	void printSum() {

		super.x = 11; // 부모의 변수값을 수정 하도록 함
		super.y = 21;
		super.c = 6;
		super.d = 16;

		super.sum(c, d); // super로 조상 클래스의 생성자를 명시적으로 불러옴
						 // 사실상 조상클래스에 default 클래스가 존재 하지 않고 매개변수를 필요로 하는 
						 // 생성자가 존재할 때 사용

		sum = sum + a + b; // 상속받은 sum()의 계산값에 FF가 가지고 있는 a와 b를 더함

		System.out.println("EE의 x 변경 값 : " + x + "\ty 변경 값 : " + y);
		System.out.println("GG의 c 변경 값 : " + c + "\td 변경 값 : " + d);
		System.out.println("FF의 a 값 : " + a + "\tb 값 : " + b);

		System.out.println("a + b + c + d + x + y = " + sum);

		print(); // 상속받은 HH의 print()를 호출 / HH의 print는 Example에서 가져온 것
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("생성자 호출 순서");
		FF ff = new FF(); // 가장 밑의 FF 클래스 초기화

		ff.printSum(); // FF의 printSum 함수 호출

	}

}
