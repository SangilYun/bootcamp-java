package sec01_exam_CastingEx;

public class CastingExample2 {
	public static void main(String[] args) {
		Car car = new Car();	//Car인스턴스 생성
		//Car car = null;		//Car인스턴스 생성
		
		//다형성 : 조상타입의 참조변수를 가지고 자손타입의 인스턴스를 다를 수 있다.
		//(리모컨의 기능이 다 -> 소 로는 가능), 반대는 불가능
		//Car car = new FireEngine(); //이런식으로 가능함.
		
		//Car2는 null초기화
		Car car2 = null;
		FireEngine fe = new FireEngine();
		//Car에 drive()메서드 호출
		car.drive();
		//자손타입의 인스턴스를 갖고 조상타입의 인스턴스를 다를 수 없다.
		//리모컨의 기능이 소->다 로는 불가.
		//반대는 허용
//		car = fe; 
		fe = (FireEngine)car; //컴파일은 된다. 근데 실행시 에러가 발생(ClassCastException)
		fe.drive();				//자식이 부모타입으로 자동 변환 후 다시 자식타입으로 변환할 때 강제타입변환을 쓸 수 있다.
		car2 = fe;
		car2.drive();
		fe.water();
	}
}
