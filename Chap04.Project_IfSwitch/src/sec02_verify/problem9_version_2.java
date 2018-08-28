package sec02_verify;
import java.util.Scanner;
public class problem9_version_2 {

	public static void main(String[] args) {
		int total=0;
//		String input =null;
		Scanner scan = new Scanner(System.in);

		while(true) {
		System.out.println("상품금액 입력: ");
		if(scan.hasNextInt())
			total += scan.nextInt();
		else
			break;
		}	
		System.out.println("구매하신 상품들의 총 가격은 " +total+"입니다.");
		scan.close();
	}

}
