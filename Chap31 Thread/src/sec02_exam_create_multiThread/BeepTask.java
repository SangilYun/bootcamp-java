package sec02_exam_create_multiThread;

import java.awt.Toolkit;

//Runnable 인터페이스를 직접 구현하고 있다.
public class BeepTask implements Runnable{

	//Runnable 인터페이스에 있는 run()추상메서드를 오버라이딩 한다. 
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			System.out.println("BeepTask " + (i+1));
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
