package sec02_exam_Instanceof;

class Parent{}

class  Child extends Parent{}

public class InstanceofExample2 {
	//주목할 것은 매개변수가 조상타입이라는 것에 집중하자.
	public static void method1(Parent parent) {
		//매우 중요한 코드
		if(parent instanceof Child) {
			//서로 상속 관계에 있어 instanceof연산자의 결과가 true이면 강제 캐스팅이 가능.
			@SuppressWarnings("unused")
			Child child = (Child) parent;
			System.out.println("method1 - child로 변환 성공");
		}
		else {
			System.out.println("method1 - child로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) {
		if(parent instanceof Child) {
			parent = new Child();
			//Child child = (Child)parent;
			System.out.println("method2 - Child로 변환 성공");
		}
		else {
			System.out.println("method2- Child로 변환 실패");
		}
	}
	public static void main(String[] args) {
		//parentA는 현재 다형성이 적용이 된 코드이고, parentB는 다형성이 미적용이 된 코드.
		Parent parentA = new Child(); // 업케스팅
		InstanceofExample2.method1(new Child()); //성공
		InstanceofExample2.method2(parentA);	 //성공
		System.out.println();
		Parent parentB = new Parent();
		InstanceofExample2.method1(parentB); 	 // 강제 케스팅 실패, 업케스팅 없이 다운 케스팅.
		//다형성이 적용되면서 메서드 호출이 되어 변환이 가능하다.
		InstanceofExample2.method1(new Child()); //성공
		InstanceofExample2.method2(parentB); 	 // 실패.
	}
}
