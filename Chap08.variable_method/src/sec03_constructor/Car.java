package sec03_constructor;

public class Car {
	String color;
	String gearType;
	int door;
	
	public Car() {
		this("white","auto",4);
		System.out.println("기본 생성자 호출");
	}
	
	//매개변수가 있는 생성자
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("매개변수가 있는 생성자 호출");
	}
	
	//어노테이션(annotation) : 컴파일러에게 강하게 체클르 하라는 뜻.
	
	@Override
	public String toString() {
		String str = "색깔 = " + this.color + ", 기어타입 = "+ this.gearType+", 문갯수 = "+this.door;
			return str;
	}
}
