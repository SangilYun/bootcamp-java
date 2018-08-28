package sec01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		 
		double num = 1234567.89;
		double num1 = 123456788.89;
		//아래 소스를 보고 형식지정자에 따라 값이 변화 되는 것을 보고 적절히 사용하자.
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));	//0을 넣으면 값이 없으면 0을 찍고 #은 값이 없으면 
											//아무것도 찍히지 않는다.
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
 
		df = new DecimalFormat("######.#########");
		System.out.println(df.format(num));

		df = new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		System.out.println(df.format(num1));

		
	}

}
