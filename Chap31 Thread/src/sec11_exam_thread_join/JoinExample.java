package sec11_exam_thread_join;

public class JoinExample {

	public static void main(String[] args) {
		 
		SumThread sumThread = new SumThread();
		
		sumThread.start();
		
		//sumThread의 run()가 끝나지 않았을때 getSum()을 호출하면 1~10000까지의 합이
		//나온다는 보장이 없다. 
		//그래서 sumThread가 끝날때까지 기다려주는 코드가 필요하다. 그게바로 join()이다. 
		//System.out.println("1~10000까지의 합  : " + sumThread.getSum());

		try {
			sumThread.join();
		} catch (InterruptedException e) {}
		System.out.println("1~10000까지의 합 : " + sumThread.getSum());
	}
}
