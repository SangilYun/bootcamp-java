package sec_verify06;

public class Anonymous {
	int bicycleSpeed=-1;
	int carSpeed=-1;
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			if(bicycleSpeed <0) {
				System.out.println("자전거의 스피드가 음수일리가 있나요 ?");
				bicycleSpeed =0;
			}
			else if(bicycleSpeed>100) {
				System.out.println("자전거의 스피드가 100Km이라니 미쳤군요");
			}
			else {
				System.out.println("자전거의 스피드 : " + bicycleSpeed+"Km입니다.");
			}
		}

		@Override
		public void speedup() {
			bicycleSpeed += 10;
		}
	};
	void passengerCar() {
		Vehicle v = new Vehicle() {

			@Override
			public void run() {
				if(carSpeed <0) {
					System.out.println("자동차의 스피드가 음수일리가 있나요 ?");
					bicycleSpeed =0;
				}
				else {
					System.out.println("차의 현재 기어 : " + carSpeed+" 단입니다.");
				}
			}

			@Override
			public void speedup() {
				carSpeed++;
				
			}
		};
		v.run();
		v.speedup();
	}
	
	void airPlane(Vehicle v) {
		for(int i =0; i<10; i++) {
		v.run();
		v.speedup();
		}
	}

}
