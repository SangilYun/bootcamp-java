package sec00_exam_InterfaceExample;

public class Person implements A{

	@Override
	public void method() {
		System.out.println("인터페이스를 구현한 클래스 Person입니다. ");
	}
	
	public void method2() {
		System.out.println("인터페이스를 구현한 클래스에서 새로 만든 메서드입니다!");
	}
}
