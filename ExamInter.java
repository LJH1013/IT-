package sosu;

class A {
	public A() {
		System.out.println("A");

	}

	public A(int x) {
		System.out.println("A :" + x);
	}
}

class B extends A {
	public B() {
		super(100);
	}

	public B(int x) {
		System.out.println("B : " + x);
	}
}

public class ExamInter implements ExamInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(11);
		//mtfkm = 20;
		System.out.println(mtfkm);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mtfk(String ym) {
		// TODO Auto-generated method stub
		return null;
	}

}
