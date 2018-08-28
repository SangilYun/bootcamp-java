package sec_verify05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DayDifferenceExample {

	public static void main(String[] args) {
		try {
		System.out.println("2016년01월03일 - 2016년 02월 01일의 차이 : " + getDayDiff("20160103","20160201") + "일");
		System.out.println("2016년01월03일 - 2016년 01월 03일의 차이 : " + getDayDiff("20160103","20160103") + "일");
		System.out.println(" " + getDayDiff("20010103","200103"));
		}
		catch(Exception e) {
			System.out.println("파싱 예외 발생");
		}
	}
	
	public static long getDayDiff(String s1, String s2) throws Exception {
		
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
		Date date1 = myFormat.parse(s1);
	    Date date2 = myFormat.parse(s2);
	    long diff = date2.getTime() - date1.getTime();
//	    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
}
