package sec04_exam_Nested_Interface;

public class CallListener implements Button.OnClickListener{
//Button클래스의 중첩인터페이스인 OnClickListener의 추상메서드를 재정의한다.
	@Override
	public void OnClick() {
		System.out.println("전화를 겁니다.");
	}
}
