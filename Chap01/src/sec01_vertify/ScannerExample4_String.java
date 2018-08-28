package sec01_vertify;

import java.util.Scanner;

public class ScannerExample4_String {

	public static void main(String[] args) {
		System.out.println("input 입력 ");
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		

		System.out.println("입력한 문자열은 " + input + "입니다.");

		
		sc.close();
	}

}
