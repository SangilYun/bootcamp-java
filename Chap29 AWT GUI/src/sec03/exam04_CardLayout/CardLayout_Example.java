package sec03.exam04_CardLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayout_Example {

	public static void main(String[] args) {
		 
		Frame f = new Frame("CardLayoutEx");
		f.setSize(300, 300);
		
		CardLayout card = new CardLayout(10,10);
		f.setLayout(card);
		
		//프레임에 설정될 panel을 3개 생성한다.
		Panel card1 = new Panel();
		card1.setBackground(Color.lightGray);
		card1.add(new Label("Card1"));
		
		Panel card2 = new Panel();
		card2.add(new Label("Card2"));
		card2.setBackground(Color.orange);
		
		Panel card3 = new Panel();
		card3.add(new Label("Card3"));
		card3.setBackground(Color.yellow);

		
		//Frame에 3개의 Panel을 추가하고있다.
		//자바 FX의 stackpane과 비슷한 개념
		f.add(card1);
		f.add(card2);
		f.add(card3);
		
		//중첩 클래스 Handelr , MoustAdapter추상클래스를 상속 받고 있다.
		//마우스 이벤트 처리 부분을 구현하고 있다.
		
		class Handler extends MouseAdapter{
			@Override
			public void mouseClicked(MouseEvent e) {
				//마우스 오른쪽 버튼을 눌렀을 때(리턴값이 4이다)
				if(e.getModifiers() == InputEvent.BUTTON2_MASK) {
					System.out.println(e.getModifiers());
					card.previous(f);	//CardLayout의 이전 Panel을 보여준다.
				}
				else {
					card.next(f); 	//CardLayout의 다음 Panel을 보여준다.
					//마우스 오른쪽 버튼을 눌렀을 때(리턴값이 16이다.)
					System.out.println(e.getModifiers());
				}
			}
		}
		//class Handler
		//MouseAdapter클래스는 MouseListener인터페이스를 구현하고 있기 때문에
		//Handler인스턴스가 매개변수로 들어갈 수 있다.(인터페이스의 다형성)
		card1.addMouseListener(new Handler());
		card2.addMouseListener(new Handler());
		card3.addMouseListener(new Handler());
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
		f.setSize(300, 300);
		f.setLocation(500, 500);
		f.setVisible(true);
		
		//프레임에 추가된 Panel 중 처음으로 추가된 것을 보여준다.
		//마지막 걸 보여주기 위해서는 last(f)로 설정하면 된다.
		card.first(f);
	}

}
