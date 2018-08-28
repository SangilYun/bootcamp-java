package sec03_exam_Nested_Outter_Refer;

public class Outter {
	//외부클래스 멤버변수
	String field = "Outter_field";
	
	//외부클래스 메서드
	public void method() {
		System.out.println("바깥클래스 메서드 호출");
	}
	
	class Nested{
		//내부클래스 멤버변수
		String field = "Inner_Field";
		//내부클래스 메서드
		public void method() {
			System.out.println("내부클래스 메서드 호출");
		}
		//내부클래스 메서드
		public void print() {
			//여기에서의 this는 내부클래스의 자신을 의미
			System.out.println(this.field);
			this.method();
			//바깥클래스 멤버에 접근 방법을 나타냄.
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}

	
}
