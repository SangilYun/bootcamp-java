package sec05_exam_InterfaceExample_Direct;

//직접적 관계에 놓인 클래스 A와 B
//A클래스는 B클래스를 사용하는 입장
public class A {
	//매개값이 클래스 B 타입이다. 다시말해, B가 변경이 있으면,
	//A에도 영향을 미친다.
	public void methodA(B b) {
		b.methodB();
	}
}
