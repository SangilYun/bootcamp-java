package sec08_verify;

public class UnitExample {

	Unit[] units = new Unit[] {
			new AirForce("제1전투비행단"),
			new AirForce("제38전투비행전단"),
			new Navy(),
			new Army("맹호부대"),
			new Army("무적태풍부대")
	};
	int idx = 0;
	
	public void casting(Unit u) {
		if(u instanceof Army) {
			Army army = (Army)u;
			army.attack();
			army.tank();
		}
		else if (u instanceof Navy) {
			Navy navy = (Navy)u;
			navy.attack();
			navy.incleus();
		}
		else if (u instanceof AirForce) {
			AirForce air = (AirForce)u;
			air.attack();
			air.bombing();
		}
	}
	
	public static void main(String[] args) {
		UnitExample test= new UnitExample();
		for(int i=0; i<test.units.length;i++) {
			test.casting(test.units[i]);
			System.out.println();
		}
	}
}
