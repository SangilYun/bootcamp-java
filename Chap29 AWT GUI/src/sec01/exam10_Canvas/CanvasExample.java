package sec01.exam10_Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class CanvasExample {

	public static void main(String[] args) {

		Frame f = new Frame("CanvasExample");
		f.setSize(300,200);
		f.setLayout(null);	//Frame의 LayoutManager설정을 해제한다.
		
		Canvas c = new Canvas();
		
		//Canvas의 배경을 빨간색(Red)으로 한다(Color의 클래스 필드)
		c.setBackground(Color.YELLOW);
		
		//setBouns는 frame의 안의 위치(x,y)를 50,50부터 시작한다.
		c.setBounds(50,50,150,100);
		
		//Canvas를 frame에 포함시킨다.
		f.add(c);
		f.setVisible(true);

	}

}
