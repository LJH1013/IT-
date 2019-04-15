package Alpha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Aplha_Exam {
	public static void main(String[] args) {
		File file = new File("C:\\Windows\\win.ini");
		List<String[]> sList = new ArrayList<String[]>();
		int[] alpha = new int[26];
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				sList.add(scan.nextLine().split(" "));
				System.out.println(Character.getNumericValue('A'));
				//System.out.println(Integer.parseInt(';'));
				for(int i = 0 ; i < sList.size(); i++) {
					
					for(int j = 0 ; j < sList.get(i).length; j++) {
						System.out.println(sList.get(i)[j]);
						for(int k = 0; k < sList.get(i)[j].length(); k++) {
							//System.out.println(sList.get(i)[j].charAt(k));
							//System.out.println(Integer.parseInt(sList.get(i)[j]));
							if((int)(sList.get(i)[j].charAt(k)) > 64 && (int)(sList.get(i)[j].charAt(k)) < 92) {
								alpha[(int)(sList.get(i)[j].charAt(k))]++;
							}
						}
						
						 
					}
					
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0 ; i < alpha.length ; i++) {
			System.out.print(alpha[i] + "\t");
		}
	
	}
}
