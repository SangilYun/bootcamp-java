package sec03_exam_BindingExample;

public class Child extends Parent{

	int x = 200;
	
	//조상클래스의 method()가 오버라이딩된 부분
	@Override
	void method() {
		//조상클래스의 맴버에 접근하기 위해서는 
		//super를 명시적으로 적어줘야함에 주의.
		super.method();
		System.out.println("Parent x : " + super.x);
		System.out.println("Child x(without this.) : " + x);
		System.out.println("Child x : " + this.x);
		System.out.println("Child Method");
	}
}
