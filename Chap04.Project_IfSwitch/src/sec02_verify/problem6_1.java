package sec02_verify;
import java.util.Scanner;
public class problem6_1 {

	public static void main(String[] args) {
//		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(keyCode!=3) {
		System.out.println("-------------------");
		System.out.println("1. 증속 | 2.감속 | 3.중지");
		System.out.println("-------------------");
		System.out.println("선택 : ");
		
		
		keyCode = scan.nextInt();
		if (keyCode==1) 
			speed += 1;
		else if (keyCode==2)
			speed-=1;
		else {
			keyCode=3;
			break;
		}
		System.out.println("현재속도 = "+ speed);	
		}
		
		System.out.println("프로그램 종료");
		scan.close();
		
	}

}
