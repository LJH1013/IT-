import java.util.*;

public class LottoExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String[]> alist = new ArrayList<String[]>();

		String[] text = null;// ���� ���� �Է¹��� ����
		String text2 = null;
		Scanner scan = new Scanner(System.in);
		int games = 0;// �Է¹��� ������ ��
		Random random = new Random();

		System.out.print("���� �� �Է� : ");

		games = scan.nextInt();
		scan.nextLine();
		int i = 0;

		while (i < games) {// �Է¹��� ��ȣ 6���� "," �������� �߶� �迭�� ����
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
		int[] lotto = new int[7];// ���� �ζ� ��ȣ ����� �迭 ����

		for (int j = 0; j < lotto.length; j++) {
			lotto[j] = (int) (Math.random() * 45) + 1;

		}

		for (int j = 0; j < lotto.length; j++) { // �ߺ� ��ȯ �� ����
			for (int k = 0; k < lotto.length; k++) {
				if (lotto[j] == lotto[k] && j != k) {
					lotto[k] = (int) (Math.random() * 45) + 1;
					j--;
					break;
				}
			}

		}
		Arrays.sort(lotto, 0, lotto.length-1);
		
		System.out.print("��÷��ȣ : ");// ��÷��ȣ ���
		for (int j = 0; j < lotto.length; j++) {
			//lotto[j] = random.nextInt(45) + 1;
			if (j == lotto.length - 1) {
				System.out.print("--- ���ʽ� : ");
			}

			System.out.print(lotto[j]);
			
			if (j < lotto.length - 1) {
				
				System.out.print(",");
			}
		}

		scan.close();
		int[] lotto2 = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println();
		// System.out.println("���Ƿ� ������ �ζ� �� : (1,2,3,4,5,6,7)");
		int result = 0;
		int bonus = 0;
		for (int j = 0; j < alist.size(); j++) {
			for (int k = 0; k < 6; k++) {
				for (int h = 0; h < lotto.length; h++) {// ��÷�� ������ result(��÷����) +1
					if (lotto[h] == Integer.parseInt(alist.get(j)[k])) {
						result++;
					}
				}
				if (lotto[6] == Integer.parseInt(alist.get(j)[k])) {// ���ʽ� ������ �­����� ���ʽ� +1
					bonus++;
				}
			}
			// System.out.println(bonus);

			System.out.println("\n");
			if (result == 6 && bonus == 0) { // ���ʽ��� ���� 6���� ��������
				System.out.println((j + 1) + "��° �մ� ��÷���� : " + result + "��\t" + "1���Դϴ�!");
			} else if (result == 5 && bonus > 0) { // ���ʽ��� �ְ�, 5���� ��������
				System.out.println((j + 1) + "��° �մ� ��÷���� : " + result + "��\t" + "2���Դϴ�!");
			} else if (result == 5) { // 5���� ��������
				System.out.println((j + 1) + "��° �մ� ��÷���� : " + result + "��\t" + "3���Դϴ�!");
			} else if (result == 4) { // 4���� ��������
				System.out.println((j + 1) + "��° �մ� ��÷���� : " + result + "��\t" + "4���Դϴ�!");
			} else if (result == 3) { // 5���� ��������
				System.out.println((j + 1) + "��° �մ� ��÷���� : " + result + "��\t" + "5���Դϴ�!");
			} else {// ��
				System.out.println((j + 1) + "��° �մ� ��÷���� : " + result + "��\t" + "���Դϴ�!");
			}
			result = 0;
			bonus = 0;
		}

	}
}
