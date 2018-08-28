package sec01_verify;
import java.util.Arrays;


public class Exercise08 {

	public static void main(String[] args) {
		int[] code = new int[] {-9,-55,73,116,101,205,1000};
		int[] arr = new int[10];
	
		for(int i=0; i<arr.length;i++) {	//code배열에 있는 값 중 무작위로 선별
			int ran = (int)(Math.random()*6);
			arr[i] = code[ran];
		}
		System.out.println(Arrays.toString(arr));
	}
}
