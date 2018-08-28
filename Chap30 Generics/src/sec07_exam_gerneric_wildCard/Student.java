package sec07_exam_gerneric_wildCard;

public class Student extends Person{

	//외부에 받은 name을 가지고 조상클래스의 생성자 호출 
	public Student(String name) {
		super(name);
	}
}
