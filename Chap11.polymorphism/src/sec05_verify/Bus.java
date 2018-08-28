package sec05_verify;

public class Bus extends Vehicle{
	
	public void run() {
		System.out.println("조상클래스 타입에 적용되는 자손클래스들의 run메서드를 호출합니다.");
		System.out.println("Vehicle의 자손클래스인 버스가 달립니다.");
	}

}
