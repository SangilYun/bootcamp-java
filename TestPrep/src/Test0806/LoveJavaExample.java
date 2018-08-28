package Test0806;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoveJavaExample {

	public static void main(String[] args) {
		Frame f = new Frame("Love Java");
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		Label l = new Label("Love Java");
		f.add(l);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		l.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				l.setText("Love Java");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				l.setText("자바");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		f.setVisible(true);
		

	}

}
