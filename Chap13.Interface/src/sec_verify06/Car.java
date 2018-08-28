package sec_verify06;

public class Car {
	Tire frontLeftTire;
	Tire frontRightTire;
	Tire backLeftTire;
	Tire backRightTire;
	
	public void run() {
		frontLeftTire = new HankookTire();
		frontRightTire = new HankookTire();
		backLeftTire = new HankookTire();
		backRightTire = new HankookTire();
		
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
		frontLeftTire = new KumhoTire();
		frontRightTire = new KumhoTire();
		backLeftTire = new KumhoTire();
		backRightTire = new KumhoTire();
		
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
		
	}

}
