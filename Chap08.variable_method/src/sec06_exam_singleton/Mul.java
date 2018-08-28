package sec06_exam_singleton;

public class Mul {

	private int firstNum;
	private int secondNum;
		
	void setValue(int a, int b) {
		this.firstNum = a;
		this.secondNum = b;
	}
	
	int calculate() {
		return firstNum*secondNum;
	}
	
	
}
