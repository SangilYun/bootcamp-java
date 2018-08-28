package sec_verify09;

public class UnitThread extends Thread{
		
	public UnitThread(ThreadGroup g , String s) {
		super(g,s);
		this.start();
	}
	
	@Override
	public void run() {
		
		while(true) {
			System.out.printf("현재 실행 중인 스레드 명 : %s" 
					+ "\t스레드 그룹명 : %s"
					+ "\t 부모 그룹명 : %s\n",
					Thread.currentThread().getName(),
					this.getThreadGroup().getName(),
					this.getThreadGroup().getParent().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " interrupted");
				System.out.println(Thread.currentThread().getName() + " 종료됨");
				break;
			}
		}
	}
}
