package sec09_exam_thread_sleep;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<10; i++) {
			toolkit.beep();	//소리나게 함
			try {
				Thread.sleep(3000);	//메인 스레드 3초동안 정지
			}catch(InterruptedException e) {}
		}
	}
}
