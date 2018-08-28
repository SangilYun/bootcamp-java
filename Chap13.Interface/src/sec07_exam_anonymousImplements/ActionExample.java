package sec07_exam_anonymousImplements;

public class ActionExample {

	public static void main(String[] args) {
		
		//여기서 ()는 익명구현클래스의 생성자를 의미한다. 인터페이스는 생성자가 없다.
		//멤버변수의 초기값 대입된형태
		
		Action action = new Action() {
			int a = 10;
			//익명구현클래스, 1회성 사용 용도로 거의 사용한다.
			//특히 UI이벤트처리나 안드로이드프로그래밍에서 자주 등장한다.
			
			public void method() {
				System.out.println("익명구현객체 자체 메서드, 맴버변수 값 : " + this.a);
			}
			@Override
			public void work(int a) {
				this.method();
				System.out.println(a+ "복사를 합니다.");
			}
		};

		//action.method(); -->익명구현객체 안에 것을 사용하려고 함.
		action.work(100);
	}

}
