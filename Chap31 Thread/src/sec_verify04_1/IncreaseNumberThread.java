package sec_verify04_1;

public class IncreaseNumberThread extends Thread{

	Number n;
	public IncreaseNumberThread(Number n) {
		this.n= n;
		this.setName(n.getName());
	}
	
	@Override
	public void run() {
		(this.n).addNum();
	}
}
