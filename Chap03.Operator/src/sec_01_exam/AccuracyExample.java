package sec_01_exam;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - (number * pieceUnit);
		
		System.out.println((double)number);

		
		System.out.println(number * pieceUnit);

		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7조각을 빼면 ");
		System.out.println(result + "조각이 남는다.");
//cpu 연산의 오
	}

}
