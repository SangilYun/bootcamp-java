package sec_verify11;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class SumThread implements Callable<Integer>{

	Scanner scan = new Scanner(System.in);
	@Override
	public Integer call() throws Exception {
		int sum=0;
		System.out.println("두 정수를 입력하세요\n첫번째 : ");
		int input1 = scan.nextInt();
		System.out.println("두번째 : ");
		int input2 = scan.nextInt();
		
		for(int i=input1; i<=input2;i++) {
			sum+= i;
		}
		System.out.print("[작업처리 결과] : ");
		return sum;
	}
}
