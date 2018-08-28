package sec_verify01;

public class Car {

	public int speed;
	
	public void speedUp() {
		speed += 10;
	}
	
	public void speedDown() {
		speed -= 10;
	}
	
	public void stop() {
		System.out.println("차 멈춥니다.");
		speed = 0;
	}
}
