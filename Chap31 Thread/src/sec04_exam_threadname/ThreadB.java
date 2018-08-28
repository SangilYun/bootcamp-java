package sec04_exam_threadname;

public class ThreadB extends Thread{

	//생성자
	public ThreadB() {
		this.setName("ThreadB");//스레드 이름 지정
	}
	
	@Override
	public void run() {
		System.out.println("[현재 실행중인 스레드명] : " + this.getName());
		for(int i=0;i<2;i++) {
			//여기서의 getName()은 ThreadA의 인스턴스 메서드임을 알자.
			System.out.println(this.getName() + "가 출력한 내용");
		}
	}
}
