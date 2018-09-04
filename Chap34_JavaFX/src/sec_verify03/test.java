package sec_verify03;

import java.math.BigDecimal;

public class test {

	public static void main(String[] args) {
		Double a = 0.000001;
		System.out.println("a size : "+String.valueOf(a).length());

		BigDecimal x1 = new BigDecimal(10);
		BigDecimal x2 = new BigDecimal(10);
		System.out.println(x1.add(x2));
		System.out.println(x1);
	}

}
