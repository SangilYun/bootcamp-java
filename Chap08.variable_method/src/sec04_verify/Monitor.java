package sec04_verify;

public class Monitor {

	String company;
	int inch;
	int price;
	
	Monitor(){
		this("LG", 23, 500000);
	}
	Monitor(String brand, int inch, int price){
		this.company = brand;
		this.inch = inch;
		this.price = price;
		
		System.out.println("제조사 : "+this.company+"이며, "+this.inch+"인치이며, 가격은 "+this.price+"입니다.");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Monitor test = new Monitor();

	}

}
