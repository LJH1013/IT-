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
		//�������� ����ȣ�� (���)
	}

}

//�߻�Ŭ���� �߻�ȭ �޼ҵ尡 �ϳ��� ������
//�������̽� �߻�޼ҵ�� ������� ����
//map
//toString ��ü�� �ν��Ͻ� ��ȯ 
