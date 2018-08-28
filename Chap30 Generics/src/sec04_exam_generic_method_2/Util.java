package sec04_exam_generic_method_2;

public class Util {

	//compare()메서드는 매개값으로 두 Pair객체를 받아서 해당 제네릭타입인 K,V를 비교해서
	//둘다 같으면 true, 하나라도 다르면 false를 리턴하는 메서드이다.
	public static<K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		//Pair클래스에 getKey메서드를 이용해서 p1과 p2의 k값을 비교함
		//(단, Object의 equals()를 재정의가 되어 있는 타입이여야 가능함)
		boolean keyCompare = p1.getKey().equals(p2.getKey()); 	//equals를 오버라이딩 해야 값을 비교함. 아니면 주소비교 
		
		//Pair클래스에 getValue메서드를 이용해서 p1과 p2의 v값을 비교함
		//(단, Object의 equals()를 재정의가 되어있는 타입이여야 가능함.
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;	//둘 다 true여야 true를 리턴함. 
	}
}
