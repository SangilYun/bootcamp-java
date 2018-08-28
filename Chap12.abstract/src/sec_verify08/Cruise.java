package sec_verify08;

public class Cruise extends Ship{

	@Override
	public int move() {
		return 300;
	}
	
	public int carry() {
		return 200;
	}
	
	public String name() {
		return "Cruise 이름 : 전함 무궁화, 인원 : 300, 무기 : 200";
	}
}
