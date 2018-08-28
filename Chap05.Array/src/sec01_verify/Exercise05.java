package sec01_verify;
import java.util.Arrays;
import java.util.Random;


public class Exercise05 {

	public static void main(String[] args) {
		int[] numArr = new int[] {0,1,2,3,4,5,6,7,8,9};
		Random rgen = new Random();
		
		System.out.println("before : " + Arrays.toString(numArr));
		for(int i =0; i<numArr.length; i++) {
			int randomPosition = rgen.nextInt(numArr.length);
			int tmp = numArr[randomPosition];
			numArr[randomPosition] = numArr[i];
			numArr[i] = tmp;
			
		}
		System.out.println("after : "+Arrays.toString(numArr));
		
	}

}
