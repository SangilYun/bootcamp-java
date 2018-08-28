package sec_verify08;

public class ShipExample {

	public static void main(String[] args) {
		Boat boat = new Boat();
		Cruise cruise = new Cruise();
		ShipUtil.search(boat);
		ShipUtil.search(cruise);

		System.out.println(boat.name());
		System.out.println(cruise.name());
	}

}
