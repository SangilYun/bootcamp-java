package sec01_vertify;
import java.util.Scanner;  

public class ScannerExample {
 
	public static void main(String[] args) {
		System.out.println("num1");
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		int num1 = Integer.parseInt(input);
		
		System.out.println("num1 입력 : " + num1);

		System.out.println("num2");
		String input2 = sc.nextLine();
		int num2 = Integer.parseInt(input2);
		
		System.out.println("num2 입력 : " + num2);
		
		System.out.println("result : " + (num1 + num2));

		sc.close();
	}

}
