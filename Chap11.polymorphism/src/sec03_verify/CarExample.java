package sec03_verify;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for(int i=0; i<5; i++) {
			System.out.println("[자동차가 달립니다.]");
			int flatTire = car.run();
			switch(flatTire){
				case 1 :
					car.flTire = new KumhoTire("앞왼쪽", 15);
					System.out.println("앞왼쪽 KumhoTire로 교체");
					break;
				case 2 :
					car.frTire = new KumhoTire("앞오른쪽", 13);
					System.out.println("앞오른쪽 KumhoTire로 교체");
					break;
				case 3 :
					car.blTire = new HankookTire("뒤왼쪽", 14);
					System.out.println("뒤왼쪽 HankookTire로 교체");
					break;
				case 4 :
					car.brTire = new HankookTire("뒤오른쪽" , 17);
					System.out.println("뒤오른쪽 HankookTire로 교체");
					break;
			}
			System.out.println("----------------------");
		}
	}
}
