package sec_verify04_1;

public class IncreaseNumberExample {

	public static void main(String[] args) {
	
		Number n = new Number("FirstThread");
		IncreaseNumberThread i1 = new IncreaseNumberThread(n);
		
		n.changeName("ThirdThread");
		IncreaseNumberThread i2 = new IncreaseNumberThread(n);
		
		n.changeName("SecondThread");
		IncreaseNumberThread i3 = new IncreaseNumberThread(n);

		i1.start();
		i3.start();
		i2.start();
	}
}
