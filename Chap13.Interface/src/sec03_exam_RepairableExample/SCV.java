package sec03_exam_RepairableExample;

public class SCV extends AirUnit implements Repairable{

//	static int hitPoint;
	
	public SCV() {
		super(60);
		System.out.println(this.toString()+ "의 HP는 " + this.MAX_HP + "입니다.");
		hitPoint = this.MAX_HP;
	}

	public void repair(Repairable r) {	//각 클래스의 static hitpoint를 없애고 
		if(r instanceof Unit) {			//unit으로 부터 상속받은 hitpoint 변수를 이용해 
			int count = 0;				//각 유닛의 현재 체력을 나타냄.
			//if it's a type of unit
			Unit u = (Unit)r;
			
			System.out.println("Current HP : " +(u.hitPoint));
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint ++;
				count++;
			}
			System.out.println(u.toString() + "는 " + count+" 수리함.");
		}
	}
	@Override
	public String toString() {
		return "SCV";
	}
	
	//매개변수타입으로 Repairable인터페이스가 들어왔다. 이 의미는 무엇인가.
	
	@Override
	public void DamageUnit(Repairable r, int Damage) {
		
		if(r instanceof Unit) {
		Unit unit = (Unit)r;
		System.out.println(unit.toString() + " took " + Damage);
		System.out.println(unit.toString() + " current Hp : "+ (unit.MAX_HP-Damage));
		System.out.println(unit.toString() +" needs repair");
		}
	hitPoint -= Damage;
	}
}
