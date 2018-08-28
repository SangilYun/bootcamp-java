package sec02_verify;
import java.util.Scanner;
public class problem8 {

	public static void main(String[] args) {
		int num ;
		
		System.out.println("하나의 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		if(num%2==0 && num%3==0)
			System.out.println(num+"는 2와 3의 배수입니다.");
		
		else
			System.out.println(num+"는 2와 3의 배수가 아닙니다.");


		scan.close();
	}

}
