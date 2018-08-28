package sec_verify04;

public class NestedAccess {
	class Outter{
		int var = 10;
		class Inner{
			int var = 20;
			void method1() {
				Outter outter = new Outter();
				Inner inner = new Inner();
				int var = 30;
				System.out.println("method1의 value값 : " + var);
				System.out.println("Inner클래스의 value값 : "+inner.var);
				System.out.println("Outter클래스의 value값 : "+outter.var);
			}
		}
	}

	public static void main(String[] args) {
		
		NestedAccess na = new NestedAccess();
		Outter outter = na.new Outter();
		Outter.Inner inner = outter.new Inner();
		
		inner.method1();
	}
}
