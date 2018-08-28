package sec02_exam_Nested_Class;

public class Main {

	public static void main(String[] args) {
		
		A a = new A(); //외부(바깥클래스)클래스 인스턴스 생성
		//A클래스의 멤버변수격인 내부(중첩)클래스 인스턴스 생성
		//(필히 외부클래스의 인스턴스가 존재하여야 한다.)
		A.B b = a.new B();
		b.method1(); //b의 멤버메서드인 method1 호출
		
		//정적(static) 멤버인 인스턴스 생성(외부클래스의 인스턴스 생성없이 바로 가능)
		A.C c = new A.C();
		System.out.println("c.b : "+c.b);
		A.C.method3();

		//외부클래스의 멤버메서드인 method를 호출함으로써
		//로컬클래스의 인스턴스가 생성됨.
		a.method();
	}

}
