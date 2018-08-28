package sec_verify04;

public class Example {

	public static void main(String args[]) {
	PDA pda = new PDA();
	SmartPhone sp = new SmartPhone();
	
	sp.sendCall();
	sp.reveiveCall();
	sp.sendSMS();
	sp.receiveSMS();
	sp.play();
	sp.stop();
	System.out.println(pda.calculate(3, 5));
	sp.scheduler();
	sp.applicationManager();
	}
}
