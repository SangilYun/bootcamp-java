package sec02_exam_gerneric_type;

public class TvExample {

	public static void main(String[] args) {
		 //구체적 타입으로 String을 선택
		Tv<String> tv1 = new Tv<String>();
		//Tv<String> tv = new Tv<>();
		//이렇게 선언해도 가능하다 하지만 이건 비제네릭 코드인 Object의 형태가 된다.
		//Tv tv = new Tv();
		//tv1.setT(new Integer(42)); //에러 -> String타입에 integer

		tv1.setT("LG OLED TV");
		String str = tv1.getT();
		System.out.println("나의 TV는 " + str);
		
		//구체적 타입으로 Integer을 선택
		Tv<Integer> tv2 = new Tv<>();
		
		tv2.setT(42);
		Integer inch = tv2.getT();
		System.out.println("나의 Tv크기는 " + inch);
		
		//위와 같이 제네릭 코드는 타입변환을 제거하면서, 프로그램 성능을 향상시키고 
		//아울러, 다양한 타입을 지정하여 개발할 수 있는 장점이 있다.
		//또한 컬렉션에서는 데이터의 통일화를 가져와서 신뢰도를 높여준다.
		//또한 실행시 예외가 발생하는 것보다는
		//컴파일시 예외가 발생하는게 훨씬 프로그래머한테는 도움이 된다. 
	}

}
