package sec_verify04_2;

public class WithDrawThread1 extends Thread{

	private Account account;
	
	public void setAccount(Account a) {
		this.account = a;
		this.setName("어머니");
	}
	
	@Override
	public void run() {
		synchronized(account) {
			account.setBalance(1000);
			account.withDraw(-500);
			account.getBalance();
			try {
				account.wait();
			} catch (InterruptedException e) {}
			account.withDraw(-300);
		}
	}
}
