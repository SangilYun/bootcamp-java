package sec_verify07;

import java.util.Scanner;

public class MyclassExceptionExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 while(true) {
			 System.out.println("0~100 사이의 정수를 입력하세요.(종료를 원하면 -1을 입력)");
			 int input = scan.nextInt();
			 try {
				 if(input ==-1) {
					 System.out.println("-1을 입력하셨군요. 프로그램을 종료합니다. ");
					 break;
				 }
				 
				 else if(input <0 || input>101) {
					 throw new MyException("입력 값이 범위를 초과하였습니다.");
				 }
				 
				 System.out.println(input);
			 }
			 catch(MyException e) {
				 System.out.println("예외가 발생하였지만 프로그램 정상 종료."); 
			 }
		 }

		 scan.close();
	}

}
