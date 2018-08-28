package sec07_verify;

public class Product {
	
	int price;		//제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스 점수
	
	//생성자
	public Product(int price) {
		this.price = price;
		//보너스점수는 제품 가격의 10%
		this.bonusPoint = (int)(price*0.1);
	}
	
	public Product() {}
}
