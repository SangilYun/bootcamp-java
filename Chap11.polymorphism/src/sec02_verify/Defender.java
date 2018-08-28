package sec02_verify;

public class Defender extends Player{

	int def;
	
	public Defender(String name, int age, int backNumber, int spd, int def) {
		super(name,age,backNumber,spd);
		this.def = def;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public void infoPrint() {
		System.out.println("수비수 선수를 소개합니다.");
		super.infoPrint();
		System.out.println("방어 횟수 : " + this.def + "\n");
	}
}
