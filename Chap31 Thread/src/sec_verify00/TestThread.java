package sec_verify00;

public class TestThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i + "번째 Test스레드의 실행내용입니다.");
		}
		System.out.println("스레드 종료");
	}
}
