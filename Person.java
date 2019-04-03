
/* 1. 입력 형식
 * 번호 : (1~10)
 * 이름 : 
 * 입사일 : (2019/01/01)
 * 기본급 : (50000 ~ 500000)
 * 
 * 2. 출력
 * 번호 이름 입사일자 기본급 연봉순위
 * 
 * 3. 번호 순으로 출력
 */
public class Person {
	int num; // 번호 (1~10)
	String name; // 이름 (무작위)
	String days; // 입사일 (2019/01.01)
	int money; // 연봉 (50000 ~ 5000000)
	int Rank;// 연봉순위

	public Person() {

	}

	public Person(int num, String name, String days, int money) {
		this.num = num;
		this.name = name;
		this.days = days;
		this.money = money;
		Rank = 0;
		
	}
	
	void printIndex() {
		System.out.print(num + "\t" + name + "\t" + days + "\t" + money);
	}
	
	void printIndex2() {
		System.out.print(money + "\t" + name + "\t" + days + "\t" + num);
	}
}
