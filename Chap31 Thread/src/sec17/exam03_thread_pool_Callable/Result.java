package sec17.exam03_thread_pool_Callable;

public class Result {
	
	int accumValue;
	//공유객체이기 때문 즉, 여러 스레드가 접근하여 사용할 수 있으므로 
	//동기화가 필수적이다. 
	
	public synchronized void addValue(int value) {
		this.accumValue += value;
	}
	
	public synchronized int getValue() {
		return this.accumValue;
	}
	

}
