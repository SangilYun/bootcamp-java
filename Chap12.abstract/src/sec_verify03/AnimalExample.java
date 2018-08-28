package sec_verify03;

public class AnimalExample {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Tree_Sparrow sparrow = new Tree_Sparrow();
		
		System.out.println("---------------------------------------------");
		cat.breathe();
		cat.sound();
		System.out.println("---------------------------------------------");
		dog.breathe();
		dog.sound();
		System.out.println("---------------------------------------------");
		sparrow.breathe();
		sparrow.sound();
		
	}

}
