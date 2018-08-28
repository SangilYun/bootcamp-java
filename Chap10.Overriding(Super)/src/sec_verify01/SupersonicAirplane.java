package sec_verify01;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			super.fly();
		}
	}
	
	static public void main(String args[]) {
		SupersonicAirplane suPl = new SupersonicAirplane();
		suPl.takeOff();
		suPl.fly();
		suPl.flyMode = SupersonicAirplane.SUPERSONIC;
		suPl.fly();
		suPl.flyMode = SupersonicAirplane.NORMAL;
		suPl.fly();
		suPl.land();
	}
}
