package sec01_vertify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		
		System.out.println("초를 입력하세요 ");
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		time = Integer.parseInt(input);

		
		hour = time/3600;
		minute = (time - hour*3600)/60;
		second = time % 60;
		

		System.out.format("%d초는, %d시간, %d분, %d초 입니다.", time ,hour,minute,second);

		
		sc.close();
	}

}
