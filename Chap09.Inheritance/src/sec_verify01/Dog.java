package sec_verify01;

public class Dog {

	String name;
	int weight;
	
	int getWeight() {
		return this.weight;
	}
	
	void move() {
		this.name = "누렁이";
		this.weight = 10;
		System.out.println("강아지의 이름은 " + this.name + "이고, 몸무게는 " + this.getWeight() + "kg 입니다."); 
	}
	
}
