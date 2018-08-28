package sec06_exam_Polymorphism_Array_Vector;

import java.util.Vector;

public class Buyer {
	
	int money = 100000;	//소유금액
	int bonusPoint = 0; //보너스점수
	
	//구입한 제품을 저장하는데 사용될 vector객체(기본적 10개방을 생성)
	@SuppressWarnings("rawtypes")
	Vector item = new Vector();
	
	//buy메서드의 매개변수가 조상타입이라는 것에 주목(다형성)
	@SuppressWarnings("unchecked")
	public void buy(Product p) {
		if(this.money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		this.money -= p.price;				//가진 돈에서 구입한 제품의 가겨을 뺀다.
		this.bonusPoint += p.bonusPoint;	//제품의 보너스 점수를 추가한다.
		this.item.add(p);
		System.out.println(p+ "를 구입하셨습니다.");
	}
	
	public void refund(Product p) {
		//제품을 Vector에서 제거한다.
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}
		//제거에 실패한 경우 
		else {
			System.out.println("구입하신 제품 중에 해당 제품이 없습니다.");
		}
	}
	
	//구매한 물품에 대한 정보를 요약해서 보여 준다.
	public void summary() {
		int sum = 0;					//구매한 물품의 가격합계 
		String itemList = "";			//구매한 물품목록 
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0;i<item.size();i++) {
			if(item.get(i) instanceof Product) {
				Product p = (Product)item.get(i); // 강제타입변경(다운케스팅)
				sum += p.price;
				//삼항연산자
				itemList += ((i==0) ? "" + p : ", " + p);
			}
			else {
				System.out.println("Product객체가 아닙니다.");
			}
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
