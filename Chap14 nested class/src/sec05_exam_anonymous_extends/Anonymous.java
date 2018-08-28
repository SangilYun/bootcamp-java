package sec05_exam_anonymous_extends;

public class Anonymous {
	//Person클래스를 상속해서 익명자식객체를 필드의 초기값으로 사용하고 있다.
	Person field = new Person() {
		//익명자식객체의 멤버변수와 멤버메서드는 내부에서만 사용하고 
		//아울러 사용용도는 대부분 조상클래스의 메서드를 오버라이딩할 때
		//활용됨을 잊지말자.
		void work() {
			System.out.println("출근합니다.");
		}
		
		//조상클래스의 wake를 오버라이딩 하고 있다.
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			this.work();  //자손클래스의 멤버메서드 호출
		}
	};

	void method() {
		//로컬변수로 선언해서 익명자식객체 생성하여 실행클래스에서 method호출한다.
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			//조상클래스의 wake를 오버라이딩하고 있다.
			@Override
			public void wake() {
				System.out.println("8시에 일어납니다.");
				this.walk();
			}
		};
		localVar.wake(); //로컬클래스의 메서드를 호출을 명시적으로 해줘야 됨.
	}
	
	//매개변수로 조상클래스 타입의 변수가 들어왔다. 이 의미는? //person을 상속받는 객체가 올 수 있다.
	void method2(Person person) {
		person.wake();
	}
}
