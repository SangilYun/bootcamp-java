package sec07_verify;

public class Buyer {
	
	int money = 1000;	//소유금액
	int bonusPoint = 0; //보너스점수
	
	Product[] item = new Product[10];		//buyer클래스 보다 먼저 생성됨(포함관계)
	int i=0;
	//매개변수 Product p의 개념을 정확히 이해하는 것이 매우 중요!(다형성 적용)
	//Product뿐 아니라 Product를 상속받는
	//어떤클래스라도 다 매개변수로 들어올 수 있다.
	
	public void buy(Product p) {
		if(this.money < p.price) {
			System.out.println(p+"는 잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		this.money -= p.price;				//가진 돈에서 구입한 제품의 가겨을 뺀다.
		this.bonusPoint += p.bonusPoint;	//제품의 보너스 점수를 추가한다.
		this.item[i++] = p;					//제품을 Product[] item에 저장한다.
		System.out.println(p+ "를 구입하셨습니다.");
	}
	//구매한 물품에 대한 정보를 요약해서 보여 준다.
	public void summary() {
		int sum = 0;					//구매한 물품의 가격합계 
		String itemList = "";			//구매한 물품목록 
		
		//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0;i<item.length;i++) {
			if(item[i]==null)
				break;
			
			sum += this.item[i].price;
			
			if(i==9)
				itemList += this.item[i];
			else
				itemList += this.item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
