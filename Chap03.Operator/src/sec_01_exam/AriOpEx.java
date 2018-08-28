package sec_01_exam;

public class AriOpEx {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1+v2;
		System.out.println("result1="+result1);
		int result2 = v1-v2;
		System.out.println("result1="+result2);
		int result3 = v1*v2;
		System.out.println("result1="+result3);
		int result4 = v1/v2;
		System.out.println("result1="+result4);
		int result5 = v1%v2;
		System.out.println("result1="+result5);
		
		double result6 = v1/0; //0으로 나누면?
		System.out.println("   =" + result6);
		
		//ArithmeticException is the exception which is normally thrown when you divide by 0. 
		//
	}

}
