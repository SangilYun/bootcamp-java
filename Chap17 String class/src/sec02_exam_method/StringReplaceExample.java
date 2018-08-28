package sec02_exam_method;

public class StringReplaceExample {

	public static void main(String[] args) {
		 
		//2개의 String 인스턴스가 생성되는 것을 기억하도록 하자.
		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 제공합니다. ";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
