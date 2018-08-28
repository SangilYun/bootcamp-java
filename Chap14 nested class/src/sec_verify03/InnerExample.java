package sec_verify03;

import sec_verify03.Inner.InstanceInner;
import sec_verify03.Inner.StaticInner;

public class InnerExample {

	public static void main(String[] args) {
		Inner inner = new Inner();
		Inner.InstanceInner ii = inner.new InstanceInner();
		
		System.out.println("내부클래스 InstanceInner final static 멤버 변수 값 출 " + InstanceInner.CONST);
		System.out.println("내부클래스 InstanceInner를 생성 후 인스턴스 멤버 변수 값 출력 " + ii.iv);
		
		Inner.StaticInner si = new Inner.StaticInner();
		
		System.out.println("StaticInner클래스의 final static 멤버변수값 출력 : " +StaticInner.CONST);
		System.out.println("StaticInner클래스의 static 멤버변수값 출력 : " +StaticInner.cv);
		System.out.println("내부(정적)클래스 staticInner를 생성 후 static 멤버변수 값 출력 " + si.iv);
		
		inner.myMethod();

	}

}
