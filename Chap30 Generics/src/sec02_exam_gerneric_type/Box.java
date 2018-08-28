package sec02_exam_gerneric_type;

public class Box<T> {

	private T t;
	
	//setter
	public void set(T t) {
		this.t= t;
	}
	
	//getter
	public T get() {
		return this.t;
	}
	
}
