package sec16.exam01_thread_group;

public class AutoSaveThread extends Thread{
	
	public void save() {
		System.out.println("작업내용을 저장함");
	}
	
	@Override
	public void run() {
		//1초 단위로 save()메서드 호출 함.
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {break;}
			this.save();
		}
	}
}
