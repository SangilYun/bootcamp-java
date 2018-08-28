package sec_verify08;

public class DaemonThreadExample {

	public static void main(String[] args) {
		 
		DateTimeThread d = new DateTimeThread();
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}	

		d.interrupt();
		try {
			d.join();
		} catch (InterruptedException e) {}
		
		System.out.println("main스레드가 종료됩니다. ");
	}
}
