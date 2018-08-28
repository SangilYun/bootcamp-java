package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample {

	public static void main(String[] args) {
		 System.out.println("문장을 입력하세요. 입력하신 문장은 한 공백으로 분리되어 출력됩니다. "
		 		+ "\n 종료를 원하시면 exit을 입력하시면 됩니다.");
		 Scanner scan = new Scanner(System.in);
		 
		while(true) {
			System.out.println("입력 : ");
			String input = scan.nextLine();
			if(input.equals("exit")) break;
			StringTokenizer st = new StringTokenizer(input);
			System.out.println("낱말의 개수는 " + input.length());
			for(int i=1; st.hasMoreTokens(); i++) {
				System.out.println("분리된 ["+i +"]번째 낱말 : " + st.nextToken());
			}
		}
		scan.close();
	}
}
