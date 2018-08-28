package sec_verify02;

public class Outter {
	
	static class staticinner{
		static int cv = 500;
		int iv = 200;
	}

	public static void main(String[] args) {
		System.out.println("외부클래스를 생성하지 않고, 정적멤버클래스의 정적 멤버 CV값 : " + Outter.staticinner.cv);
		System.out.print("외부클래스를 생성하고, 정적멤버클래스의 인스턴스 맴버 IV : ");

		staticinner inner = new staticinner();
		System.out.println(inner.iv);
	}
}
