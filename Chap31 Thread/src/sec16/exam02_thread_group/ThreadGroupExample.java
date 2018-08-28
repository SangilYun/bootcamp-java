package sec16.exam02_thread_group;

public class ThreadGroupExample {

	public static void main(String[] args) {
		//현재 실행되고 있는 스레드 그룹을 얻음
		ThreadGroup mainGroup1 = Thread.currentThread().getThreadGroup();
		String threadGroup1 = mainGroup1.getName();
		System.out.println(threadGroup1);
		
		//메인그룹의 하위그룹으로 만들어진다.
		ThreadGroup myGroup = new ThreadGroup("myGroup");
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ 메인 스레드 그룹의 list()메서드 호출 후 출력 내용 ] ");
		//현재 실행되고 있는 스레드 그룹을 얻음
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//위에 얻은 그룹의 모든 정보가 출력됨 (하위 그룹 포함)
		mainGroup.list();
		System.out.println();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		//myGroup에 포함된 workThreadA와 B가 인트럽트되어 종료됨.(스레드그룹을 쓰는 궁극적인 이유)
		myGroup.interrupt();
	}
}
