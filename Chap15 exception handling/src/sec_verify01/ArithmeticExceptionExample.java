package sec_verify01;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for(int i=0; i< 10; i++) {
			try {
				result = number/(int)(Math.random() *10);
				System.out.println(result);
			}
			catch(Exception e){
				System.out.println("랜덤값이 0이 나와서 오류.");
				System.out.println("예외 발생"+e);
			}
		}
	}
}
