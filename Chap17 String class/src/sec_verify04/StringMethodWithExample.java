package sec_verify04;

public class StringMethodWithExample {

	public static void main(String[] args) {
		String input = "나는 자바를 공부합니다.";
		System.out.println("문자열 입력 ==> " + input);
		System.out.println("입력 문자열의 시작과 끝이 각각 '(' ')'이 아니면, '(' ')'붙여 출력합니다. ");
		if(!input.startsWith("(")) {
			input = "("+input;
		}
		if(!input.endsWith("(")) {
			input+=")";
		}

		System.out.println("출력 문자열 ==> " + input);
	}

}
