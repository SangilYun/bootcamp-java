package sec04_exam_Polymorphism;

public class Buyer {
	
	int money = 500;	//소유금액
	int bonusPoint = 0; //보너스점수
	
	//매개변수 Product p의 개념을 정확히 이해하는 것이 매우 중요!(다형성 적용)
	//Product뿐 아니라 Product를 상속받는
	//어떤클래스라도 다 매개변수로 들어올 수 있다.
	
	public void buy(Product p) {
		
		if(this.money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			this.money =0;
			return;
		}
		
		//가진 돈에서 구입한 제품의 가겨을 뺀다.
		this.money -= p.price;
		//제품의 보너스 점수를 추가한다.
		this.bonusPoint += p.bonusPoint;
		System.out.println(p+ "를 구입하셨습니다.");
	}
}
