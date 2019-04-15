
public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberExam mem = new MemberExam(1, "홍길동", 30); //3개 변수가지는 객체 선언
		
		mem.Mprint();
		
		int money = mem.result(10000);
		
		System.out.println("돈 : \t" + money);
		
		mem.update(1, 50); 
		
		mem.Mprint();
		
	}

}
