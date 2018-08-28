package sec12.exam02_thread_wait_notify;

public class DataBox {

	private String data;
	
	/*
	 * 아래 getData()는 ConsumerThread가 data를 읽어가도록 되어있다.
	 * 그래서 null이면 wait(일시정지 : Blocked상태)하고, null이 아니라면
	 * consumerThread가 읽은 데이터를 출력하면서, 다른 waiting된 스레드를 
	 * notify를 통해서 실행대기 상태로 바꾼다.
	 */
	public synchronized String getDate() {
		//읽어올 데이터가 없다면..
		if(this.data ==null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue = this.data;
		System.out.println("ConsumerThread가 읽은 데이터 : " + returnValue);
		this.data = null;
		//다른 스레드(생산자 스레드)를 깨운다. (즉 실행대기 상태(runnable)로 만든다.)
		notify();
		return returnValue;
	}
	
	public synchronized void setDate(String data) {
		//ConsumerThread가 데이터를 읽지 않았다면...
		if(this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이타 : " + this.data);
		notify();
	}
	/*
	 * 결과론적으로 wait()와 이용하여 번갈아 가면서 데이터 즉 공유객체에 접근하기 위해서는 synchronized란 동기화
	 * 키워드가 필히 들어가야 예외도 발생하지 아니하고, 데이터의 정확성을 보장한다. 즉, 다시 말해 객체 잠금이 일어나야 한다.
	 */
	
}
