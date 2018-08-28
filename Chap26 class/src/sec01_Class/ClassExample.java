package sec01_Class;

public class ClassExample {

	public static void main(String[] args) {
		 
		//객체로부터 클래스 정보를 얻는 방법(Object클래스의 getClass()이용 방법)
		System.out.println("1.생성한 객체로부터 클래스의 정보를 얻는 방법.");
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());		//패키지명을 포함한 클래스명 출력
		System.out.println(clazz1.getSimpleName());	//클래스명만 출력
		System.out.println(clazz1.getPackage().getName());	// 패키지명만 출력 
		
		//문자열로부터 객체의 정보를 얻는 방법
		System.out.println("2.문자열로부터 생성된 클래스의 정보를 얻는 방법 ");
		try {
			Class clazz2 = Class.forName("sec01_Class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		}catch(Exception e) {
			System.out.println("존재하지 않는 클래스입니다.");
			e.printStackTrace();
		}
		

	}

}
