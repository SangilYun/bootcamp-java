package sec04_this;

public class Car {

		String color;
		String gearType;
		int door;
		
		public Car() {
			this("white","auto",4);
		}
		
		public Car(String color) {
			this(color,"auto",4);
		}
		
		public Car(String color, String gearType) {
			this(color, gearType,4);
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
}
