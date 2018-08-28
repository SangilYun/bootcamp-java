package sec_verify09;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.printf("현재 실행 중인 스레드 명 : %s" 
				+ "\t스레드 그룹명 : %s"
				+ "\t 부모 그룹명 : %s\n",
				Thread.currentThread().getName(),
				mainGroup.getName(),
				mainGroup.getParent().getName());
		
		ThreadGroup t1 = new ThreadGroup(mainGroup,"AGroup");
		ThreadGroup t2 = new ThreadGroup(mainGroup,"BGroup");
		ThreadGroup su1 = new ThreadGroup(t1, "A_SubGroup");

//		UnitThread m = new UnitThread(mainGroup, "main");
		UnitThread u1 = new UnitThread(t1,"AGroup_Thread1");
		UnitThread u2 = new UnitThread(t2,"BGroup_Thread1");
		UnitThread su1t = new UnitThread(su1, "A_SubGroupThread1");
		UnitThread su12 = new UnitThread(su1, "A_SubGroupThread2");

//		mainGroup.interrupt();
		t1.interrupt();
		t2.interrupt();
	}
}
