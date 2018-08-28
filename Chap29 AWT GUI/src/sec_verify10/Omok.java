package sec_verify10;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Omok extends Frame{
	final int CIRCLE_WIDTH=40;
	final int CIRCLE_HEIGHT=40;
	int x;
	int y;
	int mouseInput;
	Image img = null;
	Graphics gImg = null;
	
	public Omok() {
		super("OmokTest");
	}
	
	public void test() {

		this.setSize(700, 700);
		this.setVisible(true);
		this.img = this.createImage(500,500); 	
		this.gImg = img.getGraphics();
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//identifying mouse button
				if(e.getModifiers() == MouseEvent.BUTTON1_MASK) {
					mouseInput = 0;
				}
				else if(e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					mouseInput = 1;
				}
				//adjusting X coordinate
				if(e.getX()%100 >25 && e.getX()%100 <75) {
					x =(e.getX()/100)*100+50;
				}else {
					x =(int)(Math.round(e.getX()/100.0)*100);
				}
				
				//adjusting Y coordinate
				if(e.getY()%100 >25 && e.getY()%100 <75) {
					y =(e.getY()/100)*100+50;
				}else {
					y =(int)(Math.round(e.getY()/100.0)*100);
				}
				repaint();
			}
		});
		gImg.setColor(Color.WHITE);
		gImg.fillRect(100, 100, 400, 400);
		gImg.setColor(Color.black);
	    for(int row=150; row<500;row+=50) {
	    	for(int col=150;col<500;col+=50) {
	    		gImg.drawLine(100, col, 500, col);	//drawing row
	    		gImg.drawLine(row,100,row,500);	//drawing col
	    	}
	    }
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		if(img!=null) {
	    if(mouseInput ==1) //left click -> black circle
		    gImg.drawOval(x-CIRCLE_WIDTH/2, y-CIRCLE_HEIGHT/2, CIRCLE_WIDTH, CIRCLE_HEIGHT);
	    else if(mouseInput ==0) {				//right click -> white circle
	    	gImg.setColor(Color.BLACK);
	    	gImg.fillOval(x-CIRCLE_WIDTH/2, y-CIRCLE_HEIGHT/2, CIRCLE_WIDTH, CIRCLE_HEIGHT);
	    }
		g.drawImage(img, 0, 0, this);
		}
	}	
}