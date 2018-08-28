package sec02_exam_method;

public class StringCharAtExample {

	public static void main(String[] args) {
		
		String ssn = "781125-1985421";
		//특정문자를 받고 싶을 때
		char sex = ssn.charAt(7);
		
		switch(sex) {
			case '1' :
			case '3' :
				System.out.println("남자입니다");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}
}