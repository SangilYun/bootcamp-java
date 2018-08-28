package sec_verify03;

public class Dog extends Animal{

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println(this.kind+"인 강아지가 소리를 냅니다. 멍멍!");
	}
}
