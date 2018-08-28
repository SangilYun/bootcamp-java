package sec07_exam_thread_synchcronized;

public class MainThreadExample {

	public static void main(String[] args) {
		 //공유객체 생성
		Calculator calculator = new Calculator();
		
		//이제 문제가 해결되었다. 단순히 문제가 되는 메서드 앞에
		//synchronized제어자를 붙어줌으로써 객체 잠금이 일어나 
		//데이터의 정확성을 지켜준다. 
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();

	}

}
