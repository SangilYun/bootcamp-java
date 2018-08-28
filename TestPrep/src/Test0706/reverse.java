package Test0706;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 : ");
		int arr[] = new int[scan.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			int ranNum = (int)(Math.random()*100) + 1;
			arr[i] = ranNum;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));

		scan.close();
	}
}
