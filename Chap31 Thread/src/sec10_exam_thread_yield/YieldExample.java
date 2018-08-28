package sec10_exam_thread_yield;

public class YieldExample {

	public static void main(String[] args) {
		 
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		//우선순위가 같거나 높을때만 yield()를 적용하게끔 되었으나,
		//딱히 그런것 같지는 않아 보인다. 
		//threadB.setPriority(1);
		//3초 동안은 번갈아 실행하다가 이후, ThreadA를 yield()호출 함으로써,
		//ThreadB만 실행하게 된다.
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}

		threadA.work = false;
		
		//다시 3초후, ThreadB가 yield()호출함으로써 ThreadA만 실행된다.
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
	
		threadA.work = true;
		threadB.work = false;
		
		//3초후 ThreadA와 ThreadB가 종료하게 된다. 
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		
		threadA.stop = true;	//무한루프가 끝남
		threadB.stop = true;
	}
}
