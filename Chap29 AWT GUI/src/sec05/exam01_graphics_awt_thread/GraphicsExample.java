package sec05.exam01_graphics_awt_thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsExample extends Frame implements MouseMotionListener{

	int x=0;
	int y=0;
	
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
	}

	/*
	 * AWT스레드는 평소 데몬스레드로 존재하다가 GUI어플리케이션 프로그램이 시작되면,
	 * 자동으로 paint()를 호출한다. AWT스레드에 의해 자동적으로 화면이 갱신되는 상황을 아래와 같이 정리
	 * 1.처음 화면에 나타날때 
	 * 2.다른 화면에 가려져있던 부분이 다시 화면에 나타날 때
	 * 3.아이콘화 되어 있다가 원래 크리고 화면에 나타날 때
	 * 하지만, 위의 상황 이외에도 화면이 다시 그려지도록 요청할 수 있다. 그 방법이 바로
	 * repaint()를 호출하는 것이다. 사용자가 repaint()를 호출하면 AWT스레드에게 다시 화면을 그리라고 요청하는 것
	 * AWT스레드는 update()를 호출하고 update()는 다시 paint()를 호출하는 형태인 것이다.
	 * 
	 * repaint() - AWT스레드에게 화면을 갱신할 것을 요청함. 0.1초마다 확인해서 요청이 있으면 update()를 호출 
	 * update(Graphics g) - 화면을 지우고 paint(Graphics g)를 호출한다.
	 * 
	 * 상기내용 숙지하여UI관련 스레드가 어떻게 움직이는지를 알고 프로그래밍을 해야 할 것이다.
	 */
	
	@Override
	public void paint(Graphics g) {
		System.out.println("paint()를 움직이는 스레드 : " + Thread.currentThread().getName());
		g.drawString("마우스를 움직여 보세요", 10, 50);
		g.drawString("*", this.x, this.y);
	}
	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {
		 this.x=e.getX();
		 this.y=e.getY();
		 //repaint()를 주석처리하면 '*'가 어떻게 되는지 직접 확인해보자. 
		 this.repaint(); //AWT스레드에게 화면갱신요구. 자동 update()호출. 다시 paint()호출
	}
	/*
	 * update()를 원래 화면을 배경색으로 지우고, paint()를 호출하는데 지금은 오버라이딩해서 지우지 않고
	 * paint()만 호출하였다. 화면이 사라졌다가 다시 활성화 되면, paint()가 호출되어지므로 화면에서이전에 있던
	 * 내용이 사라진다. 그 이유는 Frame에 직접 그렸기 때문이다. 다음 예제를 직접 Image클래스를 만들어
	 * 가상화면에 그림을 그리고 실제화면 Component에 복사하면 지워지지 않을것이다. 
	 */
	@Override
	public void update(Graphics g) {
		System.out.println("update()를 움직이는 스레드 : " + Thread.currentThread().getName());
		paint(g);
	}
}
