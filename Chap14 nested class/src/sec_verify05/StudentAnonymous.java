package sec_verify05;

public class StudentAnonymous {

	Student field = new Student("문수빈") {
		void goSchool() {			
			System.out.println(this.name+"이 등교합니다.");
		}
		
		@Override
		public void wake() {
			System.out.println("필드(멤버변수)의 초기값으로 생선된 자식 객체");
			System.out.println(this.name+"이 6시에 일어납니다.");
			goSchool();
		}
	};
	
	void method1() {
		Student sa = new Student("배한규") {
			void goMoving() {
				System.out.println("배한규가 영화를 보러 갑니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("로컬변수의 초기값으로 생성된 자식 객체");
				System.out.println("배한규가 9시에 일어납니다.");
				goMoving();
			}
		};
		sa.wake();
	}
	
	void method2(Student student) {
		student.wake();
	}
}
