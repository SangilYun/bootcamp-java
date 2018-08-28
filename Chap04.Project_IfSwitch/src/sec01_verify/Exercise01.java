package sec01_verify;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		double weight = 0;
		double height = 0;
		double bmi = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력하세요 : ");
		height= scan.nextDouble();
		
		System.out.println("몸무게를 입력하세요 : ");
		weight = scan.nextDouble();
		
		bmi = (weight/(height*height))*100*100;
		System.out.println(bmi);
		System.out.println((bmi>20 && bmi<25) ? "표준입니다." : "체중관리가 필요합니다.");
		
		scan.close();
	}
}
