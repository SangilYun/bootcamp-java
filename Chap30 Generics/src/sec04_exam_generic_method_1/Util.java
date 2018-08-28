package sec04_exam_generic_method_1;

public class Util {
	
	//<T>는 제네릭타입 메서드를 의미하며, 리턴타입과 매개변수 제네릭 타입을
	//<T>로 하겠다는 의미 외부로부터 T타입을 받아서 Box객체를 생성해 
	//그 객체를 리턴하는 메서드
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		//return this.box; //static메서드에선 this를 사용할 수 없다. 
	}

}
