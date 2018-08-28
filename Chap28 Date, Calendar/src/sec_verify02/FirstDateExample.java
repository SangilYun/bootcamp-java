package sec_verify02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class FirstDateExample {

	public static void main(String[] args) {
		  TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
		  Calendar now = Calendar.getInstance(tz);
		  printCalendar("현재 ", now);

		  Calendar firstDate = Calendar.getInstance();
		  firstDate.clear();
		  firstDate.set(2012, 11, 25); // 2012년 12월 25일. 12월을 표현하기 위해 month에 11로 설정
		  firstDate.set(Calendar.HOUR_OF_DAY, 20); // 저녁 8시
		  firstDate.set(Calendar.MINUTE, 30); // 30분
		  printCalendar("처음 데이트한 날은 ", firstDate);	

	}
	
	public static void printCalendar(String s, Calendar cal) {
		String[] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONDAY) +1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		int hour = cal.get(Calendar.HOUR);
//		int minute = cal.get(Calendar.MINUTE);
//		int second = cal.get(Calendar.SECOND);
//		int millisec = cal.get(Calendar.MILLISECOND);

//		String strNow = s + year+"/"+month+"/"+day +"/"+ days[cal.get(Calendar.DAY_OF_WEEK)] +" " 
//				+cal.get() +(cal.get(cal.AM_PM)==0 ? "오전 " :"오후 ") + hour+"시 " + minute +"분 " + second+"초 "
//				+millisec +"밀리초";
							
//		System.out.println(strNow);
//		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/"+days[cal.get(Calendar.DAY_OF_WEEK)-1]
				+" (H시)h시"+(cal.get(cal.AM_PM)==0 ? " 오전 " :" 오후 ")+ "mm분 s초 S(밀리초)");
		String strNow2 = s + sdf.format(cal.getTime());
		System.out.println(strNow2);
	}

}
