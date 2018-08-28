package sec01_verify;
import java.util.Scanner;
public class Exercise16 {

	public static void main(String[] args) {
		String input;
		Scanner scan = new Scanner(System.in);
		char[] pwd =new char[] {'c','o','d','e'};
		
		while(true) {
			System.out.println("암호 4자리 입력 : ");
			input = scan.nextLine();
			if(input.length()==4 && pwd[0]==input.charAt(0)
					&&pwd[1]==input.charAt(1) //비밀번호 확인
					&&pwd[2]==input.charAt(2)&&pwd[3]==input.charAt(3)) {
					System.out.println("프로그램 종료");
					break;
			}else { 	//틀릴경우
				System.out.println("다시시도");
			}		
		}
		scan.close();
	}
}
