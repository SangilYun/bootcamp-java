package sec_verify06;

public class NumberExceptionExample {

	public static void main(String[] args) {
		 String[] stringNumber = {"23","12","998","java"};
		 
		 try {
			 for(int i=0; i<stringNumber.length;i++) {
				 int a = Integer.parseInt(stringNumber[i]);
				 System.out.println("숫자로 변환된 값은 : " + a);
			 }
		 }
		 catch(Exception e) {
			 System.out.println("예외 발생 : 정수로 변환할 수 없습니다.");
		 }
	}
}
