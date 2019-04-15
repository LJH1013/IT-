class AA{
	AA(){
		System.out.println("AA");
	}
	AA(int a){
		System.out.println("AA: "+ a);
	}
	
	public void aaa() {
		
	}
}

class BB extends AA{
	BB(){
		System.out.println("BB");
	}
	BB(int x){
		System.out.println("BB : " + x);
	}
	@Override
	public void aaa() {
		System.out.println("AAA");
	}
	
}
public class Exam_03 {

	public static void main(String[] args) {
		BB b = new BB(10);
		b.aaa();
		//생성자의 연속호출 (상속)
	}

}

//추상클래스 추상화 메소드가 하나라도 있을시
//인터페이스 추상메소드와 상수만을 가짐
//map
//toString 객체의 인스턴스 반환 
