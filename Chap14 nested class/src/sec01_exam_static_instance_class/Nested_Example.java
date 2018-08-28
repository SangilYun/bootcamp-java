package sec01_exam_static_instance_class;

public class Nested_Example {

	//인스턴스 맴버 클래스
	class InstanceClass{
		int iv = 100;
		//static int cv = 200; //에러 이유는?인스턴스 클래스에 static이라서 인스턴스가 언제 생성될 지 모름.
		final static int CONST = 100;
	}
	
	//정적멤버클래스
	static class staticInner{
		int iv = 200; //정적멤버클래스라고 해도 인스턴스 멤버들을 가질 수 있다. 하지만 사용하기 위해서 
					  //new로 인스턴스를 생성해야함을 잊지말자.
		static int cv = 200;
	}
	
	@SuppressWarnings("static-access")
	void method() {
		//로컬클래스(메서드 안에 선언, 잠깐 사용할 용도)
		class Localclass{
			int iv = 300;
//			static int cv = 300; //에러 이유는?
			static final int CONST = 300;
		}
		//로컬클래스는 해당 메서드 내에서만 사용가능하다.
		Localclass lc = new Localclass();
		System.out.println(lc.iv);
		System.out.println(lc.CONST);
	}
	
	@SuppressWarnings("static-access")
	void method1() {
		class Localclass{
			int iv = 300;
			//static int cv = 300; //에러 이유는?
			static final int CONST = 300;
		}
		//로컬클래스는 해당 메서드 내에서만 사용가능하다.
		Localclass lc = new Localclass();
		System.out.println(lc.iv);
		System.out.println(lc.CONST);
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Nested_Example ne = new Nested_Example();
		//인스턴스 맴버 클래스는 외부클래스의 인스턴스가 있어야만 사용가능하다.
		InstanceClass ic = ne.new InstanceClass();
		//정적 클래스는 외부의 클래스의 인스턴스가 없어도 바로 사용가능하다.
		Nested_Example.staticInner si = new staticInner();
		
		System.out.println(ic.iv);
		System.out.println(ic.CONST);
		System.out.println(si.iv);
		System.out.println(staticInner.cv);
		ne.method();
	}
}
