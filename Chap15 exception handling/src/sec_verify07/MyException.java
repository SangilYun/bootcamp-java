package sec_verify07;

@SuppressWarnings("serial")
public class MyException extends Exception{ //사용자 정의 클래스 만듬.

	public MyException() {}
	public MyException(String s) {
		super(s);
	}
}
