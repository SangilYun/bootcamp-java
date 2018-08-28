package sec08_exam_thread_state;

public class ThreadStateExample {

	public static void main(String[] args) {
		 
		Thread thread = new StatePrintThread(new TargetThread());
		thread.start();

	}

}
