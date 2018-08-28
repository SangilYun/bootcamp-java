package sec_verify01;

public class Truck extends Car{

	int capacity;
	
	int getCapacity() {
		return capacity;
	}
	
	@Override
	public String toString() {
		this.setSpeed(100);
		this.setColor("노란색");
		this.capacity = 50;
		return "트럭 속도는 " + this.getSpeed() + "Km, 색깔은 " + this.getColor() 
		+ " 적재량은 " + this.getCapacity()+"톤 입니다.";
	}
}
