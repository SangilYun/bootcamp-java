package sec_verify01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame {

	public static void main(String[] args) {
		Frame f = new Frame("MyFrame");
		
		Button b1 = new Button("North");
		f.setLayout(new BorderLayout(10,10));
		f.add(b1, BorderLayout.PAGE_START);
		
		Button b2 = new Button("West");
		f.add(b2, BorderLayout.LINE_START);
		Button b3 = new Button("Center");
		f.add(b3,BorderLayout.CENTER);
		Button b4 = new Button("East");
		f.add(b4,BorderLayout.LINE_END);
		Button b5 = new Button("South");
		f.add(b5,BorderLayout.PAGE_END);
		
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setSize(300,200);
		f.setVisible(true);
	}
}
