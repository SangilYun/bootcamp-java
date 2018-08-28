package sec_verify03;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordCountExample {

	public static void main(String[] args) {
		try { 
		System.out.println("가장 긴 단어를 구하는 프로그램입니다. (종료 : Ctrl+z)");
		System.out.println("문자열을 입력하세요(공백은 문자에 미포함)");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String maxLen = input;
		for(int i=0; i<4; i++) {
			input = scan.nextLine();
			if(input.length() > maxLen.length()) {
				maxLen = input;
			}
		}
		System.out.println("가장 긴 단어는 " + maxLen+"입니다.");
		scan.close();
		}
		catch(NoSuchElementException e) {
			System.out.println("종료합니다.");
			System.exit(0);
		}

	}

}
