package sec12.exam02_thread_wait_notify;

public class ProducerThread extends Thread{

	//공유 객체 DataBox
	private DataBox dataBox;
	
	//생성자 
	public ProducerThread(DataBox dataBox) {
		this.setName("ConsumerThread"); //스레드 이름 지정
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			String data = "Data" + i; //데이터를 양산
			dataBox.setDate(data); //공유객체에 데이터 저장.
		}
	}
}
