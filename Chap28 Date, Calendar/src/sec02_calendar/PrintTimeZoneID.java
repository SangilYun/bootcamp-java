package sec02_calendar;


import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		 
		//모든 TimeZone의 ID값을 얻는다.
		String[] availableIDS = TimeZone.getAvailableIDs();
		
		for(String id : availableIDS) {
			System.out.println(id);
		}
		TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
		Calendar now = Calendar.getInstance(tz);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONDAY) +1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(year+"년 "+month+"월 "+day+ "일 "+hour+"시 "+minute+"분 "+second+"초 ");
		System.out.println(now.get(Calendar.MONDAY));
		System.out.println();
		
		//각각의 index값이 뭘 의미하는 건지..?
		System.out.println(now.get(0));
		System.out.println(now.get(1));
		System.out.println(now.get(2));
		System.out.println(now.get(3));
		System.out.println(now.get(4));
		System.out.println(now.get(5));


		
	}

}
