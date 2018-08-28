package sec_verify08;

public class WrongPasswordException extends Exception{

	public WrongPasswordException() {}
	public WrongPasswordException(String s) {
		super(s);
	}
}
