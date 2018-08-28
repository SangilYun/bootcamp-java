package sec12.exam02_thread_wait_notify;

public class ConsumerThread extends Thread{

	//공유 객체 DataBox
	private DataBox dataBox;
	
	//생성자 
	public ConsumerThread(DataBox dataBox) {
		this.setName("ConsumerThread"); //스레드 이름 지정
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = dataBox.getDate(); //지정된 데이터를 가져온다. 
		}
	}
}
