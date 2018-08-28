package sec1_verify;

public class Exercise05 {

	public double getValue(int base, int exp) {
		return Math.pow(base, exp);
	}
	
	public void test() {
		System.out.println("2의 3승 : "+ Math.round(getValue(2,3)));
		System.out.printf("3의 4승 : %.0f" , getValue(3,4));
	}
	public static void main(String[] args) {
		Exercise05 test = new Exercise05();
		test.test();
	}
}
