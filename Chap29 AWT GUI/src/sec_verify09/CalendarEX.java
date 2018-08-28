package sec_verify09;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEX extends Frame{

	Button b1;
	Button b2;
	Label l;
	Calendar cal;
	SimpleDateFormat sdf;
	public CalendarEX() {
		super("Scheduler");
	}
	
	public void test() {
		cal = Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년 MM월");
		
		b1 = new Button("<");
		l = new Label(sdf.format(cal.getTime()));
		b2 = new Button(">");
		this.setLayout(new FlowLayout());
		this.setSize(300, 100);
		this.add(b1);
		this.add(l);
		this.add(b2);
		this.setBackground(Color.YELLOW);
		
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
		
		this.setVisible(true);	
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

