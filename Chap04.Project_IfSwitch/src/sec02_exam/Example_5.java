package sec02_exam;
import java.util.Scanner;

public class Example_5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		String inputString = null;
		
		//do-while문은 최소 한번은 무조건 실행한다. 이유는 조건이 뒤에 있기 때문이다.
		//while과의 차이점
		do {
			System.out.print(">");
			//Scanner 클래스의 nextline()은 엔터칠때까지 공백포함하여 string으로 리턴
			//next()는 공백만날 때 까지만 리턴
			inputString = scanner.nextLine().trim(); //trim은 space 제거
			System.out.println(inputString);
		}while(!inputString.equals("q")); //q를 입력하면 조건이 false이므로 루프 빠져나간다.
		
		System.out.println();
		System.out.println("프로그램 종료");
		scanner.close();
	
		
	}

}
