package sec05_exam_threadPriority;

public class CalcThread extends Thread{

	int sum;
	
	public CalcThread(String name) {
		this.setName(name);	//이름 지정(Thread + i)
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<20000000; i++) {
			sum += i;
		}
		System.out.println("작업을 마친 스레드 : " + this.getName() + ", 합계 " + this.sum);
	}
}
