package sec_verify03;

public class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println(this.kind+"인 고양이가 소리를 냅니다. 야옹~~");
	}
}
