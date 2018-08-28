package sec04_verify;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<5; i++) {
			System.out.println("[자동차가 달립니다.]");
			int flatTire = car.run();
			if(flatTire != 0) {
				System.out.println(car.tires[flatTire-1].location + "HankookTire로 교체");
				car.tires[flatTire-1] = new HankookTire(car.tires[flatTire-1].location,15);
			}
			System.out.println("----------------------");
		}
	}
}
