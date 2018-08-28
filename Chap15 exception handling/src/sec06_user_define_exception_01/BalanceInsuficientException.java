package sec06_user_define_exception_01;

@SuppressWarnings("serial")
public class BalanceInsuficientException extends Exception {

	//기본생성자
	public BalanceInsuficientException() {}
	
	//생성자
	public BalanceInsuficientException(String message) {
		super(message); //조상의 생성자 호출
	}
	
}
