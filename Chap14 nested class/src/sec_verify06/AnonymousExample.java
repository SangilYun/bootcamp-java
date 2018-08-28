package sec_verify06;

public class AnonymousExample {

	public static void main(String[] args) {
		System.out.println("==============================");
		Anonymous anony = new Anonymous();
		for(int i = 0; i<=11;i++) {
		anony.field.run();
		anony.field.speedup();
		}
		System.out.println("==============================");
		for(int i =0; i<=5;i++) {
		anony.passengerCar();
		}
		System.out.println("==============================");
		
		anony.airPlane(new Vehicle() {
			int airSpeed=0;
			
			public void run() {
				if(airSpeed <0) {
					System.out.println("비행기의 스피드가 음수일리가 있나요 ?");
					airSpeed =0;
				}

				else {
					System.out.println("비행기의 현재 스피드 : " + airSpeed+"Km 입니다.");
				}
			}

			@Override
			public void speedup() {
				airSpeed+=100;
			}
		});
	}

}
