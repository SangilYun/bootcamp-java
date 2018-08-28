package sec_verify05;

import java.util.Scanner;

public class ExecuteThread extends Thread{

	private boolean stop;
	int i =1;
	Scanner scan; 
	
	public void setStop(boolean b) {
		stop=b;
		scan = new Scanner(System.in);
	}
	
	@Override
	public void run() {
		while(!stop) {
			try {
				System.out.println("몇 초후 종료할 까요?");
				int input = scan.nextInt();
				for(int j=0; j<input; j++) {
					Thread.sleep(1000);
					System.out.println("실행 중 >> i값 변화 : " + i);
					i++;
				}
				stop = true;
			} catch (InterruptedException e) {}		
		}
		System.out.println("실행종료");
	}
}
