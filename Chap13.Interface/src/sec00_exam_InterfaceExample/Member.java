package sec00_exam_InterfaceExample;

public class Member implements A{

	@Override
	public void method() {
		System.out.println("인터페이스를 구현한 클래스 Member입니다!");
	}
}
