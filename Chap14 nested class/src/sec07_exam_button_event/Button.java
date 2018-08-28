package sec07_exam_button_event;

public class Button {
	
	//인터페이스 참조변수선언
	OnClickListener listener;
	
	//setter -- 매개변수로 인터페이스 타입이 선언되어있다면 무슨의미인가?
	// OnClickListener 인터페이스를 구현하는 클래스의 인스턴스 / object가 온다.
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//touch()메서드가 호출되면서 중첩인터페이스를 구현한 객체의 
	//OnClick()메서드가 호출됨.
	void touch() {
		listener.OnClick();
	}
	
	//중첩인터페이스
		interface OnClickListener {
			void OnClick();
		}
}
