package sec_verify04;

public class RectExample {

	public static void main(String[] args) {
		 
		Rect rec1 = new Rect(5,15);
		Rect rec2 = new Rect(15,5);
		Rect rec3 = new Rect(3,10);

		System.out.println("rec1의 필드 값 : " + rec1);
		System.out.println("rec2의 필드 값 : " + rec2);
		System.out.println("rec3의 필드 값 : " + rec3);

		if(rec1.equals(rec2)) {
			System.out.println("rec1과 rec2의 사격형 면적은 같다.");
		}
		if(rec1.equals(rec3)) {
			System.out.println("p1의 필드와 p2의 필드는 같다.");
		}
	}
}
