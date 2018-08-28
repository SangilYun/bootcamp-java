package sec_verify07;

public class DriverExample {

	public static void main(String[] args) {
		Driver d = new Driver();
		
		d.drive(new Bus());
		d.stop(new Bus());
		
		d.drive(new Taxi());
		d.stop(new Taxi());
	}

}
