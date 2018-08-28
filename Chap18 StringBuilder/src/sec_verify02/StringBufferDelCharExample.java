package sec_verify02;

public class StringBufferDelCharExample {

	public static void main(String[] args) {
		System.out.println("(나는!자바를@사랑^^합니다.)"+" -> " + delChar("(나는! 자바를@ 사랑^^합니다.)","(!@^)"));
		System.out.println("(1 2 3 4\t5)"+" -> " + delChar("(1 2 3 4\t5)"," \t"));
		System.out.println(("122334").replaceAll("1|2",String.valueOf(Character.MIN_VALUE)));
		System.out.println("test : "+Character.MIN_VALUE);
	}
	
	public static String delChar(String src, String delCh) {
		for(int i=0; i<delCh.length(); i++) {
			src = src.replace(delCh.charAt(i), Character.MIN_VALUE);
		}
		return src;
	}

}
