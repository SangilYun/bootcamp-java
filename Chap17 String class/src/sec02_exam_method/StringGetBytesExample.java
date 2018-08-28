package sec02_exam_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		 String str = "안녕하세요";
		 
		 //인코딩(컴퓨터가 알아보기 쉽게 변환하는 과정)
		 byte[] bytes1 = str.getBytes();
		 System.out.println("bytes1.length : " + bytes1.length); //10바이트가 나온다. 이유는?
		 
		 //디코딩(사람이 알아보기 쉽게 변환하는 과정)
		 String str1 = new String(bytes1);
		 System.out.println("바이트 -> 문자열 : " + str1);

		 try {
			 //문자셋의 종류를 잘 선택하고 맞춰야 파일 송수신이나, 파일입출력할때 깨짐 현상이 없다.
			 byte[] bytes2 = str.getBytes("EUC-KR");
			 System.out.println("bytes2.length : " + bytes2.length); //10바이트 이유는?
			 
			 String str2 = new String(bytes2,"UTF-8");
			 System.out.println("바이트 -> 문자열 : " + str2); //10바이트 이유는?
			 
			 byte[] bytes3 = str.getBytes("UTF-8");
			 System.out.println("bytes3.length : " + bytes3.length); //15바이트 이유는? utf-8
			 
			 String str3 = new String(bytes3, "UTF-8"); //UTF-8문자셋은 한글 한자를 3byte로 취급.
			 System.out.println("바이트 -> 문자열 : " + str3);
		 }
		 catch(UnsupportedEncodingException e) {e.printStackTrace();}
	}

}
