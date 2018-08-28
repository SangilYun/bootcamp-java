package sec_verify07;

import java.util.Stack;

public class StackEx {
	
	public static Stack<String> back = new Stack<>();
	public static Stack<String> forward = new Stack<>();

	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면은 \'" + back.peek()+"\' 입니다.\n");
	}
	public static void goURL(String url) {
		back.push(url);
		forward.clear();
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();
	}
	public static void goForward() {
		System.out.println("= 앞으로 버튼을 누룬 후 =");
		back.push(forward.pop());
		printStatus();
	}
	public static void goBack() {
		System.out.println("= 뒤로가기 버튼을 누룬 후 =");
		forward.push(back.pop());
		printStatus();
	}
	public static void main(String[] args) {
		
		StackEx.back.push("1.네이트");
		StackEx.back.push("2.야후");
		StackEx.back.push("3.네이버");
		StackEx.back.push("4.다음");
		
		StackEx.goBack();
		StackEx.goBack();
		StackEx.goForward();
		StackEx.goURL("digit.com");
		
	}

}
