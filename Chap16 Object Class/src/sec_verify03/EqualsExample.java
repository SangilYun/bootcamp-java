package sec_verify03;

public class EqualsExample {

	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		Point p3 = new Point(3,10);
		
		System.out.println("Point p1의 필드 값 : " + p1);
		System.out.println("Point p2의 필드 값 : " + p2);
		System.out.println("Point p3의 필드 값 : " + p3);

		if(p1.equals(p2)) {
			System.out.println("p1의 필드와 p2의 필드는 같다.");
		}
		
		if(p1.equals(p3)) {
			System.out.println("p1의 필드와 p2의 필드는 같다.");
		}
	}

}
