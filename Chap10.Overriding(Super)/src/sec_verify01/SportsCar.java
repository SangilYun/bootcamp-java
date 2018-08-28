package sec_verify01;

public class SportsCar extends Car {


	public void getSpeed() {
		System.out.println("현 스포츠카의 속도는 " + this.speed + "km 입니다.");
	}
	
	public void scStop() {
		System.out.println("스포츠카를 멈춥니다.");
		speed = 0;
	}
	
	public static void main(String args[]) {
		SportsCar sc = new SportsCar();
		sc.getSpeed();
		sc.speedUp();
		sc.getSpeed();
		sc.speedUp();
		sc.getSpeed();
		sc.speedUp();
		sc.getSpeed();
		
		sc.speedDown();
		sc.getSpeed();
		sc.speedDown();
		sc.getSpeed();
		
		sc.stop();
		sc.scStop();
		
		sc.getSpeed();

	}
}
