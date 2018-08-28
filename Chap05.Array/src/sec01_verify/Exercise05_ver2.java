package sec01_verify;
import java.util.Arrays;


public class Exercise05_ver2 {

	public static void main(String[] args) {
		int[] numArr = new int[] {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println("before : " + Arrays.toString(numArr));
		for(int i =0; i<numArr.length; i++) {
			int randomPosition = (int)(Math.random()*9); //배열 임의 position 값과 i번째 값을 바꾼다.
			int tmp = numArr[randomPosition];
			numArr[randomPosition] = numArr[i];
			numArr[i] = tmp;
		}
		System.out.println("after : "+Arrays.toString(numArr));	
	}
}
