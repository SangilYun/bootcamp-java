package sec1_verify;

public class Exercise06 {

	String company;
	String model;
	String color;
	int maxSpeed;
	
	

	
	public String getCompany() {
		return company;
	}




	public void setCompany(String company) {
		if(company =="삼성")
			this.company = company;
		else
			System.out.println("삼성차가 아닙니다.");
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		if(model =="SM5")
			this.model = model;
		else
			System.out.println("삼성차 모델이 아닙니다.");

	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public int getMaxSpeed() {
		return maxSpeed;
	}




	public void setMaxSpeed(int maxSpeed) {
		if(maxSpeed >=0)
			this.maxSpeed = maxSpeed;
		else
			System.out.println("음수 속도? ");

	}
	
	@Override
	
	public String toString() {
		
		return (this.getCompany()+"회사의 "+ this.getColor()+"색상의 "
		+ this.getModel()+"이며, 최고 "+this.getMaxSpeed()+"의 속도를 자랑합니다.");

	}


	public void test() {
		Exercise06 car1 = new Exercise06();

		car1.setCompany("현대차");
		car1.setCompany("삼성");
		car1.setColor("white");
		car1.setModel("제네시스");
		car1.setModel("SM5");
		car1.setMaxSpeed(-1);
		car1.setMaxSpeed(240);
		System.out.println(car1);
	}

	public static void main(String[] args) {
		Exercise06 test = new Exercise06();
		test.test();
	}
}
