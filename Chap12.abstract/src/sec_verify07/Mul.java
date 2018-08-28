package sec_verify07;

public class Mul extends Calc{
	
	@Override
	public double calculate() {
		System.out.println(this.a + " x " + this.b);
		return a*b;
	}

}
