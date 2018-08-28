package sec02_exam_method;

public class StringValeuOfExample {

	public static void main(String[] args) {
		 //valueOf()는 UI프로그램에서 자주 쓰이는 메서드이다.
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		//"true"로 출력되는 것에 주목.
		System.out.println(str3);

	}

}
