package sec01_verify;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		int input =0;
		int salary =0;
		String position = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("직급은 아래와 같습니다. \n"
				+ "1.상무\n2.부장\n3.차장\n"
				+ "4.과장\n5.대리\n6.사원\n알고싶은 월급 중 해당직급을 입력하세요.");
		input = scan.nextInt();
		
		/*if(input == 1) {
			position ="상무";
			salary = 1000;
		}
		else if(input == 2) {
			position ="부장";
			salary = 800;
		}
		else if(input == 3) {
			position ="차장";
			salary = 600;
		}
		else if(input == 4) {
			position ="과장";
			salary = 400;
		}
		else if(input == 5) {
			position ="대리";
			salary = 250;
		}
		else if(input == 6) {
			position ="사원";
			salary = 180;
		}*/
		
		switch(input) {
		case 1:
			position ="상무";
			salary = 1000;
			break;
		case 2:
			position ="부장";
			salary = 800;
			break;
		case 3:
			position ="차장";
			salary = 600;
			break;
		case 4:
			position ="과장";
			salary = 400;
			break;
		case 5:
			position ="대리";
			salary = 250;
			break;
		case 6:
			position ="사원";
			salary = 180;
		}
		System.out.println((position != null) ? 
				position +"직급은 "+ salary +"만원/월 입니다" : "올바른 값을 입력해 주세요.");
		
		scan.close();

	}

}
