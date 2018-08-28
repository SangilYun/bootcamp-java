package sec05.exam02_graphics_image01;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsExample extends Frame implements MouseMotionListener{

	int x=0;
	int y=0;
	
	//필드로 Image객체와 Graphics객체를 선언했다.
	Image img = null;
	Graphics gImg = null;
	
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
		//frame을 (100,100)의 위치에 width 500pixel, height 500pixel의 크기로 보이게 한다.
		this.setBounds(100,100,500,500);
		this.setVisible(true);
		
		/*
		 * Image와 Image의 Graphics를 멤버변수로 정의하고, 생성자에서 createImage()를 통해서
		 * Frame과 같은 크기의 Image를 생성하고, 생성된 Image에서 getGraphics()를 호출하여
		 * Image에 대한 Graphics를 얻는다. 이렇게 해서 얻어진 Graphics에 drawString()과
		 * 같은 메서드를 호출해서 작업한 내용은 Image에 그려지게 된다. 
		 */
		this.img = this.createImage(500,500); 	//가상화면이 될 이미지클래스
		this.gImg = img.getGraphics();
		this.gImg.drawString("왼쪽버튼을 누른 채로 마우스를 움직여 보세요", 10, 50);
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		if(img!=null) {
			/*
			 * 가상화면에 그려진 그림을 Frame에 복사하고 있다.
			 * 이 부분이 Image에 그려진 내용을 계속 this(frame)에 복사하고 있다.
			 * 따라서 다른 화면에 가려져 다시 보여도 그대로인 것이다. 
			 * 여기서 ImageObserver를 this로 설정을 해주는데 ImageObserver인터페이스는
			 * 모든 컴포넌트 클래스가 구현한 인터페이스인데, 이미지가 로딩되는데 시간이 
			 * 걸리기 대문에 로딩이 진행되는 상태에 따라 화면에 다시 그려줘야 할 필요가 있다.
			 * 그래서 이미지가 로딩되고 있는 상태를 알려줄 대상을 ImageObserver로 
			 * 지정해야 한다.
			 * 그래서 보통 component자신을 넣어주는 것이다. 
			 */
			System.out.println(Thread.currentThread().getName());
			g.drawImage(img, 0, 0, this);
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// *로 그림을 그리고 있다. 물론 왼쪽버튼을 누른채 말이다. 
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			this.x=e.getX();
			this.y=e.getY();
			gImg.drawString("*", this.x, this.y);
			repaint();
		}
		/*
		 if(e.getModifiersEx()!=MouseEvent.Button1_DOWN_MASK)
		 	return;
		 /으로 그림을 그린다.
		 gImg.drawLine(this.x,this.y,e.getX(),e.getY());
		 this.x=e.getX();
		 this.y=e.getY();
		 repaint();
		 */
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
}
