package sec_verify01;

import java.util.Calendar;

public class GoodMorningExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println("지금은 " + now.get(Calendar.HOUR) + "시 "+ 
				now.get(Calendar.MINUTE)+"분입니다.");
		if(now.get(Calendar.HOUR_OF_DAY)>4 && now.get(Calendar.HOUR_OF_DAY)<12){
			System.out.println("오전이네요");
		}
		else if(now.get(Calendar.HOUR_OF_DAY) < 18) {
			System.out.println("오후");
		}
		else if(now.get(Calendar.HOUR_OF_DAY)<22) {
			System.out.println("저녁");
		}
		else {
			System.out.println("밤");
		}
	}
}
