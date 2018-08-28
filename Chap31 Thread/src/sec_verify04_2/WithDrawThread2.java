package sec_verify04_2;

public class WithDrawThread2 extends Thread{

	//아들
	private Account account;
	
	public void setAccount(Account a) {
		this.account = a;
		this.setName("아들");
	}
	public void run() {
		synchronized (account) {
			account.notify();
			account.withDraw(-300);
			account.getBalance();
		}
	}
}
