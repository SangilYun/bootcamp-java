package sec_verify03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SecondSundayExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 00,10);
		
		for(int i=0; i<cal.getActualMaximum(Calendar.MONTH);i++) {
		System.out.println(toString(cal));
		cal.add(Calendar.MONTH, 1);
		cal.setFirstDayOfWeek(2);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);		
		}
	}

	public static String toString(Calendar date) {
		String[] days = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 "+date.get(Calendar.DAY_OF_WEEK_IN_MONTH)
			+"번째 "+days[date.get(Calendar.DAY_OF_WEEK)-1]+"입니다.");
		String strDate =sdf.format(date.getTime());
		return strDate;
	}
}
