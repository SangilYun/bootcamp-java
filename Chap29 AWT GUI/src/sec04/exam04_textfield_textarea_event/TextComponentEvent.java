package sec04.exam04_textfield_textarea_event;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextComponentEvent extends Frame{

	TextField tf;
	TextArea ta;
	public TextComponentEvent(String s) {
		super(s);
		setSize(200,250);
	}
	
	public void textComponentShow() {
		this.setLayout(new BorderLayout());
		
		tf = new TextField();
		this.add(tf,BorderLayout.SOUTH);
		
		ta = new TextArea();
		this.add(ta,BorderLayout.CENTER);
		
		this.tf.addActionListener(new EventHandler());
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.setVisible(true);
	}
	/*
	 * ActionEvent가 발생되는 것은 4가지에 해당.
	 * 1.button이 눌러졌을 때
	 * 2.Menu를 클릭했을 때
	 * 3.TextField에서 Enter키를 눌렀을 때
	 * 4.List의 item하나를 선택하여 더블클릭 하였을 때 
	 */
	class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String input = tf.getText();
			ta.append(input+"\n");			
			tf.setText("");
		}
	}
}
