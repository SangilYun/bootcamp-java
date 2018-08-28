package sec_verify10;

import java.util.Scanner;

public class GugudanThread implements Runnable {

	Scanner scan = new Scanner(System.in);
	int input;
	@Override
	public void run() {
		System.out.println("원하는 구구단 수를 입력하세요");
		input = scan.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(input+ " * " +i +" = " + input*i);
		}	
	}
}
