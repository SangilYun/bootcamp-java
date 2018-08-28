package sec01_exam_non_gerneric_type;

public class BoxExample {

	public static void main(String[] args) {
		 Box box = new Box();
		 
		 box.set("홍길동 "); //String타입으로 매개변수로 던졌다. (자동타입 변환)
		 String name = (String)box.get(); //Object로 가져와 String으로 강제타입 변환
		 System.out.println(name);
		 
		 //역시 위와마찬가지 이다.
		 box.set(new Apple());
		 Apple apple = (Apple)box.get();
		 System.out.println(apple);

	}

}
