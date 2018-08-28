package sec_verify07;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MouseEventFrame extends Frame{

	Label l1;
	Label l2;
	
	public MouseEventFrame(String s) {
		super(s);
	}
	
	public void MouseShowExample() {
		this.setSize(200, 300);
		this.setLayout(new FlowLayout());
		l1= new Label("Love Java");
//		l1.setBackground(Color.YELLOW);
		this.add(l1);
		l1.addMouseListener(new EventHandler());
		this.addWindowListener(new WindowEventHandler());
		this.addMouseListener(new EventHandler());

		this.setVisible(true);
		
	}
	
	class WindowEventHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("종료");
			e.getWindow().setVisible(false);	//화면 숨기기(메모리 제거 안됨)
			e.getWindow().dispose(); 	//메모리 정리
			System.exit(0); 	//프로그램 종료
		}
	}
	
	class EventHandler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			l1.setText("Love java");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			l1.setText("사랑해");
			
		}
	}
}
