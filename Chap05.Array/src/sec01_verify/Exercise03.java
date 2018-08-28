package sec01_verify;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input;
		int count;
		System.out.println("input : ");
		input = scan.nextInt();
		
		int[] num = new int[input]; //input을 반영한 array 생성
		
		for(int i=0; i<input; i++) {	//input값을 저장.
		System.out.println("num["+i+"] = ");
		count = scan.nextInt();
		num[i] = count;
		}
		
		System.out.println("num = " + Arrays.toString(num) ); //출력
		scan.close();
	}

}
