package sec05_exam_InterfaceExample_Direct;

public class InterfaceExample {

	public static void main(String[] args) {

		/*
		 *클래스 B가 다 완성되어야 비로서 클래스 A에 선언 되어 있는 methodA()를 호출할 수 있다. 
		 */
		A a = new A();
		B b = new B();
		
		a.methodA(new B());
		a.methodA(b);
	}

}
