package sec06_user_define_exception_01;

public class AccountExample {
	
	public static void main(String[] args) {
		
		Account ac = new Account();
		//예금하기
		ac.deposit(10000);
		System.out.println("예금액 : " + ac.getBalance());
		
		//출금하기(예외발생처리코드를 필히 작성해야 됨)
		try {
			//ac.withdraw(10000);
			ac.withdraw(30000);
			System.out.println("출금이 되었습니다.");
			System.out.println("현잔액 : " + ac.getBalance());
		}
		catch(BalanceInsuficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			//개발할 때 사용한다. 개발완료 시 주석처리를 하던지 삭제를 하는 것이 바람직 하다.
			e.printStackTrace();
			//System.out.println(e.toString());//간단히 디버깅 할 때 사용.
		}
	}

}
