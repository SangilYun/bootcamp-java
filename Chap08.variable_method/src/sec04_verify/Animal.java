package sec04_verify;

public class Animal {

	String name;
	int age;
	
	Animal(){
		
	}
	
	Animal(String name){
		this.name = name;
	}
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이 동물의 이름은 "+this.name +"이며 , 나이는 "+this.age+"입니다.";
	}
	public static void main(String[] args) {
		Animal test1 = new Animal();
		Animal test2 = new Animal("사자");
		Animal test3 = new Animal("호랑이",5);
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
	}

}