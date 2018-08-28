package sec04_exam_threadname;

public class ThreadNameExample {

	public static void main(String[] args) {
		 //현재 실행중인 스레드를 얻을 수 있는 Thread의 정적메서드인 currentThread()
		Thread thread = Thread.currentThread();
		//스레드 이름 얻기
		String curThreadName = thread.getName();
		System.out.println("[프로그램 시작 스레드 이름] : " + curThreadName);

		//하기 내용은 메인스레드가 실행하는 것
		//아래 코드를 실행 후 출력해보면 CPU의 상태에 따라 결과가 다르게 나오는 걸 알 수 있다.
		Thread threadA = new ThreadA();
		System.out.println("[ThreadA를 생성한 스레드 이름] : " + Thread.currentThread().getName());
		System.out.println("[메인스레드가 threadA의 이름을 가져온 것] : " + threadA.getName());
		threadA.start();
		
		//스레드의 특성중 하나가 스레드가 생성이 되고 스레드가 실행되고 난 후,
		//또 start()를 호출할 수 없다. start()재사용 불가
		//java.lang.IllegalThreadStateException 예외가 발생한다.
		//threadA.start();
		//만약 똑같은 내용의 작업스레드가 실행해야 되는 경우가 발생한다면 new를 통해 새로 만들어서
		//실행해야 한다
		//Thread threadA_1=new ThreadA();
		//System.out.println("[ThreadA_1를 생성한 스레드 이름] : " + Thread.currentThread().getName());
		//threadA_1start();
		Thread threadB = new ThreadB();
		System.out.println("[ThreadB를 생성한 스레드 이름] : " + Thread.currentThread().getName());
		System.out.println("[메인스레드가 threadB의 이름을 가져온 것] : " + threadB.getName());
		threadB.start();
		System.out.println("[메인의 마지막 스레드 이름] : " + Thread.currentThread().getName());
		//명심할 것은 위의코드는 메인스레드가 실행하는 것이다. 아울러 threadA와 threadB를 생성한 것
		//역시도 메인스레드이다. 단지, threadA, threadB가 하는 작업은 run메서드에 코딩되어있는 내용만 
		//실행하는 것 뿐이다.

	}
}
