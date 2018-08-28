package sec01_exam_CastingEx;

public class CastingExample1 {
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;		//car = (Car)fe;에서 형변환이 생략된 형태다(다형성)
//		car.water();	//근본이 달라서 오류남. car을 FireEngine클래스로 선언했다면 가능했을 것.
		fe2 = (FireEngine)car;	// 조상타입 -> 자손타입.
		fe2.water();
	}
}
