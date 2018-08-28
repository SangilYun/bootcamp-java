package sec_verify04_2;

public class Account {

	private int balance;
	
	public void setBalance(int balance) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		this.balance = balance;
		System.out.println(Thread.currentThread().getName() + "이/가 입금 : " + balance +"원");
	}
	
	public void getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println("통장 잔액 : " + this.balance);
	}
	
	public void withDraw(int amount) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		//현재 잔액보다 많은 금액을 출금할려는 경우
		if(balance < Math.abs(amount))
			System.out.println(Thread.currentThread().getName() +" 이/가 "+Math.abs(amount) +"원 출금 시도하였습니다."
					+ "\n잔액이 부족합니다.");
		//잔액 한도내에서 출금하려는 경우
		else
			System.out.println(Thread.currentThread().getName() + " 이/가 출금 : " + Math.abs(amount)+"원");
		this.balance += amount;
	}
	
}
