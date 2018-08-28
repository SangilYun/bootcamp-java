package sec_verify07;

public class StringReverseExample {

	 public static String reverseString(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        //Calling Function Recursively
	        return reverseString(str.substring(1)) + str.charAt(0);
	    }
	
	public static void main(String[] args) {
		StringBuilder input = new StringBuilder("나는 자바를 사랑합니다.");
		System.out.println("문자열을 입력하세요 : " + input);

		System.out.println("내용을 거꾸로 출력 : " + input.reverse()); //방법 1
		System.out.println("내용을 거꾸로 출력 : " + reverseString("나는 자바를 사랑합니다.")); //방법 2
		
	}

}
