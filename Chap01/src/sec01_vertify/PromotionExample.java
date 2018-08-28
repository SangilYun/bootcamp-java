package sec01_vertify;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		char charValue = '가';
		long longValue ;
		double doubleValue ;
		int intValue;

		intValue = byteValue;
		System.out.println("byteValue값을 intValue로 자동캐스팅 결과값 : " + intValue);
		intValue = charValue;
		System.out.println("charValue값을 intValue로 자동캐스팅 결과값(unicode) : +" + intValue);
		intValue = 500;
		longValue =intValue;
		System.out.println("intValue값을 longValue로 자동캐스팅 결과값 : +" + longValue);
		intValue = 200;
		doubleValue = intValue;
		System.out.println("intValue값을 longValue로 자동캐스팅 결과값 : +" + doubleValue);
	}

}
