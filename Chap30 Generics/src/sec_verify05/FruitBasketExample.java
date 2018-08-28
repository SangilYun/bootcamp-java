package sec_verify05;

public class FruitBasketExample {

	public static void main(String[] args) {

		
		Fruit<String, Integer> a = FruitBasket.basketing("사과", 1500);
		System.out.println(a.getK() + " " + a.getV());
		a = FruitBasket.basketing("귤", 700);
		System.out.println(a.getK() + " " + a.getV());
		a = FruitBasket.basketing("배", 3700);
		System.out.println(a.getK() + " " + a.getV());
		
		System.out.println("==========");
		for( Fruit<String, Integer> f: FruitBasket.fruitArr) {
			System.out.println(f.getK() +" " + f.getV());
		}
	}

}
