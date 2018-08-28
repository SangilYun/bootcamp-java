package sec_verify01;

public class Sedan extends Car{
	int seatNum;
	
	int getSeatNum() {
		return this.seatNum;
	}
	
	@Override
	public String toString() {
		this.setSpeed(300);
		this.setColor("노란색");
		this.seatNum = 5;
		return "승용차 속도는 " + this.getSpeed() + "Km, 색깔은 " + this.getColor() 
		+ " 적재량은 " + this.getSeatNum() + "개 입니다. ";
	}
}
