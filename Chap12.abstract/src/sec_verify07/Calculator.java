package sec_verify07;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double a;
		double b;
		String operator;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("두 정수와 연산자를 입력하시오.");
			a = Double.parseDouble(scan.next());
			if(a == -1)
				break;
			b = Double.parseDouble(scan.next());
			operator = scan.next();
			if(operator.equals("+")){
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
			}
			else if(operator.equals("-")) {
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
			}
			else if(operator.equals("*")) {
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
			}
				
			else if(operator.equals("/")) {
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				}
		}
		System.out.println("종료합니다.");
		scan.close();
	}
}
