package sec_verify00;

public class ThreadExample {

	public static void main(String[] args) {
		TestThread thread = new TestThread();
		thread.start();
		//현재 실행중인 스레드가 끝날 때 까지 기다림.
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//익명자식객체로 생성 
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<10; i++) {
					System.out.println(i + "번째 Test스레드의 실행내용입니다.");
				}
				System.out.println("익명자식객체)스레드 종료");
			}
		};
		thread2.start();
	}
}
