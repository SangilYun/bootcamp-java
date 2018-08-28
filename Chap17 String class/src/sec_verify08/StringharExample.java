package sec_verify08;


public class StringharExample {

	public static void main(String[] args) {
		 System.out.println("문자열을 대문자는 소문자로 소문자는 대문자로 변경합니다.");
		 String input = "즐거운 Java Progrmming 1234";
		 System.out.println("문자열을 입력하세요 : " + input);
		 char[] arr = input.toCharArray();
		 for(int i=0; i<input.length();i++) {
			 if(Character.isLowerCase(arr[i])) {
				 arr[i]=Character.toUpperCase(arr[i]);
			 }
			 else {
				 arr[i]=Character.toLowerCase(arr[i]);
			 }
		 }
		
		 System.out.println("변환된 문자열 ==>" + String.valueOf(arr));
		 

	}

}
