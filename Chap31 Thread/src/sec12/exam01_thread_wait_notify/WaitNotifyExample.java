package sec12.exam01_thread_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		 
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		//실행코드에 가서 notify()와 wait()를 호출하고 동기화 메서드로 되어 있어
		//번갈아 실행되는 것을 알 수 있다. 
		threadA.start();
		threadB.start();
		
		//다시한번 강조하지만, wait(), notify(), notifyAll()은 Object클래스의 
		//메서드이며, 또한 동기화(synchronized)메서드와 동기화 블럭에서만 사용가능하다는 
		//것을 절대 잊지 않도록 하자 .

	}

}
