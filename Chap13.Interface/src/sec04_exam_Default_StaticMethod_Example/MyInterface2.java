package sec04_exam_Default_StaticMethod_Example;

public interface MyInterface2 {
	//default 메서드는 기본적으로 public 접근제한을 갖는다.
	public default void method3() {
		System.out.println("인터페이스 2에 선언된 디폴트 메서드1 호출");
	}
	
	public default void method4() {
		System.out.println("인터페이스 2에 선언된 디폴트 메서드2 호출");
	}
	
	public static void staticMethod() {
		System.out.println("인터페이스 2에 선언된 정적(static) 메서드 호출");
	}
}
