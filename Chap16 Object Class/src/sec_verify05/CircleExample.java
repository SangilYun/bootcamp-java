package sec_verify05;

public class CircleExample {

	public static void main(String[] args) {
		Circle c1 = new Circle(1,2,10);
		Circle c2 = new Circle(5,6,10);
		

		System.out.println("원 1 : " + c1);
		System.out.println("원 2 : " + c2);
		

		if(c1.equals(c2)) {
			System.out.println("원 1과 원 2는 같은 원입니다.");
		}
		else {
			System.out.println("불일치");
		}
	}

}
