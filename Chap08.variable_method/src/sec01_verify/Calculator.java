package sec01_verify;

public class Calculator {
	
	void powerOn() {
		System.out.println("계산기 전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("계산기 전원을 끕니다.");
	}
	
	static int plus(int x, int y) {
		return x+y;
	} 
	
	static double divide(double x, double y) {
		return x/y;
	}
	
	static void test() {
		Calculator cal = new Calculator();
		cal.powerOn();
		System.out.println("result : " + Calculator.plus(6,5));
		System.out.println("result : " + Calculator.divide(5,2));
		cal.powerOff();
	}

}
