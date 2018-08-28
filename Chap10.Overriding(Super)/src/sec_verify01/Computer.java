package sec_verify01;

public class Computer extends Calculator {

	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r*r;
	}
	public static void main(String[] args) {
		Computer computer = new Computer();
		Calculator calculator = new Calculator();
		System.out.println("구하고자하는 원의 반지을 입력하세요");
		int r =10;
		System.out.println(r);
		System.out.println("원면적은 " + calculator.areaCircle(r));
		System.out.println("원면적은 " + computer.areaCircle(r));
	}

}
