package sec_verify03;

public abstract class Animal {

	String kind;
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	
	public abstract void sound();
	
}

