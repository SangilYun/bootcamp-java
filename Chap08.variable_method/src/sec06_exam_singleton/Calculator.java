package sec06_exam_singleton;

import java.util.Scanner;

public class Calculator {

	void calculate() {
		System.out.println("두 정수와 연산자를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		String operator = scan.next();
		
		if(operator.equals("+")) {
			Add add = new Add();
			add.setValue(firstNum,secondNum);
			System.out.println(add.calculate());
		}
		else if(operator.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(firstNum, secondNum);
			System.out.println(sub.calculate());
		}
		else if(operator.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(firstNum, secondNum);
			System.out.println(mul.calculate());
		}
		else if(operator.equals("/")) {
			Div div = new Div();
			div.setValue(firstNum, secondNum);
			System.out.println(div.calculate());
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		Calculator test = new Calculator();
		test.calculate();
	}

}
