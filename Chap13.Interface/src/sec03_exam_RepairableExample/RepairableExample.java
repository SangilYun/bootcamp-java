package sec03_exam_RepairableExample;

public class RepairableExample {

	public static void main(String[] args) {
		SCV scv = new SCV();
		//Marine marine = new Marine();
		
		System.out.println("");
		Tank tank = new Tank();
		tank.DamageUnit(tank, 100);
		scv.repair(tank);
		
		System.out.println("-----------------------------");
		
		DropShip dropship = new DropShip();
		dropship.DamageUnit(dropship, 88);
		scv.repair(dropship);
		System.out.println("-----------------------------");
		
//		scv.repair(marine);
		
		scv.DamageUnit(scv, 10);
		scv.repair(scv);
	}

}
