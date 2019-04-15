
public abstract class Member { //상속클래스로 선언
	int idx;
	String name;
	int age;

	public void Mprint() {
		System.out.println(idx + "\t" + name + "\t" + age);
	}

	public abstract int result(int money);
	public abstract void update(int idx, String name, int age);
}


