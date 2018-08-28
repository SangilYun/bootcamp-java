package sec02_verify;

public class PowerExample {
	
	static long sumPower(int x, int y) {
		long result  =0L;
		long sum =0L;
		for(int i=1; i<=y;i++) {
			result = power(x,i);
			System.out.println(result);
			sum+=result;
		}
		return sum;
	}
		
	static long power(int x, int y) {
			return y==0?  1 :  x*power(x,y-1);
	}
	
	public static void main(String[] args) {
		System.out.println(PowerExample.sumPower(2, 4));
	}
}
