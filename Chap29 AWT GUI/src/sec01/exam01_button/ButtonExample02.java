package sec01.exam01_button;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample02 {

	public static void main(String[] args) {
		 
		Frame f = new Frame("Login");
		f.setSize(300,200);
		f.setLayout(null);	//레이아웃 매니저의 설정을 해제한다.
		
		Button b1 = new Button("확인");
		b1.setSize(100,50);	//Button1의 크기를 설정한다.
		b1.setLocation(40,75);	//Frame내에서의 Button1의 위치를 설정한다.
		
		Button b2 = new Button("취소");
		b2.setSize(100,50);		//Button2의 크기를 설정한다.
		b1.setLocation(160,75);		//Frame내에서의 Button2의 위치를 설정한다.
		
		
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
		f.setResizable(false);	//true하면 조절 가능.

	}

}
