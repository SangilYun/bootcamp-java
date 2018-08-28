package sec01_verify;

public class Child extends Parent{

	public void method2() {
		System.out.println("오버라이딩한 자손 클래스 메서드 2");
	}
	
	public void method3() {
		System.out.println("자손클래스 메서드3 호출");
	}
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		Child child = (Child)parent;
		child.method2();
		child.method3();
		

	}

}
