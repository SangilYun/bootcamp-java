package sec_verify04;

import java.util.Calendar;
import java.util.Scanner;

public class DayOfWeekExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		String[] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("날짜를 yyyy/mm/dd의 형태로 입력해 주세요");
			String input = scan.nextLine();
			String[] date = input.split("/");
			cal.set(Integer.parseInt(date[0]), Integer.parseInt(date[1])-1, Integer.parseInt(date[2]));
			System.out.println("입력하신 날짜는 : " + days[cal.get(Calendar.DAY_OF_WEEK)-1]);
			scan.close();
			break;
			
			}catch(Exception e) {
					System.out.println("양식대로 입력하세요");
				}
			}
	}
}
