package sec_verify08;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Timer extends Frame{

	String time;
	static Calendar cal ;
	static SimpleDateFormat sdf;
	
	public Timer() {
		super("");
	}
	
	public void showTime() {
		this.setSize(300, 20);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		super.setTitle("123123");
		this.setVisible(true);
		while(true) {
			cal = Calendar.getInstance();
			SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss a");
			
			this.setTitle(sdf.format(cal.getTime()));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
}
