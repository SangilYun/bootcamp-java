package sec_verify11;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BouncingBall extends Frame{

	int loc_x;
	int loc_y;
	int vel_x;
	int vel_y;
	final int CIRCLE_W=20;
	final int CIRCLE_H=20;
	public BouncingBall() {
		super("Bouncing Ball");
	}
	
	public void test() {
		this.setSize(500,500);
		this.setVisible(true);
		
		loc_x = ((int)(Math.random()*400))+CIRCLE_W/2;
		loc_y = ((int)(Math.random()*400))+CIRCLE_H/2;
		vel_x = 2;
		vel_y = 2;
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		while(true)
			try {
				Thread.sleep(10);
				repaint();

			}catch(InterruptedException e) {}
	}
	
	public void paint(Graphics g) {

		g.setColor(Color.red);
		loc_x += vel_x;
		loc_y += vel_y;
		//공이 그려지는 좌표가 아니라 공의 경계에서 다시 튕겨오게 하기 위해서 
		//+- 공의 지름을 해준다.
		if(loc_x <0 || loc_x >500-CIRCLE_W)
			vel_x*=-1;
		else if(loc_y<0+CIRCLE_H || loc_y>500-CIRCLE_H)
			vel_y*=-1;
		g.fillOval(loc_x, loc_y, 20, 20);
	}
}
