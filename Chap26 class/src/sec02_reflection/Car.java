package sec02_reflection;

public class Car {

	private String model;	//인스턴스 맴버변수
	private String owner;
	
	public Car() {}	//오버로딩
	
	public Car(String model, String owner) {
		this.model = model;
		this.owner = owner;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {	//인스턴스 맴버메서드 
		return model;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}
