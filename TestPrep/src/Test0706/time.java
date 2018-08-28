package Test0706;

import java.util.Scanner;

public class time {

	public static void main(String[] args) {
		int minute =0;
		int hour =0;
		int sec =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int input = scan.nextInt();
		hour = input / 3600;
		minute = (input-hour*3600) /60;
		sec = input%60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다. ", input, hour, minute, sec);
		scan.close();
	}
}
