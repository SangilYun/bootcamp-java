package sec_verify03;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;

public class TenButtonFrame {

	public static void main(String[] args) {
		 
		Frame f = new Frame("Ten Buttons Frame");
		f.setLayout(new BoxLayout(f, BoxLayout.LINE_AXIS));
		Color[] arr = {Color.RED, Color.ORANGE, Color.YELLOW, 
				Color.GREEN,Color.CYAN, Color.BLUE, Color.MAGENTA, 
				Color.GRAY,Color.PINK, Color.LIGHT_GRAY};
		for(int i=0; i<10; i++) {
			Button b = new Button(i+"");
			b.setBackground(arr[i]);
			f.add(b, f);
		}
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setSize(500, 300);
		f.setVisible(true);
	}
}
