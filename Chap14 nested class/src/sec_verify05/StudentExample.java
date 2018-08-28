package sec_verify05;

public class StudentExample {

	public static void main(String args[]) {
		System.out.println("===================================");
		StudentAnonymous anony = new StudentAnonymous();
		anony.field.wake();
		System.out.println("===================================");
		anony.method1();
		System.out.println("===================================");
		anony.method2(new Student("김연아") {
			
			public void study() {
				System.out.println(this.name+"이 공부합니다.");
			}
			@Override
			public void wake() {
				System.out.println("매개변수의 매개값으로 익명자손객체를 생성");
				System.out.println("김연아가 4시에 일어납니다.");
				study();
			}
		});
	}
}
