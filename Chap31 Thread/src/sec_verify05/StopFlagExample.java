package sec_verify05;

public class StopFlagExample {

	public static void main(String[] args) {
		 
		ExecuteThread e = new ExecuteThread();
		e.setStop(false);
		e.start();

	}

}
