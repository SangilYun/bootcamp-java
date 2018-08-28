package sec_verify06;

public class MathRoundExample {

	public static double round(double d , int n) {
		d = d*Math.pow(10, n-1);
		d = Math.round(d);
		d /= Math.pow(10, n-1);
		return d;
	}
	public static void main(String[] args) {
		 System.out.println("자바에서 제공하는 Math.round(3.17836)를 한 결과 " + Math.round(3.17836));
		 
		 System.out.println("직접 만든 round()를 사용한 결과 " + round(3.17836,2));
		 System.out.println("직접 만든 round()를 사용한 결과 " + round(3.17836,3));
		 System.out.println("직접 만든 round()를 사용한 결과 " + round(3.17836,4));
		 System.out.println("직접 만든 round()를 사용한 결과 " + round(3.17836,5));


		 
		 
		 

	}

}
