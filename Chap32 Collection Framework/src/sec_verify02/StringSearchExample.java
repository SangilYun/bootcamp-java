package sec_verify02;

import java.util.Scanner;

public class StringSearchExample {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 이름을 입력하겠습니까?");
		input = scan.nextInt();
		longStringSearch lss = new longStringSearch(input);
		lss.listPrint();
		lss.longestString();
		
		scan.close();
	}
}
