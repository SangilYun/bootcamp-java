package sec05_exam_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명자식객체에서 재정의 된 wake가 호출된다.
		anony.field.wake();
		//메서드 호출과 동시에 로컬변수가 익명자식객체 생성되어 참조된다.
		anony.method();
		
		//매개변수로 익명자식객체를 생성해서 호출하고 있다.
		anony.method2(new Person() {
			
			void study() {
				System.out.println("공부합니다.");
			}
			//조상클래스의 wake를 오버라이딩하고 있다.
			@Override
			public void wake() {
				System.out.println("13시에 일어납니다.");
				this.study();
			}
		});

	}

}
