package sec_verify02;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println("MyThread");
				sleep(80);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
