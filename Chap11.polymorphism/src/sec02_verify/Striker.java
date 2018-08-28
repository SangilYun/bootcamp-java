package sec02_verify;

public class Striker extends Player{

	int shoot;
	
	public Striker(String name, int age, int backNumber, int spd, int shoot) {
		super(name,age,backNumber,spd);
		this.shoot = spd;
	}

	public int getShoot() {
		return shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}
	
	public void infoPrint() {
		System.out.println("공격형 FW선수를 소개합니다.");
		super.infoPrint();
		System.out.println("valid shooting : " + this.shoot + "\n");
	}
}
