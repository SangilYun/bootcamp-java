package sec02_verify;

import java.util.Scanner;

public class Exercise11_1 {

	public static void main(String[] args) {
	
		int input;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("input : ");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
        System.out.print("Fibonacci Series of "+input+ " : ");

        while(num1 < input)
        {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
       scan.close();
    }
}
		