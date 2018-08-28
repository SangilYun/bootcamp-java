package sec06_exam_bounded_parameter_type;

public class Util {

	public static <T extends Number> int compare (T t1, T t2) {
		
		//number클래스의 doubleValue()란 추상메서드를 이용함.
		//결과론적으로 Number클래스를 상속받는 클래스 중,
		//doubleValue() 추상메서드를 재정의를 한 클래스만 가능하다고 보면 된다. 
		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();
		
		//Double클래스의 정적 메서드인 compare()를 이용.
		return Double.compare(value1, value2);
	}
}
