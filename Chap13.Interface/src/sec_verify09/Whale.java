package sec_verify09;

public class Whale extends Fish implements Mammal{

	@Override
	public void bear() {
		System.out.println("고래는 새끼를 낳습니다.");
	}

	@Override
	void swim() {
		System.out.println("물고기는 헤엄치며 움직입니다.");	
	}
}
