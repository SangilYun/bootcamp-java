package sec06_exam_InterfaceExample_Indirect;

public class InterfaceExample_Indirect {

	public static void main(String[] args) {
		//클래스를 직접 생성해서 호출하는 것
		A a = new A();
		a.methodB(new B());
		
		//인터페이스의 필드의 다형성
		I i=  new B();
		i.methodB();

	}

}
