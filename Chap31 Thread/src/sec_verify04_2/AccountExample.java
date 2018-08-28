package sec_verify04_2;

public class AccountExample {

	public static void main(String[] args) {
		Account a = new Account();
		WithDrawThread1 mom= new WithDrawThread1();
		WithDrawThread2 son= new WithDrawThread2();
		
		mom.setAccount(a);
		son.setAccount(a);
		mom.start();
		son.start();
	}
}
