package sec01.exam09_ScrollBar;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollBarExample {

	public static void main(String[] args) {
		 //scrollbar는 사용자가 정해진 범위 내에 있는 값을 쉽게 선택할 수 있도록 해주는 컴포넌트이다.
		//주로 볼륨설정이나, 속도조절, 생상 선택과 같은 곳에 사용된다.
		
		Frame f = new Frame();
		f.setSize(300,200);
		f.setLayout(null);
		
		//수평 스크롤바
		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0,90,0,100);//(hor|ver, 초기값, 스크롤크기, 최소값,최대값)
		hor.setSize(100,15);
		hor.setLocation(60,120);
		
		//수직 스크롤바
		Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 50,20,0,100);
		ver.setSize(15,100);
		ver.setLocation(30,30);
		f.add(hor);
		f.add(ver);
		f.setVisible(true);

	}

}
