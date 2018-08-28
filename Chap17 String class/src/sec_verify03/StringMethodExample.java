package sec_verify03;

public class StringMethodExample {

	public static void main(String[] args) {
		String input = "Shin seo youn";
		System.out.println("문자열 입력 ==> " + input);
		System.out.println("입력 문자열의 s와 S를 $으로 변환합니다.");
		String lowercase = input.toLowerCase();
		lowercase.replace('s', '$');
		System.out.println("출력 문자열 ==> "+ lowercase.replace('s', '$'));

	}

}
