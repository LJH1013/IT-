
public class MemberExam extends Member{ //MemberExam 클래스는 Member 클래스를 상속받음
	int idx; 
	int money;
	int age;
	String name;
	int result;
	
	@Override
	public int result(int money) {
		// TODO Auto-generated method stub
		money = money * super.age;
		return money;
	}
	//@Override
	//@OVerride가 남아있을시 오류 발생
	//해결방법을 알면 주석 추가
	
	public void update(int idx, int age) { //번호 나이 업데이트
		// TODO Auto-generated method stub
		if(idx == 1) super.age = age;
		else if(idx != 1) System.out.println("1번이 존재 하지 않음");
	}
	
	public void update(int idx, String name) { //번호 이름 업데이트
		// TODO Auto-generated method stub
		if(idx == 1) super.age = age;
		else if(idx != 1) System.out.println(name + "이(가) 존재 하지 않음");
	}
	
	public MemberExam(int idx, String name, int age) { //변수 3개를 가지는 생성자
		// TODO Auto-generated constructor stub
		super.idx = idx;
		super.name = name;
		super.age = age;
		
		//System.out.println(super.idx + "\t" + super.name + "\t" + super.age);
		
	}	
	
}
