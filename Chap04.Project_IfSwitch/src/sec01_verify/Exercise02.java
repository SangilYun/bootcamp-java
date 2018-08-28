package sec01_verify;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		int month;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하시오.");
		month = scan.nextInt();
		
		if (month == 12 || (month >=1 && month <=2)) {
			System.out.println(month+"월은 winter 입니다.");
		}
		else if(month >=3 && month <=5) {
			System.out.println(month+"월은 spring 입니다.");
		}
		else if(month >=6 && month <=8) {
			System.out.println(month+"월은 summer 입니다.");
		}
		else if(month >=9 && month <12) {
			System.out.println(month+"월은 autumn 입니다.");
		}
		else
			System.out.print("1~12사이 숫자를 입력해 주세요.\nTry again");
		
		scan.close();
	
		
		/* switch version
		int month;
		System.out.println("월을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2: System.out.println(month+"월은 winter 입니다.");
				break;
		case 3: 
		case 4:
		case 5: System.out.println(month+"월은 spring 입니다.");
				break;
		case 6:
		case 7:
		case 8: System.out.println(month+"월은 summer 입니다.");
				break;	
		case 9:
		case 10:
		case 11: System.out.println(month+"월은 autumn 입니다.");
				 break;	
		default :
			System.out.print("1~12사이 숫자를 입력해 주세요.\nTry again");
			
		}
		scan.close();*/
		
	}

}
