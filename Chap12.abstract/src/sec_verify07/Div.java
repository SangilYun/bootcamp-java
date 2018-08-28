package sec_verify07;

public class Div extends Calc {

	@Override
	public double calculate() {
		System.out.println(this.a + " / " + this.b);
		return a/b;
	}
}
