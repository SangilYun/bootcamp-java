package sec_verify05;

public class StringTrimExample {

	public static void main(String[] args) {
		System.out.println("원하는 문장을 입력해보세요 : 저는 경북산전에서 공부하는 학생이에요");
		String input = " 저는 경북산전에서 공부하는 학생이에요";
		System.out.println("공백제거를 한 문자열 : "+input.replaceAll(" ",""));
		

	}

}
