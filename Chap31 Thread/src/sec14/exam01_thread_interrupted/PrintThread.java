package sec14.exam01_thread_interrupted;

public class PrintThread extends Thread{

	@Override
	public void run() {
		//아래는 일부러 일시정지 상태로 만든 것. 실전에서는 안쓴다.
		//일시 정지 상태를 만들지 않고 종료시키는 것이 전부다.
		
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			System.out.println("예외 발생");
//			System.out.println("스레드 자원 정리");
//			System.out.println("스레드 종료");
//		}
		
		
		//정적 메서드인 interrupted()와 인스턴스 메서드인 isInterrupted()를 이용한
		//스레드 종료 방법
		while(true) {
			System.out.println("실행 중");
			//interrupted()가 호출되었나?
			if(Thread.interrupted())  	//interrupted()가 호출 되면 true를 리턴
			    break;					//호출 되었으면 루프 탈출
//			if(this.isInterrupted()) {
//				break; //호출 되었으면 루프 탈출
//			}
		}
		System.out.println("interrupt() 호출 됨");
		System.out.println("스레드 자원 정리");
		System.out.println("스레드 종료");
	}
}

/*
 * 결과론적으로 스레드의 반복문을 종료하기 위해서는 가장 좋은 방법이 interrupted()를 이용하는 것이 가장 이상적.
 * 일시정지의 유무에 관계없이 정상적인 종료로 유도하는 방법 중 가장 널리 이용된다. 
 */
