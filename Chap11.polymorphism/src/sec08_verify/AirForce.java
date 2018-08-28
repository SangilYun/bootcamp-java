package sec08_verify;

public class AirForce extends Unit{

	public AirForce(String s) {
		super(s);
	}
	
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> 이륙");
		System.out.println(super.getName() + " >> 공중 공격");
	}
	
	public void bombing() {
		System.out.println(super.getName() + " >> 폭격");
	}
}
