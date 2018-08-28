package sec01_verify;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		int input;
		
		System.out.println("input : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		int[] arr = new int[input];
		for(int i = 0; i<input; i++) {
			System.out.println("num["+i+"] = " + arr[i]);
		}
		
		scan.close();
	}

}
