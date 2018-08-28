package sec03.exam03_GridLayout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayout_Example {

	public static void main(String[] args) {
		 
		Frame f = new Frame("GridLayoutTest");
		f.setSize(300,300);
		f.setLayout(new GridLayout(3,2));  //3행 2열의 테이블을 만든다.
		
		//3행 2열의 테이블을 만든다.(단 갭을 10씩 설정)
		f.setLayout(new GridLayout(3,2,10,10));
		f.add(new Button("1"));	//추가되는 순서대로 Button에 번호를 붙였다. 
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
