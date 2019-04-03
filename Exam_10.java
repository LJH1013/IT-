//추상메소드
//클래스 안에 추상 메소드가 하나라도 존재하면 추상 클래스로 만들어야 함
abstract class  K{
	public void add(int n, int m) {
		System.out.println("n + m = " + (n + m));
	}
	
	public abstract void mul(int n, int m);
}

class KK extends K{
	public void mul(int n, int m) {
		
	}
}

public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
