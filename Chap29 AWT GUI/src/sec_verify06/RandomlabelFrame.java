package sec_verify06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class RandomlabelFrame {

	public static void main(String[] args) {
		Frame f = new Frame("Random Labels");
		f.setSize(500,500);
		f.setLayout(null);
		Random r = new Random();
		for(int i=0; i<20; i++) {
			Label l = new Label(""+i);
			l.setSize(30, 30);
			l.setBackground(Color.blue);
			l.setLocation(r.nextInt(350)+50,r.nextInt(350)+50);
			
			f.add(l);
		}
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
//		f.setBackground(Color.white);
		f.setVisible(true);
	}
}
