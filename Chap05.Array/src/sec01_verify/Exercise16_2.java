package sec01_verify;
import java.util.Scanner;
public class Exercise16_2 {

	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
		String pwd = "code";
		
		System.out.println("입력 : ");
		
		while(true) {
			input = scan.next();
			if(input.equals(pwd)){
				break;
			}else
			System.out.println("불일치. 다시 시도하세요 :");
		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}
