package sec02_verify;

public class Player {

	private String name;
	private int age;
	private int backNumber;
	protected int spd;
	
	public Player(String name, int age, int backNumber, int spd) {
		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
		this.spd = spd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}

	public int getSpd() {
		return spd;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}
	
	public void infoPrint() {
		System.out.println("Name : " + this.name + "\nage : "+this.age +
				"\nback number : " + this.backNumber + "\nspeed : " + this.spd);
	}
}
