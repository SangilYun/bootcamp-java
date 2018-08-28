package sec_verify06;

public class PriorityThread extends Thread{

	private String name;
	
	public PriorityThread(String s) {
		this.name = s;
		this.setName(name);
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"스레드가 생성되었습니다.");
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+"(우선순위 : " + Thread.currentThread().getPriority()+")");
		}
	}
}
