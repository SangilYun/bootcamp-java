package sec01_verify;

import java.util.Scanner;

public class Computer_v3 {
	
	int sum=0;
	int[] arr;
	 
	 int sum(int[] values) {
		 for(int i=0; i<values.length;i++) {
			 sum += values[i];
		 }
		 return sum;
	}
	 
	 void assign(Scanner scan) {
		System.out.println("1차원 배열을 만듭니다. 배열 수 입력 : ");
		int input = scan.nextInt();
		arr = new int[input];
		for(int i=0; i<arr.length;i++) {
				System.out.println("Value["+i+"] = ");
				arr[i] = scan.nextInt();
			}
			System.out.println("출력");
			 for(int i=0; i<arr.length;i++) {
				 System.out.println("arr["+i+"] = "+arr[i]);
				 }
	 }

	 static void test() {
		Scanner scan = new Scanner(System.in);

		Computer_v3 test1 = new Computer_v3();
		test1.assign(scan);
		System.out.println("Computer instance member method sum (test1) : " +test1.sum(test1.arr));
		
		System.out.println();
		
		Computer_v3 test2 = new Computer_v3();
		test2.assign(scan);
		System.out.println("Computer instance member method sum 1(test2): " +test2.sum(test2.arr));

		scan.close();
	 }
	 
	
	 public static void main(String[] args) {
		 Computer_v3.test();
	 }
}
