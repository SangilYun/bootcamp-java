package sec05_exam_instance_copy;

public class Car {

	String color;
	String gearType;
	int door;
	
	public Car() {
		this("white","auto",4);
	}
	
	public Car(Car c) {
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		String str = "색깔 = " + this.color + ", 기어타입 = "+ this.gearType+", 문갯수 = "+this.door;
			return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
