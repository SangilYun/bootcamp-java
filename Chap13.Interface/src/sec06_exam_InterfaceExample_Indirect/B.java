package sec06_exam_InterfaceExample_Indirect;

public class B implements I{
	
	@Override
	public void methodB() {
		System.out.println("인터페이스를 통한 MthodB()호출");
	}

}
