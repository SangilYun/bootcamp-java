package sec01_vertify;

import java.util.Scanner;

public class ScannerExample3 {

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
		
		String converted2 = String.format("%.1f", num1-num2);
		String converted3 = String.format("%.1f", num1/num2);
		String converted4 = String.format("%.1f", num1*num2);



		System.out.format("result(더하기) : " + "%.1f \n" ,num1 +num2);
		System.out.println("result(빼) : " + converted2);
		System.out.println("result(나누기) : " + converted3);
		System.out.println("result(곱하기) : " + converted4);




		sc.close();

	}

}
