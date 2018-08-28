package sec06_exam_Polymorphism_Array_Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

@SuppressWarnings("unused")
public class PolyArgumentExample {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Apple apple = new Apple();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		
		b.buy(com);
		b.buy(audio);
		b.buy(new Tv()); //new 방법으로 추가하면 remove할 수 있는 방법이 없다.(?)
		
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Audio());
		
		@SuppressWarnings("rawtypes")
		java.util.Iterator it = b.item.iterator();
		while(it.hasNext()) {
			Product p = (Product)it.next();
			System.out.println(p);
		}
		
		System.out.println("현재 백터에 Product 객체의 수 : " + b.item.size());
		//b.buy(apple); //에러난다. 이유?
		b.summary();
		System.out.println();
		b.refund(com);
		b.refund(audio);
		b.summary();
		System.out.println("현재 백어테 Product객체의 수 : " + b.item.size());
	}
}
