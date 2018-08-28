package sec01_exam_non_gerneric_type;

public class Box {

	private Object object;
	
	//setter
	//매개변수 Object라는 것은 모든 클래스를 매개변수로 받겠다는 의미(다형성)
	public void set(Object object) {
		this.object = object;
	}
	
	//getter
	public Object get() {
		return this.object;
	}
}
