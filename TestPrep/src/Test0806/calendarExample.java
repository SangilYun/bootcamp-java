package Test0806;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarExample {

	public static void main(String[] args) {
		Frame f = new Frame("calendar");
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		Label l = new Label(sdf.format(cal.getTime()));
		Button b1 = new Button("<");
		Button b2 = new Button(">");
		
		f.add(b1);
		f.add(l);
		f.add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cal.add(Calendar.MONTH, -1);
				l.setText(sdf.format(cal.getTime()));
			}
		});
		
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cal.add(Calendar.MONTH, 1);
				l.setText(sdf.format(cal.getTime()));
			}
		});
		f.setVisible(true);
	}
}