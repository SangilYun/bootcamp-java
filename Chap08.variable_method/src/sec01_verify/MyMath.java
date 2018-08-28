package sec01_verify;

public class MyMath {
	int a = 200;
	int b = 100;
	
	long add() {
		return a+b;
	}
	
	long subtract() {
		return a-b;
	}
	
	long multiply() {
		return a*b;
	}
	
	long divide() {
		return a/b;
	}
	
	static long add(long a, long b) {
		return a+b;
	}
	
	static long subtract(long a, long b) {
		return a-b;
	}
	
	static long multiply(long a, long b) {
		return a*b;
	}
	
	static long divide(long a, long b) {
		return a/b;
	}
	
	static void test() {
		System.out.println("클래스(static) method add : " + MyMath.add(200, 100));
		System.out.println("클래스(static) method subtract : " + MyMath.subtract(200, 100));
		System.out.println("클래스(static) method multiply : " + MyMath.multiply(200, 100));
		System.out.println("클래스(static) method divide : " + MyMath.divide(200, 100)*1.0);
		MyMath test = new MyMath();
		System.out.println("Instance method add : " + test.add());
		System.out.println("Instance method subtract : " + test.subtract());
		System.out.println("Instance method multiply : " + test.multiply());
		System.out.println("Instance method divide : " + test.divide()*1.0);
	}
}
