package sec1_verify;

import java.util.Scanner;

public class Exercise03 {
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}
	
	@Override
	public String toString() {
		return ("상품 이름 : "+this.getName()+"\n상품 가격 : "+this.getPrice()
		+"\n재고 수량 : "+this.getNumberOfStock()+"\n팔린 수량 : "+this.getSold());
	}

	public void test() {
		String strInput;
		int numInput;
		Scanner scan = new Scanner(System.in);
		System.out.println("상품 이름 : ");
		strInput = scan.next();
		this.setName(strInput);
		
		System.out.println("상품 가격 : ");
		numInput = scan.nextInt();
		this.setPrice(numInput);
		
		System.out.println("재고 수량 : ");
		numInput = scan.nextInt();
		this.setNumberOfStock(numInput);
		
		System.out.println("팔린 수량 : ");
		numInput = scan.nextInt();
		this.setSold(numInput);
		
		System.out.println(this);
		scan.close();
	}
	public static void main(String[] args) {

		Exercise03 test = new Exercise03();
		test.test();
	}
}
