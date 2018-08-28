package sec02_exam_SuperTest;

public class Child extends Parent{
	int x = 100;
	
	public void method() {
		System.out.println("현재 인스턴스의 x = " + x);
		System.out.println("자손클래스 : this.x = " + this.x);
		System.out.println("조상클래스 : super.x = " + super.x);
	}
	
	@Override
	public String toString() {
		return "안녕하세요";
	}
}
