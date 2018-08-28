package sec_verify03;

public class Inner {

	class InstanceInner{
		final static int CONST = 100;
		int iv = 100;
	}
	static class StaticInner{
		final static int CONST = 500;
		static int cv = 200;
		int iv = 200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			final static int CONST = 300;
		} 
		LocalInner local = new LocalInner();
		System.out.println("myMethod()를 호출 후 LocalInner 클래스 생성 후 멤버변수 값 출력 : "+ local.iv);
		System.out.println("myMethod()를 호출 후 final static변수 값 출력 : "+ LocalInner.CONST);
	}
}
