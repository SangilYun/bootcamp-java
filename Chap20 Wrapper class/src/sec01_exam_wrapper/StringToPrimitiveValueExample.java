package sec01_exam_wrapper;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {
		 
		//랩퍼객체의 정적 메서드인 parse + 기본타입명 이용하여 
		//문자열이 해당 데이터 타입형태가 되어 대입됨.
		int value1 = Integer.parseInt("100");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
