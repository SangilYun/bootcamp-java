package sec06_exam_thread_unsynchcronized;

public class MainThreadExample {

	public static void main(String[] args) {
		 //공유객체 생성
		Calculator calculator = new Calculator();
		
		//문제가 무엇인가? 출력결과를 보면, User2가 변경한 값
		//과연 User1스레드는 원하는 결과값인가?
		//이 문제를 해결하는 방법 -> 동기화가 필요하다.
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
