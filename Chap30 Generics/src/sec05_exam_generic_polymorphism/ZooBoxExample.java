package sec05_exam_generic_polymorphism;

public class ZooBoxExample {

	public static void main(String[] args) {
		 
		ZooBox<Animal> animal = new ZooBox<Animal>();
		
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
//		animal.add(new Bird());	//Bird는 animal을 상속받지 않음.(상위타입 제한함.)
//		animal.add(new Object()); //animal 하위클래스만 가능. 

		System.out.println("Animal 이거나 Animal을 상속받은 값만 출력합니다.");
		System.out.println(animal.toString());
	}

}
