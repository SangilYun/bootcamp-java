package sec03_exam_overloading;

public class StaticOverloadingExample {

	public static void main(String[] args) {
		
		int result = StaticOverloadingExample.add(3,5);
		System.out.println(result);
		int[] result2 = new int[] {0};
		
		StaticOverloadingExample.add(3,5,result2);
		
		System.out.println(result2[0]);
	}

	static int add(int a , int b) {
		return a+b;
	}
	
	static void add(int a, int b, int[] result) {
		result[0] = a+b;
	}
}
