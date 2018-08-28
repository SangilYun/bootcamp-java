package sec06_exam_singleton;

public class SingletonExample {

	public static void main(String[] args) {

		//Singleton obj1 = new Singleton(); //컴파일 에러
		//Singleton obj2 = new Singleton(); //컴파일 에러
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		//사용자 정의 클래스의 Object의 equals()호출 --> 번지 비교
		if(obj1.equals(obj2))
			System.out.println("같은 Singleton 객체 입니다.");
		else
			System.out.println("다른 Singleton 객체 입니다.");

	}

}
