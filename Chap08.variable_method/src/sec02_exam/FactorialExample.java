package sec02_exam;

public class FactorialExample {

	public static void main(String[] args) {
		
		long result = FactorialExample.factorial(5L);
		System.out.println("5!(팩토리얼) 값 : "+result);
	}
	
	public static long factorial(long n) {
		long result = 0L;
		
		if(n==1) {
			result =1;
		}
		else {
			System.out.println("result값 : " + result + " n값 : "+ n);
			result = n * factorial(n-1);
		}
		return result;
	}

}
