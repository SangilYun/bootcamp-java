package sec01_verify;

import java.util.Scanner;

public class Computer_v2 {
	int sum=0;
	int[] arr;
	 Computer_v2() {
		System.out.println("1차원 배열을 만듭니다. 배열 수 입력 : ");
		Scanner scan = new Scanner(System.in);
		this.arr = new int[scan.nextInt()];
		scan.close();
	 }
	 
	 int sum() {
		 for(int i=0; i<arr.length;i++) {
			 sum += arr[i];
		 }
		 return sum;
	}
	 
	 void assign() {
		 for(int i=0; i<this.arr.length;i++) {
				System.out.println("Value["+i+"] = ");
				Scanner scan = new Scanner(System.in);
				this.arr[i] = scan.nextInt();
				scan.close();
			}
			System.out.println("출력");
			 for(int i=0; i<this.arr.length;i++) {
				 System.out.println("arr["+i+"] = "+this.arr[i]);
				 }
	 }

	 static void test() {
		Computer_v2 test = new Computer_v2();
		test.assign();
		System.out.println("Computer instance member method sum : " +test.sum());
	 }
	 
	
	 
	 public static void main(String[] args) {
		 Computer.test();
	 }
	 
}
