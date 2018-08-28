package sec02_verify;
import java.util.Scanner;
public class problem6 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.println("정수 입력 :");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if (num %3 ==0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}

		scan.close();
	}

}
