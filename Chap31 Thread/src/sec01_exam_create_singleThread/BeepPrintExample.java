package sec01_exam_create_singleThread;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		 //main() 스레드는 JVM이 실행함을 기억하자
		/* 아래 코드는 싱글스레드에서 돌아가는 작업이므로, 비프음을 5번 알리고 난 후 ,
		 * '띵'이라는 문자열을 5번 출력한다. 하지만, 우리가 원하는 것은 '띵'이라는 
		 * 문자열이 출력되면서 비프음도 같이 출력되는 것을 원한다. 
		 * 이것이 바로 싱글 스레드의 단점이다. 순차적이라는 것이다. 
		 * 이것이 멀티스레드로 바궈가는 것이 스레드 장에서 우리가 해야할 일이다.
		 * 비프음을 5번 반복해서 소리나게 함
		 * Toolkit은 AWT(Abstract Window Toolkit)추상클래스를 상속받은 또다른 추상클래스이다.
		 * 그 중, GUI관련된 메서드들이 있다. getDefaultToolkit()는 기본적인 메서드를 구현해놓은
		 * 메서드이다.		 
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();//비프음
//			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
