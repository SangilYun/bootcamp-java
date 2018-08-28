package sec01_exam;

public class MyMathExample {
	
	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		//long result3 = mm.multiply(5L, 3L);
		long result3 = MyMath.multiply(5L, 3L);
		//long result4 = mm.divide(5L, 3L);
		double result4 = MyMath.divide(5L, 3L);
		
		System.out.println("add(5L,3L) = " + result1);
		System.out.println("subtract(5L,3L) = " + result2);
		System.out.println("multiply(5L,3L) = " + result3);
		System.out.println("divide(5L,3L) = " + result4);
		
		System.out.println(mm.studyJava());
	}

}
