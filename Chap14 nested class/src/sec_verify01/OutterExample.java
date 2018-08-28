package sec_verify01;

public class OutterExample {
	
	class Outter{
		public Outter() {
			System.out.print("외부클래스 Outter의 인스턴스 생성, ");
		}
		class Inner{
			public Inner() {
				System.out.print("인스턴스멤버클래스(Inner)의 인스턴 생성 됨.");
			}
			void method() {
				System.out.println(" 출력값 : 100");
			}
		}
	}
	
	public static void main(String[] args) {
		OutterExample outterexample = new OutterExample();
		Outter outter = outterexample.new Outter();
		Outter.Inner inner = outter.new Inner();
		inner.method();

	}

}
