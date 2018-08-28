package sec01_verify;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise06 {

	public static void main(String[] args) {
		int input;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input : "); // get input
		input = scan.nextInt();
		
		int[] arr = new int[input]; // assign 0~input
		for(int i=0; i<input;i++) {
			arr[i]=i;
		}
		for(int i =0; i<arr.length; i++) { //shuffle
			int randomPosition = (int)(Math.random()*arr.length);
			int tmp = arr[randomPosition];
			arr[randomPosition] = arr[i];
			arr[i] = tmp;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int each : arr) { //printing
			System.out.print("each : ");
			for(int i =0; i<=each; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
