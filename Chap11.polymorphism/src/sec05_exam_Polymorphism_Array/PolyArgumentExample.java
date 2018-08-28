package sec05_exam_Polymorphism_Array;

public class PolyArgumentExample {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Tv());
		
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Audio());
		
		b.summary();
		for(int i=0; i<b.item.length;i++) {
			System.out.println(b.item[i]);
		}
	}
}
