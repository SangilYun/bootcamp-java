package sec05_exam_anonymous_implements;

public class AnonymousExample {

	public static void main(String[] args) {
		
		//Anonymous의 인스턴스 생성
		Anonymous anony = new Anonymous();
		
		//anony인스턴스에 있는 익명구현객체에 오버라이딩된 메서드 호출
		anony.field.turnOn();
		anony.field.turnOff();
		anony.method1();
		
		//매개값으로 인터페이스 타입이 들어와서 바로 익명구현객체를 생성하여 대입.
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("스마트 TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("스마트 TV를 끕니다.");				
			}
		});
	}
}
