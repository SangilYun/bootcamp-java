package sec04_this;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();					//기본생성자 호출했는데 왜 초기화가 되서 출력이 되나?
		Car c2 = new Car("blue");			//매개변수가 1개인 생성자 호출
		Car c3 = new Car("Green","수동");		//매개변수가 2개인 생성자 호출 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
