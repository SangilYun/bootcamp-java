package sec13_exam_thread_stopflag;

public class printThread extends Thread{

	private boolean stop;	//stop 플래그 선언(기본값 : false)
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		//외부에서 stop을 true로 설정하면 루프에서 나온다. 
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("시스템 자원 정리완료");
		System.out.println("실행 종료");
	}
}
