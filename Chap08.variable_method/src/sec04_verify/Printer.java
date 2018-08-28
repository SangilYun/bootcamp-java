package sec04_verify;

public class Printer {

	void println(int value) {
		System.out.println("숫자값 입력 : "+ value);
	}
	
	void println(boolean value) {
		System.out.println("논리값 입력 : "+ value);
	}
	
	void println(double value) {
		System.out.println("더블값 입력 : "+ value);
	}
	
	void println(String value) {
		System.out.println("스트링 입력 : "+ value);
	}
	
	public static void main(String[] args) {
		Printer test = new Printer();
		test.println(10);
		test.println(true);
		test.println(5.7);
		test.println("홍길동");

	}

}
