package sec01_exam_constructor;

public class ByteToExample {

	public static void main(String[] args) {
		//10개의 키코드(문자코드) 값이 저장되어 있는 byte배열
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		//위에 있는 byte배열을 str로 디코딩
		String str = new String(bytes);
		System.out.println(str);
	}

}
