package sec_verify05;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Plate4x4Frame {

	public static void main(String[] args) {
		Frame f  = new Frame("4x4 Color Frame");
		f.setLayout(new GridLayout(4, 4));
		Color[] arr = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA}; 
		
		for(int i=0; i<16; i++) {
			Label l = new Label(""+i+"");
			l.setBackground(arr[i]);
			f.add(l);
		}

		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		f.setSize(500, 200);
		f.setVisible(true);
	}

}
