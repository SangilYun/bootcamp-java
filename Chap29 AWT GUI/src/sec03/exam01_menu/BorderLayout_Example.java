package sec03.exam01_menu;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayout_Example {

	public static void main(String[] args) {
		 
		Frame f = new Frame("BorderLayoutTest");
		f.setSize(300,300);
		//Frame은 기본적으로 BorderLayout로 설정되어 있으므로 따로 설정하지 않아도 된다. 
		f.setLayout(new BorderLayout(10,10));	//각 영역의 간격을 수직,수평
		Button north = new Button("North");
		Button south = new Button("South");
		Button west = new Button("West");
		Button east = new Button("East");
		Button center = new Button("Center");
		//Frame의 5개의 각 영역에 Button을 하나씩 추가한다.
		//아래는 BorderLayout의 상수들로 각각의 영역에 버튼을 추가하였다.
		//f.add("North",north)나 혹은 f.add(north,"North")와 같이 쓸 수도 있다.
		//하지만, 아래와 같이 적는 것이 가독성이 좋다.
		f.add(BorderLayout.NORTH, north);
		f.add(BorderLayout.SOUTH, south);
		f.add(BorderLayout.WEST, west);
		f.add(BorderLayout.EAST, east);
		f.add(BorderLayout.CENTER, center);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
