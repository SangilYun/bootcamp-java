package sec01.exam03_Choice;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceExample {

	public static void main(String[] args) {
		 
		Frame f = new Frame("Choie");
		f.setSize(300,200);
		f.setLayout(null);  //Layout 해제
		//Choice객체를 생성한 다음 Choice의 목록에 나타낼 값들을 추가한다.
		
		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");
		
		day.setSize(100,50);
		day.setLocation(100,70); 		//프레임이 윈도우에 대한 상대적 위치 
		
		f.add(day);
		f.setVisible(true);

	}

}
