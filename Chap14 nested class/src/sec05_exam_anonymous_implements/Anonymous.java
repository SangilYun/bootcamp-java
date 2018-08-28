package sec05_exam_anonymous_implements;

public class Anonymous {
	
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};

	void method1() {
		//로컬변수로 인터페이스타입을 선언 후 익명구현객체 생성
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}
	//매개변수로 인터페이스 타입이 들어왔다. 이 의미는? 매개변수로 익명자식객체를 생성해서 호출할 의도.
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
