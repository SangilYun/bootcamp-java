package sec03_exam_enum;
import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		//calendar 클래스의 인스턴스를 받음(싱글톤)
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK); //일(1)~토(7)을 리턴함.
		int year=cal.get(Calendar.YEAR); //년도 리턴
		int month=cal.get(Calendar.MONTH); //월(0~11)을 리턴함.
		
		//int year=cal.get(Calendar.YEAR);
		//일, 요일, 시간, 분, 초 역시 위와 같은 방법으로 얻을 수 있다. API를 찾아보자.
		int minute=cal.get(Calendar.MINUTE);
//		int second=cal.get(Calendar.SECOND);
		
		System.out.println("올해는 : "+year);
		System.out.println("월은 : "+(month+1));
		System.out.println("현재 분 : "+minute);
		
		switch(week) {	//week는 1~7까지의 정수값을 가지고 있다.
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
		case 3:
			today=Week.TUESDAY;
		case 4:
			today=Week.WEDNESDAY;
		case 5:
			today=Week.THURSDAY;
		case 6:
			today=Week.FRIDAY;
		case 7:
			today=Week.SATURDAY;
		}
		System.out.println("오늘 요일 : "+today);
		if(today==Week.SUNDAY||today==Week.SATURDAY) {
			System.out.println("토,일에는 열심히 소주를 마십니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
}
