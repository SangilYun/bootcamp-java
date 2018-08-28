package sec01_vertify;

public class CastingExample {

	public static void main(String[] args) {
		
		
		char charValue ;
		long longValue =500;
		double doubleValue ;
		int intValue = 0;
		
		
		intValue = 44032;
		charValue = (char)intValue;
		System.out.println("intValue값을 charValue로 자동캐스팅 결과값 : " + charValue);
		intValue = (int)longValue;
		System.out.println("longValue값을 intValue로 자동캐스팅 결과값 : " + intValue);
		doubleValue = 3.143234 ;
		intValue = (int)doubleValue;
		System.out.println("doubleValue값을 intValue로 자동캐스팅 결과값 : " + intValue);

		//incomplete 
		
		
	}

}
