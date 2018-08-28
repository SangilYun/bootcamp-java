package sec02_exam_gerneric_type;

public class BoxExample {

	public static void main(String[] args) {
		 
		//Box<T>에서 T가 String이다. 즉 Box클래스의 제네릭 타입으로 무조건
		//String클래스를 쓰겠다는 것을 컴파일러에게 명시적으로 알리는 것이다. 
		//타입변환 제거,데이터의 통일화(현업에서 사용) 
		
		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
		String name = box1.get();
		System.out.println(name);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(100);
		Integer value = box2.get();
		System.out.println(value);
		
		Box<Apple> box3 = new Box<Apple>();
		box3.set(new Apple());
		Apple apple = box3.get();
		System.out.println(apple);
	}

}
