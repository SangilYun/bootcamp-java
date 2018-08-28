package sec02_verify;
import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		while(true) {
			int attempt=0;
			int input=0;
			int num=0;
			
			Scanner scan = new Scanner(System.in);
			num = (int)(Math.random()*100); // create random number 0~99
			System.out.println(num);
			System.out.println("random number has been decided.");
		
			while(true) {
			System.out.println("0-99");
			
			input =scan.nextInt();
			attempt ++;
			if(input <0 || input >99) { //when the input is invalid
				System.out.println("invalid input!");
			}
			else if(input > num) { //when the input is higher than the number
				System.out.println("lower");
			}
			else if(input < num) { // when the input is lower than the number
				System.out.println("higher");
			}
			else if(input == num) { // when the number is found
				System.out.println("Correct!");
				System.out.println("attempt : "+ attempt);
				break;
			}
			
		} 			
		System.out.println("wanna try one more time?(y/n)");
		if(scan.next().equals("n"))
			break;
		scan.close();
	}	}
}
