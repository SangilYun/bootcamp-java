package sec01_exam_FighterExample;

public class FighterExample {

	public static void main(String[] args) {
		//Fightable f = new Fighter();
		Fighter f = new Fighter();
//		Unit f = new Fighter();
		
		/*
		 * A instanceof B 란 A가 타입일 경우 true를 반환한다.
		 * 즉, A가 B로 형변환(TypeCasting) 된다는 의미이다.(조상클래스라는 뜻)
		 * 다형성의 개념을 떠올려 보자.(조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있는 것.)
		 * 참조하고있는 인스턴스가 fighter이기 때문. 타입은 fightable이지만.
		 * 상속 계층도를 그려보자. 
		 */

		if(f instanceof Unit) {
			System.out.println("f는 Unit의 자손입니다.");
		}
		
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		}
		
		if(f instanceof Movable) {
			System.out.println("f는 Movable의 자손입니다.");
		}
		if(f instanceof Unit) {
			System.out.println("f는 Attackable인터페스를 구현했습니다.");
		}
		if(f instanceof Unit) {
			System.out.println("f는 Object클래스의 자손입니다.");
		}
		//재정의된 추상메서드 호출
		f.move(0, 0);
		f.attack(null);
	}

}
