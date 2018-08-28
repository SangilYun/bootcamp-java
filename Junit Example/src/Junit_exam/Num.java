package Junit_exam;

public class Num {

	private int value;
	public Num(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int addValue(int value) {
		return this.value+value;
	}
}
