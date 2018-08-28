package sec10_exam_thread_yield;

public class ThreadB extends Thread{

	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		//무한 루프를 돌고 있다.
		while(!stop){
			if(work) {
				//너무 빨리 루핑해서 설정함
				try {
					Thread.sleep(50);
				}catch(InterruptedException e){}
				System.out.println("ThreadB 작업 내용");
			}
			else {
				//무의미한 반복을 막기 위해 다른 스레드한테 양보함
				//(동일 우선순위나 그 이상인 스레드한테)
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
}
