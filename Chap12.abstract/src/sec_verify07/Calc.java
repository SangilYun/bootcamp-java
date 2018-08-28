package sec_verify07;

public abstract class Calc {
	
	double a;
	double b;

	public void setValue(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	abstract double calculate();
}
