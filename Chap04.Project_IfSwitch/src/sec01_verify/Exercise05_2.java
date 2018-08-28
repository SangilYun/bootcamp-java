package sec01_verify;
import java.util.Scanner;

public class Exercise05_2 {

	public static void main(String[] args) {
		char gender;
		String regNo;
		
		System.out.println("당신의 주민번호를 입력하세요.(011231-1111222)");
		Scanner scan = new Scanner(System.in);
		regNo = scan.nextLine();
		
		if (regNo.length()==14 && regNo.charAt(6)=='-') {
			if(regNo.charAt(0)=='0') {
			 	gender = (regNo.charAt(7) == '1') ? '남' : '여';
				System.out.println("당신은 2000년 이후에 출생한 "+gender+"자입니다.");
			}
			else{
				gender = (regNo.charAt(7) == '1') ? '남' : '여';
				System.out.println("당신은 2000년 이전에 출생한 "+gender+"자입니다.");
			}
		}
		else {
			System.out.println("잘 못 입력하셨습니다.");

		}
		
	
		/*if (regNo.length()==14 && regNo.charAt(6)=='-') {
			switch(regNo.charAt(0)) {
			case '0':
				gender = regNo.charAt(7) == '1' ? '남' : '여'; 
				System.out.println("당신은 2000년 이후에 출생한 "+gender+"자입니다.");
				break;
			default:
				gender = regNo.charAt(7) == '1' ? '남' : '여'; 
				System.out.println("당신은 2000년 이전에 출생한 "+gender+"자입니다.");
				break;
			}
		}
		else {
			System.out.println("잘 못 입력하셨습니다.");
		}*/
		scan.close();
	}
}

