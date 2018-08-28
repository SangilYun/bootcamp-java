package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample02 {

	public static void main(String[] args) throws Exception{
		 //Reader의 하위클래스인 FileReader를 생성해 대입.
		Reader reader = new FileReader("/Users/yunsangil/Desktop/test.txt");
		int readData;
		char[] cbuf = new char[2]; //길이가 2이다. 
		String data = "";

		//아래와 같이 StringBuilder클래스를 사용해도 된다. 
		//StringBuilder sb = new StringBuilder();
		
		//read()의 매개타입이 문자 배열이다.
		while((readData = reader.read(cbuf)) != -1) {
			//sb.append(cbuf);
			data += new String(cbuf,0,readData); //읽은 문자를 문자열로 생성 
			System.out.println("읽은 문자 수 : " + readData);
		}
		System.out.println(data); //문자열 출력
//		System.out.println(sb); //문자열 출력 
		reader.close(); //자원 해제 
	}

}
