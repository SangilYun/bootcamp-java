package sec01_verify;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		int[] month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		int input;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("달을 입력하세요");
		input = scan.nextInt();
		System.out.println(input + "월의 일수는 "+month[input-1]+"일 입니다.");
		scan.close();
	}
}
