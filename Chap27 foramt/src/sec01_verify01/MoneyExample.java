package sec01_verify01;

import java.text.DecimalFormat;


public class MoneyExample {

	public static void main(String[] args) throws Exception{
		 String data = "123,456,789.5";
		 DecimalFormat df;
		 System.out.println("data : "+ data);
		 
		 DecimalFormat format = new DecimalFormat();
		 double number = (double)format.parse(data);
		 
		 df = new DecimalFormat("0");
		 System.out.println("반올림 : " + df.format(number));
		 df=new DecimalFormat("#,####");
		 System.out.println("만단위 : " + df.format(number));

		 
		 System.out.println();


	}
}
