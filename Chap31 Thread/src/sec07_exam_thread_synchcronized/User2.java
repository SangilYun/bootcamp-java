package sec07_exam_thread_synchcronized;

public class User2 extends Thread{

	//공유객체 선언
	private Calculator calulator;
	
	public void setCalculator(Calculator calculator) {
		this.calulator = calculator;
		this.setName("User-2");	//스레드이름 설정
	}
	@Override
	public void run() {
		//공유객체의 필드인 memory값을 100으로 설정하고 있다. 
		this.calulator.setMemory(50);
	}
}
