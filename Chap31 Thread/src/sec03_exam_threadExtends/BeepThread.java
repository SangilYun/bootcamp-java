package sec03_exam_threadExtends;

import java.awt.Toolkit;

//Thread클래스로부터 상속을 받아서 작성한다. 
public class BeepThread extends Thread{

	//Runnable 인터페이스에 있는 run()추상메서드를 오버라이딩 한다. 
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
