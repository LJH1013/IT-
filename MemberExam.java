
public class MemberExam extends Member{
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
	
	public void update(int idx, int age) {
		// TODO Auto-generated method stub
		if(idx == 1) super.age = age;
		else if(idx != 1) System.out.println("1번이 존재 하지 않음");
	}
	
	public void update(int idx, String name) {
		// TODO Auto-generated method stub
		if(idx == 1) super.age = age;
		else if(idx != 1) System.out.println("1번이 존재 하지 않음");
	}
	
	public MemberExam(int idx, String name, int age) {
		// TODO Auto-generated constructor stub
		super.idx = idx;
		super.name = name;
		super.age = age;
		
		//System.out.println(super.idx + "\t" + super.name + "\t" + super.age);
		
	}	
	
}
