package sec05.exam03_graphics_image02;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsExample extends Frame implements MouseMotionListener{

	Image img = null;
	int width=0;
	int height=0;
	
	//생성자
	public GraphicsExample(String title) {
		super(title);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//이미지 경로 직접 설정함(절대경로)
		img = toolkit.getImage("/Users/yunsangil/Documents/computing/JAVA/Chap29 AWT GUI/src/sec05/images/QR.jpeg");
		
		//Frame을 (100,100)의 위치에 width 500, height 500크기로 보이게 한다. 
		this.setBounds(100,100,1000,1000);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		
		
		if(img == null) {
			System.out.println("Image객체가 없습니다.");
			return;
		}
		//현재 프레임의 가로, 세로를 구하는 것.
		width= this.getWidth();
		height= this.getHeight();
		System.out.println("프레임 가로 길이 : " + width + "프레임의 세로길이 : " + height);
		//로딩된 이미지의 width와 height를 구한다. 역시 ImageObserver를 this로 설정하고 있다. 
		int imgWidth = img.getWidth(this);
		int imgHeight = img.getHeight(this);
		System.out.println(Thread.currentThread().getName());
		System.out.println("이미지 가로 길이 : " + imgWidth + "이미지 세로 길이 : " + imgHeight);
		//이미지를 Frame의 중앙에 출력한다. 
		g.drawImage(img,(this.getWidth() - imgWidth)/2 , (this.getHeight() - imgHeight)/2,this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
