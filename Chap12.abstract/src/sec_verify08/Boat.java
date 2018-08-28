package sec_verify08;

public class Boat extends Ship{

	@Override
	public int move() {
		return 6;
	}
	
	@Override 
	public int carry() {
		return 0;
	}
	
	public String name() {
		return "Boat 이름 : 쌩쌩 보트, 인원 : 6, 무기 : 0";
	}
}
