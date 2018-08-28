package sec04.exam01_frame_windowevent;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//windowListener인터페이스에는 총 7개의 추상메서드가 존재하다. 
//하여 아래와 같이 해당하는 것을 골라서 구현할 수가 없다.
//즉, 빈 {}구현부라도 만들어 놔야 한다는 것이다.
//없다면 추상클래스가 되는것은 다 알것이다. 

public class EventHandler implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println(e.toString());
		e.getWindow().setVisible(false);	//윈도우창을 사라지게 하고 
		e.getWindow().dispose();			//메모리에서 제거하고
		System.out.println("windowClosing()호출로 윈도우 닫힘!");
		System.exit(0);						//프로그램을 종료한다.
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

}
