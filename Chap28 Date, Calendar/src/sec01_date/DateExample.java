package sec01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		 
		//Date클래스는 Time-Stamp기능으로 많이 사용한다.
		Date now = new Date(); //현재 시스템의 날짜와 시간을 구함
		String strNow1 = now.toString();
		System.out.println(strNow1);

		//Date클래스를 통해 인스턴스 생성후 SimpleDateFormat클래스의 format()을 
		//이용해서 원하는 형태로 출력할 수 있다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년, MM월 dd일 E(요일) a hh시 mm분 ss초");
		String strNow2 = sdf.format(now);					//대소문자 구분해야 한다.
		System.out.println(strNow2);
	}

}
