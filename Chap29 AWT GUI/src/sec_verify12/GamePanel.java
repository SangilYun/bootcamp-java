package sec_verify12;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GamePanel extends Frame{
	Label[] labels = new Label[3];
	Label state;
	GamblingThread th;


	public GamePanel() {
		super("Gambling");
		this.setVisible(true);
	}
	
	public void test() {
		//initializing
		this.setSize(300, 200);
		this.setBackground(Color.blue);
		this.setLayout(null);

		//add labels
		for(int i=0;i<labels.length;i++) {
			labels[i] = new Label("0");
			labels[i].setBackground(Color.white);
			labels[i].setSize(60, 30);
			labels[i].setLocation(30+70*i, 50);
			this.add(labels[i]);
		}
		
		//add 게임상태
		state = new Label("시작을 클릭하면 게임을 시작합니다.");
		state.setBounds(30, 120, 290, 20);
		this.add(state);

		//add buttons
		Button start = new Button("시작");
		start.setBounds(50,150,50,40);
		Button end = new Button("종료");
		end.setBounds(130,150,50,40);
		this.add(start);
		this.add(end);

		//add listener
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th =new GamblingThread(labels, state);
			}
		});
		
		end.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}	
}
