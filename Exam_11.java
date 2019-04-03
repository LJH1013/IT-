
public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberExam mem = new MemberExam(1, "È«±æµ¿", 30);
		
		mem.Mprint();
		
		int money = mem.result(10000);
		
		System.out.println("µ· \t" + money);
		
		mem.update(1, 50);
		
		mem.Mprint();
		
	}

}
