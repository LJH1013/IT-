import java.util.*;

public class LottoExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String[]> alist = new ArrayList<String[]>();

		String[] text = null;// 게임 줄을 입력받을 변수
		String text2 = null;
		Scanner scan = new Scanner(System.in);
		int games = 0;// 입력받을 게임의 수
		Random random = new Random();

		System.out.print("게임 수 입력 : ");

		games = scan.nextInt();
		scan.nextLine();
		int i = 0;

		while (i < games) {// 입력받은 번호 6개를 "," 기준으로 잘라 배열로 저장
			text = new String[6];
			text2 = new String();

			System.out.printf((i + 1) + " : ");
			text2 = scan.nextLine();

			text = text2.split(",");
			alist.add(text);

			i++;
		}

		scan.close();

		scan = new Scanner(System.in);
		int[] lotto = new int[7];// 랜덤 로또 번호 저장될 배열 저장

		for (int j = 0; j < lotto.length; j++) {
			lotto[j] = (int) (Math.random() * 45) + 1;

		}

		for (int j = 0; j < lotto.length; j++) { // 중복 변환 및 제거
			for (int k = 0; k < lotto.length; k++) {
				if (lotto[j] == lotto[k] && j != k) {
					lotto[k] = (int) (Math.random() * 45) + 1;
					j--;
					break;
				}
			}

		}
		Arrays.sort(lotto, 0, lotto.length-1);
		
		System.out.print("당첨번호 : ");// 당첨번호 출력
		for (int j = 0; j < lotto.length; j++) {
			//lotto[j] = random.nextInt(45) + 1;
			if (j == lotto.length - 1) {
				System.out.print("--- 보너스 : ");
			}

			System.out.print(lotto[j]);
			
			if (j < lotto.length - 1) {
				
				System.out.print(",");
			}
		}

		scan.close();
		int[] lotto2 = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println();
		// System.out.println("임의로 설정한 로또 값 : (1,2,3,4,5,6,7)");
		int result = 0;
		int bonus = 0;
		for (int j = 0; j < alist.size(); j++) {
			for (int k = 0; k < 6; k++) {
				for (int h = 0; h < lotto.length; h++) {// 당첨과 같을때 result(당첨개수) +1
					if (lotto[h] == Integer.parseInt(alist.get(j)[k])) {
						result++;
					}
				}
				if (lotto[6] == Integer.parseInt(alist.get(j)[k])) {// 보너스 점수를 맞췃을때 보너스 +1
					bonus++;
				}
			}
			// System.out.println(bonus);

			System.out.println("\n");
			if (result == 6 && bonus == 0) { // 보너스가 없고 6개를 맞췄을때
				System.out.println((j + 1) + "번째 손님 당첨개수 : " + result + "개\t" + "1등입니다!");
			} else if (result == 5 && bonus > 0) { // 보너스가 있고, 5개를 맞췄을때
				System.out.println((j + 1) + "번째 손님 당첨개수 : " + result + "개\t" + "2등입니다!");
			} else if (result == 5) { // 5개를 맞췄을때
				System.out.println((j + 1) + "번째 손님 당첨개수 : " + result + "개\t" + "3등입니다!");
			} else if (result == 4) { // 4개를 맞췄을때
				System.out.println((j + 1) + "번째 손님 당첨개수 : " + result + "개\t" + "4등입니다!");
			} else if (result == 3) { // 5개를 맞췄을때
				System.out.println((j + 1) + "번째 손님 당첨개수 : " + result + "개\t" + "5등입니다!");
			} else {// 꽝
				System.out.println((j + 1) + "번째 손님 당첨개수 : " + result + "개\t" + "꽝입니다!");
			}
			result = 0;
			bonus = 0;
		}

	}
}
