package sec_verify08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeThread extends Thread{

	String date ;
	Calendar c;
	SimpleDateFormat sdf;
	
	public DateTimeThread() {
		c = Calendar.getInstance();
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	}
	@Override
	public void run() {
		while(true) {
			c = Calendar.getInstance();
			date = sdf.format(c.getTime());
			try {
				System.out.println("오늘 날짜 및 시간 : " + date);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("데몬스레드가 종료됩니다.");
				break;
			}
		}
	}
	
}
