package sec03.exam05_Calculator_Example;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator_Example {

	public static void main(String[] args) {
		 
		Frame f = new Frame("계산기");
		f.setSize(190,160);
		f.setLayout(new BorderLayout());
		
		TextField tf = new TextField("0");
		//tf.setEditable(false); //TextField의 값을 수정 못하게 함.
		String[] buttons = {"7","8","9","/","CE","4","5","6","*","BS","1","2","3","-"
				,"1/x","0","+/-",".","+","="};
		
		f.add(tf,BorderLayout.NORTH);
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(4, 5));
		for(int i=0; i<buttons.length; i++) {
			p.add(new Button(buttons[i]));
		}

		f.add(p,BorderLayout.CENTER);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
//		f.setResizable(false);
		f.setVisible(true);

	}

}
