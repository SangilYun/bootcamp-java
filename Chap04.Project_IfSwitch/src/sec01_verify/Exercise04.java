package sec01_verify;
import java.util.Scanner;

public class Exercise04 {

//	private static DecimalFormat df1 = new DecimalFormat(".#");

	public static void main(String[] args) {
		int tot=0;
		int subject1=0;
		int subject2=0;
		int subject3=0;
		double avg = 0.0;
		char grade;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("세과목 점수를 입력하시오.");
		subject1 = scan.nextInt();
		subject2 = scan.nextInt();
		subject3 = scan.nextInt();
		
		tot = subject1+subject2+subject3;
		avg = Math.round((tot/3.0)*10)/10.0;
		if(avg>=90) {
			grade = 'A';
		}
		else if(avg<90 && avg>=80) {
			grade = 'B';
		}
		else if(avg<80 && avg>=70) {
			grade = 'C';
		}
		else if(avg<70 && avg>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("당신의 평균 : " + avg + ", "+ "당신의 학점 : "+ grade);
		scan.close();

	}

}
