package sec05_exam_anonymous_extends;

public class Person {

	String name;
	
	//생성자
	public Person() {
		System.out.println("조상 생성자");
	}
	
	public void wake() {
		System.out.println("10시에 일어납니다.");
	}
}
