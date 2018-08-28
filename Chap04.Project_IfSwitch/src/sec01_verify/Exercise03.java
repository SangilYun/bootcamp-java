package sec01_verify;
import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int res=0;
		int op=0;
		String arith = null;
		
		System.out.println("두개의 정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("연산기호를 입력하세요.(1:+ , 2:-, 3:x, 4:/, 5:%)");
		op=scan.nextInt();
		/*
		switch(op){
		case 1: res = num1+num2;
				arith = "+";
		break;
		case 2: res = num1-num2;
				arith = "-";
		break;
		case 3: res = num1*num2;
				arith = "*";
		break;
		case 4: res = num1/num2;
				arith = "/";
		break;
		case 5: res = num1%num2;
				arith = "%";
		break;

		}
		
		System.out.println((arith != null) ? num1+ arith + num2 +"=" + res : "Error");
		scan.close();*/
		
		
		if(op == 1) {
			res = num1+num2;
			arith = "+";
		}
		else if(op == 2) {
			res = num1-num2;
			arith = "-";
		}
		else if(op == 3) {
			res = num1*num2;
			arith = "*";
		}
		else if(op == 4) {
			res = num1/num2;
			arith = "/";
		}
		else if(op == 5) {
			res = num1%num2;
			arith = "%";
		}
		System.out.println((arith != null) ? num1+ arith + num2 +"=" + res : "Error");
		
		scan.close();
	}

}
