package sec04_exam_Nested_Interface;

public class MessageListener implements Button.OnClickListener{
//Button클래스의 중첩인터페이스인 OnClickListener의 추상메서드를 재정의한다.
	@Override
	public void OnClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
