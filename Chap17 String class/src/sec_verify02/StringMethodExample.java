package sec_verify02;

public class StringMethodExample {

	public static void main(String[] args) {
		 String a = new String("    java,");
		 String b = new String("program,fighting      ");
		 String c;
		 
		 c=a+b;
		 System.out.println("문자열 a와 문자열 b를 연결한 결과 : "+ c);
		 c=a.trim()+b.trim();
		 System.out.println("문자열 a의 공백을 제거한 결과 : "+ c);
		 c = (a+b).replace('a', '1').trim();
		 System.out.println("문자열 a의 a를 1로 대치한 결과 : "+ c);
		 String[] arr = c.split(",");
		 for(int i=0; i<arr.length; i++) {
			 System.out.println("분리된 "+i+"번 문자열 : "+ arr[i]);
		 }
		 int idx = c.indexOf("1",2);
		 c=c.substring(idx);
		 System.out.println("문자열 a의 substring한 결과 : "+c);
		 char d = c.charAt(2);
		 System.out.println("문자열 a의 2번째 문자를 char c에 대입한 결과 : " + d);



	}

}
