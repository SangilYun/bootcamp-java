package sec06_user_define_exception_01;

public class Account {
	
	private long balance;
	
	public Account() {}
	
	//현잔액 가져오기
	public long getBalance() {
		return this.balance;
	}
	//입금하기
	public void deposit(int money) {
		this.balance += money;
	}
	//출금하기(예외 되던지기 하고 있다.)
	public void withdraw(int money) throws BalanceInsuficientException{
		//잔고보다 출금액이 많다면 강제로 예외 발생시킴
		if(this.balance<money)
			throw new BalanceInsuficientException("잔고부족 : " + (money - this.balance) + "모자람");
		this.balance -= money;
	}

}
