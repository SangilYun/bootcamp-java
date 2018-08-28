package sec08_verify;

public class Navy extends Unit {

	public Navy() {
		super("서애 류성용함");
	}
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> 어뢰 발사");
	}
	
	public void incleus() {
		System.out.println(super.getName() + " >> 지상 상륙");
		System.out.println(super.getName() + " >> 잠수정 출동");
	}
}
