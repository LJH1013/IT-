import java.util.Arrays;

public class Lotto {
	String text;
	String lottoNumbers() {
		 
        int[] lottoNums = new int[7];
 
        for(int i=0; i<=6; i++){
            lottoNums[i] = (int) (Math.random()*45+1);
        }
         
        // Á¤·Ä
        Arrays.sort(lottoNums);
 
        return Arrays.toString(lottoNums);
    }

}
