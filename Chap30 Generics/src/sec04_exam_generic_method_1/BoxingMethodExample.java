package sec04_exam_generic_method_1;

public class BoxingMethodExample {

	public static void main(String[] args) {
		 //util클래스의 boxing()메서드는 정적메서드이면서, 아울러 제네릭 메서드이다.
		//따라서 아래와 같이 타입을 지정해주어야 한다. 그럼 정해진 타입에 의해서 t가 결정된다.
		//구체적 타입이 integer이다. 그러므로 integer객체가 들어와야 한다.
		//아울러 리턴타입이 box<integer>가 되어야 한다.
		
		Box<Integer> box = Util.<Integer>boxing(100);
		
		//이렇게 직접 integer객체를 생성해서 매개변서로 줘도 된다.
		Box<Integer>box1 = Util.<Integer>boxing(new Integer(100));
		
		//<Integer>는 없어도 된다. 컴파일러가 알아서 매개변수를 보고 타입을 유추를 한다.
		//이 방법을 대부분 쓴다. 아울러 박싱(wrapping)이 된다.
		
		Box<Integer>box2 = Util.boxing(100);
//		Util.<Integer>boxing("홍길동"); //에러난다. int에 String 넣어서 
		
		int intValue = box2.get();
		System.out.println("Box<Integer> box2객체에서 받아온 값"+intValue);
		
		Box<String> box3 = Util.boxing("홍길동 ");
		//Box<String>box3 = Util.<String>boxing("홍길동");
		String strValue = box3.get();
		
		System.out.println("Box<String> box3객체에서 받은 값: " + strValue);
		

	}

}
