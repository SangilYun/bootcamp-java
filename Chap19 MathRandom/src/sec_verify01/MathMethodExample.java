package sec_verify01;

import java.util.Random;

public class MathMethodExample {

	public static void main(String[] args) {
		 double number = -2.78987434;
		 System.out.println("number의 절대 값 : " + Math.abs((number)));
		 System.out.println("number의 올림 값 : " + Math.ceil((number)));
		 System.out.println("number의 내림 값 : " + Math.floor((number)));
		 System.out.println("9.0의 제곱근 : " + Math.pow(9.0, 2));
		 System.out.println("PI의 가까운 정수 : " + Math.rint(Math.PI));
		 System.out.print("이번주 행운의 로또 번호는 :");
		 Random ran = new Random();
		 for(int i=0; i<6; i++) {
			 System.out.print(Math.abs(ran.nextInt())%100+" ");
		 }
	}

}
