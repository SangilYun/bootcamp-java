package sec01_vertify;

import java.util.Scanner;

public class SwitchStringExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String position = null;
		
		System.out.println("급을 입력하세요 >> " );
		position = scan.nextLine();
		
		switch(position) {
		case "부장":
			System.out.println("500만원 ");
			break;
		case "차장":
			System.out.println("400만원 ");
			break;
		case "과장":
			System.out.println("350만원 ");
			break;
		case "대리 ":
			System.out.println("250만원 ");
			break;
		case "사원 ":
			System.out.println("150만원 ");
			break;
		default:
			System.out.println("300만");
		}
	    scan.close();

	}

}
