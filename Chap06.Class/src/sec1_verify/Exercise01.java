package sec1_verify;

import java.util.Scanner;

public class Exercise01 {

	private String company = "현대자동차";
	private String model = "그랜저"; 
	private String color = "검정";
	private int maxSpeed;
	private int currSpeed;
	private int modifiedSpeed; 
	
	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}


	public int getCurrSpeed() {
		return currSpeed;
	}


	public int getModifiedSpeed() {
		return modifiedSpeed;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setCurrSpeed(int currSpeed) {
		this.currSpeed = currSpeed;
	}

	public void setModifiedSpeed(int modifiedSpeed) {
		this.modifiedSpeed = modifiedSpeed;
	}


	@Override
	public String toString() {
		return ("제작회사: "+this.getCompany()+"\n모델명: "+this.getModel()
			+"\n색깔: "+this.getColor()+"\n최고속도: "+this.getMaxSpeed() 
			+"\n현재속도: "+this.getCurrSpeed()+"\n수정된 속도: "+this.getModifiedSpeed());
	}
	public void test(){
		String strInput;
		int intInput;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제작회사 ?");
		strInput = scan.next();
		this.setCompany(strInput);
		
		System.out.println("모델명 ?");
		strInput = scan.next();
		this.setModel(strInput);
		
		System.out.println("색깔 ?");
		strInput = scan.next();
		this.setColor(strInput);
		
		System.out.println("최고속도 ?");
		intInput = scan.nextInt();
		this.setMaxSpeed(intInput);
		
		System.out.println("현재속도 ?");
		intInput = scan.nextInt();
		this.setCurrSpeed(intInput);
		
		System.out.println("수정된 속도 ?");
		intInput = scan.nextInt();
		this.setModifiedSpeed(intInput);
		
		System.out.println(this);
		scan.close();
	}
	

	public static void main(String[] args) {
		Exercise01 test = new Exercise01();
		test.test();
	}

}
