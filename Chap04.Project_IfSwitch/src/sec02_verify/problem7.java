package sec02_verify;
import java.util.Scanner;
public class problem7 {

	public static void main(String[] args) {
		int num ;
		
		System.out.println("당신이 원하는 단은?");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		for (int i=1; i<10; i++) {
			System.out.println(num +" * "+ i +" = " + num*i);
		}

		scan.close();
	}

}
