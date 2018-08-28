package sec14.exam01_thread_interrupted;

public class InterruptExample {

	public static void main(String[] args) {
		 
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		//1초 후 interrupt()호출 후 일시정지 상태에 있는 printThread를 예외 발생함.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}

		printThread.interrupt();
	}

}
