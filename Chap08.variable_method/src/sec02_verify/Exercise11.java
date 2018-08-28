package sec02_verify;

public class Exercise11 {
	int value;
	
	int abs(int value) {
		return Math.abs(value);
	}

	public static void main(String[] args) {
		Exercise11 test = new Exercise11();
		System.out.println("10의 절대값 : " + test.abs(10));
		System.out.println("-95의 절대값 : " + test.abs(-95));

	}

}
