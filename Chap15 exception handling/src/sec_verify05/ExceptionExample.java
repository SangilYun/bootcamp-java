package sec_verify05;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		 
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를 입력하세요 : ");
		a = scan.nextInt();
		
		System.out.println("수를 입력하세요 : ");
		b = scan.nextInt();
		scan.close();
		try {
			if(b==0) {
				throw new Exception("예외 발생 : 0");
			}
			System.out.println("나눗셈 결과 : " + a/b);
		}
		catch(Exception e){
			System.out.println(e.getMessage()+"으로 나눌 수 없습니다.");
		}
	}

}
