package sec04_verify;

public class CarExample {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	CarExample(){
	}
	
	CarExample(String model){	
		this.model = model;
	}
	
	CarExample(String model, String color){
		this.model=model;
		this.color=color;
	}
	
	CarExample(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	@Override
	public String toString() {
		System.out.println("test : " + this.company+"\ncar4.modle : " +this.model
				+"\ncar4.color : "+this.color+"\ncar4.maxSpeed : "+this.maxSpeed);
		return"";
	}
	public static void main(String[] args) {
		CarExample car1 = new CarExample();
		CarExample car2 = new CarExample("자가용");
		CarExample car3 = new CarExample("자가용","빨강");
		CarExample car4 = new CarExample("택시", "검정", 200);
		
		System.out.println(car1);

		System.out.println("car1.company : " + car1.company+"\n");
		System.out.println("car2.company : " + car2.company+"\ncar2.modle : " +car2.model+"\n");
		System.out.println("car3.company : " + car3.company+"\ncar3.modle : " +car3.model+"\ncar3.color : "+car3.color+"\n");
		System.out.println("car4.company : " + car4.company+"\ncar4.modle : " +car4.model
				+"\ncar4.color : "+car4.color+"\ncar4.maxSpeed : "+car4.maxSpeed);



	}

}
