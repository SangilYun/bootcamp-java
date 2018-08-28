package sec04_exam_Default_StaticMethod_Example;

public class Child extends Parent implements MyInterface1, MyInterface2{
	
	public void childmethod() {
		System.out.println("자손클래스에서 호출한 메서드");
	}
	
	@Override
	public void method1() {
		System.out.println("자손클래스에서 MyInterface1의 method1()을 " + "오버라이딩한 메서드");
	}

//	public void methodB(I i) {
//		//클래스 B가 완성이 되지 않아도 선언부 즉 인터페이스에 있는 추상메서드인
//		//선언부만 알고있으면 언제든지 호출이 가능해진다.
//		//이것이 간접적 관계인 것이다.
//		i.methodB();
//	}

}
