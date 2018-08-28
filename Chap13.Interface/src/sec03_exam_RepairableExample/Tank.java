package sec03_exam_RepairableExample;

public class Tank extends AirUnit implements Repairable{

//	static int hitPoint;
	
	public Tank() {
		super(150);
		System.out.println(this.toString()+ "의 HP는 " + this.MAX_HP + "입니다.");
		hitPoint = this.MAX_HP;
	}

	@Override
	public String toString() {
		return "Tank";
	}
	
	//매개변수타입으로 Repairable인터페이스가 들어왔다. 이 의미는 무엇인가.
	
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		
		if(r instanceof Unit) {
		Unit unit = (Unit)r;
		System.out.println(unit.toString() + " took " + Damage);
		System.out.println(unit.toString() + " current Hp : "+ (unit.MAX_HP-Damage));
		System.out.println(unit.toString() +" needs repair");
		System.out.println("");
		hitPoint = unit.MAX_HP - Damage;
		}
//		hitPoint -= Damage;
	
	}
}
