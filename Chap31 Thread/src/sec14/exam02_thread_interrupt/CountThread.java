package sec14.exam02_thread_interrupt;

public class CountThread extends Thread{

	@Override
	public void run() {
		int i=10;
		while(true) {
			System.out.println("카운트 다운 : " + i--);
			
			if(Thread.interrupted()) {
				System.out.println("interrupted() 호출 됨");
				break;
			}
			//스레드가 너무 빨리 돌아가 일부러 시간 지연
			for(long x=0;x<2500000000L;x++) {}
		}
		System.out.println("카운트가 종료되었습니다. ");
	}
}
