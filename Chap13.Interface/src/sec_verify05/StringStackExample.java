package sec_verify05;

import java.util.Scanner;

public class StringStackExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringStack stack = new StringStack(5);
		
		for(int i=0 ; i<stack.length(); i++) {
			System.out.println("저장하고 싶은 문장을 입력하세요");
			stack.push(scan.nextLine());
			System.out.println();
		}

		for(int i=0; i<stack.length(); i++) {
			System.out.println(i+1+"번째 스택에 저장된 문장을 출력합니다.");
			System.out.println(stack.pop());
		}

		scan.close();
	}

}
