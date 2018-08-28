package sec02_verify;
import java.util.Scanner;
public class problem8_1 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.println("첫번째 수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		System.out.println("두번째 수를 입력하시오 : ");
		num2 = scan.nextInt();
		
		System.out.println(num1+"과 " +num2+"에서 3과 4의 배수를 제외한 결과");
		for (int i=num1; i<=num2; i++) {
			if (i%3!=0 && i%4!=0) {
				System.out.println(i);
			}
		}

		scan.close();
	}

}
