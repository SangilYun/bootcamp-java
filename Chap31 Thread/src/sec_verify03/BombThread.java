package sec_verify03;

public class BombThread extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(6000);
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("폭탄");
		} 
	}
}
