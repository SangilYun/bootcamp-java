package sec_verify03;

public class ThreadExample {

	public static void main(String[] args) {
		 Thread n = new NumberThread();
		 Thread b = new BombThread();
		 
		 n.start();
		 b.start();
	}
}
