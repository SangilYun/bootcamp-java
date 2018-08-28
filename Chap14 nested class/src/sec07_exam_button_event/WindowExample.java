package sec07_exam_button_event;

public class WindowExample {

	public static void main(String[] args) {
		
		Window window = new Window();
		//Button클래스의 touch메서드를 호출하면 익명구현객체에서 오버라이딩한 메서드가 
		//각각 호출되어 다른 결과값을 보인다.(인터페이스의 다형성)
		window.btn1.touch();
		window.btn2.touch();

	}

}
