package sosu;

public class Exam extends ExamInter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExamInterface ef = new ExamInterface() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public String mtfk(String ym) {
				// TODO Auto-generated method stub
				System.out.println(mtfkm);
				return null;
			}
			
		};
		
		ef.print();
		ef.mtfk("");
		
	}

}
