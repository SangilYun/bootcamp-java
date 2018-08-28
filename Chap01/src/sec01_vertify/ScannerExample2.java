package sec01_vertify;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		System.out.println("num1");
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		double num1 = Double.parseDouble(input);
		
		System.out.println("num1 입력 : " + num1);

		System.out.println("num2");
		String input2 = sc.nextLine();
		double num2 = Double.parseDouble(input2);
		
		System.out.println("num2 입력 : " + num2);
		
		System.out.println("result : " + (int)(num1 - num2));

		sc.close();

	}

}
