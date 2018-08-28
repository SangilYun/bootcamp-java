package sec04.exam03_mouse_event;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventClass extends Frame{

	private Label location;
	
	public MouseEventClass(String title) {
		super(title);	//frame(String title)을 호출한다.
		this.setLocation(500,300);
	}
	
	public void MouseShow() {
		this.location = new Label("");
		this.location.setSize(195,15);
		this.location.setLocation(50,50);
		
		this.location.setBackground(Color.yellow);
		this.add(location);
		
		//EventHandler의 인스턴스를 Frame의 Listener로 등록한다.
		//MouseMotionListener 인터페이스는 마우스의 움직임을 감지하는 
		//리스너이다. 
		this.addMouseMotionListener(new EventHandler());
		this.setSize(300, 200);
		this.setLayout(null);
		this.setVisible(true);
		//윈도우 이벤트 작성 -- 익명자식객체로 만듬
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		//윈도우리스너 등록
		this.addWindowListener(wa);	
	}
	//중첩 클래스 --MouseAdapter
	class EventHandler extends MouseAdapter{
		@Override
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse 좌표 : (" + e.getX() + ", " + e.getY() + ")");
		}
	}
				 
//		@Override
//		publi void mouse
		
}

