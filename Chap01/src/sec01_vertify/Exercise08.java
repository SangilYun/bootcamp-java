package sec01_vertify;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
//		int fahrenheit ;
		float celcius ;
		System.out.print("화씨 온도를 입력하요 ");
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
//		System.out.println(input);
		
		float num1 = Float.parseFloat(input);
		
		celcius = ((num1-32)*5)/9;
		
		System.out.format("입력한 화씨온도를 섭씨온도로 변환한 값 : %.2f" , celcius);


		sc.close();
		
	}

}
