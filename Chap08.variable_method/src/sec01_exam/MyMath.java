package sec01_exam;

public class MyMath {

	//2개의 인스턴스 member method, 2개의 static method
	//return문은 항상 1개로 즉 최소화 시켜주는게 바람직하다.
	public long add(long a, long b) {
		long result = a+b;
		return result; //return a+b;라고 할 수도 있다.
	}
	
	public long subtract(long a, long b) {
		return a-b;
	}
	public static long multiply(long a ,long b) {
		return a*b;
	}
	public static double divide(double a, double b) {
		return a/b;
	}
	public String studyJava() {
		return "자바 수업을 합니다.";
	}
	
	
	public static void main(String[] args) {
		
	}
}
