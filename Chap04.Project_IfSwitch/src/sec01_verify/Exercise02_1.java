package sec01_verify;

import java.util.Scanner;

public class Exercise02_1 {

	public static void main(String[] args) {
		char sel;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력하세요.");
		sel = scan.next().charAt(0);
		
		switch(sel) {
		case 'M':
		case 'm': System.out.println("오후.");
		break;
		
		case 'A':
		case 'a': System.out.println("오전.");
		break;
		
		case 'E':
		case 'e': System.out.println("저녁.");
		break;
		
		default : System.out.println("Error");
		
		}
		scan.close();
	}

}
