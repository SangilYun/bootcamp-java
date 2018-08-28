package sec02_exam_method;

public class StringTrimExample {

	public static void main(String[] args) {
		 //trim()은 문자열을 기준으로 좌우의 공백만 없앤다. 따라서 문자열 중간에
		 //있는 공백은 직접 찾아서 없애주는 코드를 만들어야 한다.
		String tel1 = "    02";
		String tel2 = "123   ";
		String tel3 = "    12 02     ";
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
		

	}

}
