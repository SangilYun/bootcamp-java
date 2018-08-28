package sec02_verify;

public class Exercise09 {

	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(this.balance+balance>MAX_BALANCE || this.balance+balance < MIN_BALANCE) {
			System.out.println("입금하신 금액이 -이거나 백만원을 초과했음.");
		}
		else {
			this.balance += balance;
		}
	}
	public static void main(String[] args) {
		Exercise09 test = new Exercise09();
		test.setBalance(10000);
		System.out.println("현재 잔고 : " + test.getBalance());
		test.setBalance(990001);
		System.out.println("현재 잔고 : " + test.getBalance());
		test.setBalance(-100001);
		System.out.println("현재 잔고 : " + test.getBalance());
		test.setBalance(300000);
		System.out.println("현재 잔고 : " + test.getBalance());

	}

}
