package sec01_verify;

import java.util.Scanner;

public class Computer {
	int sum=0;
	int[] arr;
	 Computer() {
		System.out.println("1차원 배열을 만듭니다. 배열 수 입력 : ");
		Scanner scan = new Scanner(System.in);
		this.arr = new int[scan.nextInt()];
		for(int i=0; i<arr.length;i++) {
			System.out.println("Value["+i+"] = ");
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println("출력");
	 for(int i=0; i<arr.length;i++) {
		 System.out.println("arr["+i+"] = "+arr[i]);
		 }

	 }
	 
	 int sum() {
		 for(int i=0; i<arr.length;i++) {
			 sum += arr[i];
		 }
		 return sum;
	}
	 
	 static void test() {
		Computer test = new Computer();
		System.out.println("Computer instance member method sum : " +test.sum());
	 }
	 
	 public static void main(String[] args) {
		 Computer.test();
	 }
	 
}
