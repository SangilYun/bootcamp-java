package sec_verify06;

import java.util.Arrays;
import java.util.Scanner;

public class GoodCalc extends Calculator{

	@Override 
	public int add (int a, int b) {
		System.out.print("두 정수 " +a +", " +b +"의 합 : ");
		return a+b;
	}
	
	@Override
	public int subtract(int a, int b) {
		System.out.print("두 정수 " +a +", " +b +"의 빼기 : ");
		return a-b;
	}
	
	@Override
	public double average(int[] arr) {
		Scanner scan = new Scanner(System.in);
		double total = 0;
		System.out.println("몇개의 방을 만들까요? ");
		arr = new int[scan.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1+"번째 값 : ");
			arr[i]= scan.nextInt();
			total += arr[i];
		}
		
		System.out.print("배열" + Arrays.toString(arr)+"의 평균 : " );
		scan.close();
		
		return total / arr.length;
	}
	
	public static void main(String args[]) {
		GoodCalc test = new GoodCalc();
		System.out.println(test.add(2, 3));
		System.out.println(test.subtract(2, -13));
		int[] arr = null;
		System.out.printf("%.2f", test.average(arr));
	}
}
