package sec02_exam_method;

public class StringToLowerUpperExample {

	public static void main(String[] args) {
		 String str1 = "Java Programming";
		 String str2 = "JAva Programming";
		 
		 System.out.println(str1.equalsIgnoreCase(str2));//자바는 대소문자 상관없이 비교.
		 
		 System.out.println(str1.equals(str2)); //false가 리턴된다. 왜? Java랑 JAva
		 String lowerStr1 = str1.toLowerCase();
		 String lowerStr2 = str2.toLowerCase();

		 System.out.println(lowerStr1.equals(lowerStr2)); //true나오는 이유?

	}

}
