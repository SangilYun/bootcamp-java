package sec02_exam_create_multiThread;

public class BeepPrintExample {

	public static void main(String[] args) {
		 //직접 생성하는 멀티스레드로 하는 3가지 방법
		//방법1-->직접 생성
		Runnable beepTask = new BeepTask(); 	//인터페이스의 다형성
		Thread thread = new Thread(beepTask);
		
		//방법2 --> 익명구현클래스 이용
//		Thread thread1 = new Thread(new Runnable() {
//			//비프음을 5버너 반복해서 소리나게 함.
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		});
		
		//방법3 --> 람다식(함수적 인터페이스) 이용하여 초간단화 ()는 run메서드의 매개변수를
		//의미하는데 매개변수가 1개도 없다는 의미이다. {}는 run()의 실행블럭을 의미함.
		//람다식은 1.8부터 등장했는데 나중에 배우게 된다.
//		Thread thread3 = new Thread(()->{
//			//비프음을 5번 반복해서 소리나게 함
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			for(int i=0; i<5; i++) {
//				toolkit.beep();
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		});
//		Thread thread4 = new Thread(new BeepTask());
		thread.start(); 	//run()를 main스레드가 실행하라고 지시함. 이때부터 main스레드와 
							//beepTask스레드가 동시에 실행됨. beep음 5번 실행
		//아래는 메인스레드가 실행되는 부분
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}
