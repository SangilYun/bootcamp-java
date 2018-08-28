package sec_verify08;

public class ShipUtil {

	static void search(Ship s) {
		if(s instanceof Cruise) {
			System.out.println("Boat가 나를 수 있는 인원  : " + s.move());
			System.out.println("Boat가 나를 수 있는 무기 : " + s.carry());
		}
		else {
			System.out.println("Cruise가 나를 수 있는 인원  : " + s.move());
			System.out.println("Cruise가 나를 수 있는 무기 : " + s.carry());
		}
	}
}
