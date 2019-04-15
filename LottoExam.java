import java.util.*;

public class LottoExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String[]> alist = new ArrayList<String[]>();

		String[] text = null;// °ÔÀÓ ÁÙÀ» ÀÔ·Â¹ŞÀ» º¯¼ö
		String text2 = null;
		Scanner scan = new Scanner(System.in);
		int games = 0;// ÀÔ·Â¹ŞÀ» °ÔÀÓÀÇ ¼ö
		Random random = new Random();

		System.out.print("°ÔÀÓ ¼ö ÀÔ·Â : ");

		games = scan.nextInt();
		scan.nextLine();
		int i = 0;

		while (i < games) {// ÀÔ·Â¹ŞÀº ¹øÈ£ 6°³¸¦ "," ±âÁØÀ¸·Î Àß¶ó ¹è¿­·Î ÀúÀå
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
		int[] lotto = new int[7];// ·£´ı ·Î¶Ç ¹øÈ£ ÀúÀåµÉ ¹è¿­ ÀúÀå

		for (int j = 0; j < lotto.length; j++) {
			lotto[j] = (int) (Math.random() * 45) + 1;

		}

		for (int j = 0; j < lotto.length; j++) { // Áßº¹ º¯È¯ ¹× Á¦°Å
			for (int k = 0; k < lotto.length; k++) {
				if (lotto[j] == lotto[k] && j != k) {
					lotto[k] = (int) (Math.random() * 45) + 1;
					j--;
					break;
				}
			}

		}
		Arrays.sort(lotto, 0, lotto.length-1);
		
		System.out.print("´çÃ·¹øÈ£ : ");// ´çÃ·¹øÈ£ Ãâ·Â
		for (int j = 0; j < lotto.length; j++) {
			//lotto[j] = random.nextInt(45) + 1;
			if (j == lotto.length - 1) {
				System.out.print("--- º¸³Ê½º : ");
			}

			System.out.print(lotto[j]);
			
			if (j < lotto.length - 1) {
				
				System.out.print(",");
			}
		}

		scan.close();
		int[] lotto2 = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println();
		// System.out.println("ÀÓÀÇ·Î ¼³Á¤ÇÑ ·Î¶Ç °ª : (1,2,3,4,5,6,7)");
		int result = 0;
		int bonus = 0;
		for (int j = 0; j < alist.size(); j++) {
			for (int k = 0; k < 6; k++) {
				for (int h = 0; h < lotto.length; h++) {// ´çÃ·°ú °°À»¶§ result(´çÃ·°³¼ö) +1
					if (lotto[h] == Integer.parseInt(alist.get(j)[k])) {
						result++;
					}
				}
				if (lotto[6] == Integer.parseInt(alist.get(j)[k])) {// º¸³Ê½º Á¡¼ö¸¦ ¸Â­ŸÀ»¶§ º¸³Ê½º +1
					bonus++;
				}
			}
			// System.out.println(bonus);

			System.out.println("\n");
			if (result == 6 && bonus == 0) { // º¸³Ê½º°¡ ¾ø°í 6°³¸¦ ¸ÂÃèÀ»¶§
				System.out.println((j + 1) + "¹øÂ° ¼Õ´Ô ´çÃ·°³¼ö : " + result + "°³\t" + "1µîÀÔ´Ï´Ù!");
			} else if (result == 5 && bonus > 0) { // º¸³Ê½º°¡ ÀÖ°í, 5°³¸¦ ¸ÂÃèÀ»¶§
				System.out.println((j + 1) + "¹øÂ° ¼Õ´Ô ´çÃ·°³¼ö : " + result + "°³\t" + "2µîÀÔ´Ï´Ù!");
			} else if (result == 5) { // 5°³¸¦ ¸ÂÃèÀ»¶§
				System.out.println((j + 1) + "¹øÂ° ¼Õ´Ô ´çÃ·°³¼ö : " + result + "°³\t" + "3µîÀÔ´Ï´Ù!");
			} else if (result == 4) { // 4°³¸¦ ¸ÂÃèÀ»¶§
				System.out.println((j + 1) + "¹øÂ° ¼Õ´Ô ´çÃ·°³¼ö : " + result + "°³\t" + "4µîÀÔ´Ï´Ù!");
			} else if (result == 3) { // 5°³¸¦ ¸ÂÃèÀ»¶§
				System.out.println((j + 1) + "¹øÂ° ¼Õ´Ô ´çÃ·°³¼ö : " + result + "°³\t" + "5µîÀÔ´Ï´Ù!");
			} else {// ²Î
				System.out.println((j + 1) + "¹øÂ° ¼Õ´Ô ´çÃ·°³¼ö : " + result + "°³\t" + "²ÎÀÔ´Ï´Ù!");
			}
			result = 0;
			bonus = 0;
		}

	}
}
