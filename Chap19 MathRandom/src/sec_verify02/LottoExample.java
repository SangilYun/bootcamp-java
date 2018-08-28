package sec_verify02;

import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		System.out.println("선택 번호 : ");
		for(int i=0; i<6; i++)
			System.out.print((int)(Math.random()*100)+1+" ");
		
		System.out.println();
		System.out.println("당첨 번호 : ");
		Random ran = new Random(1);
		for(int i=0; i<6; i++)
			System.out.print(Math.abs(ran.nextInt()%100) + " ");
	}

}
