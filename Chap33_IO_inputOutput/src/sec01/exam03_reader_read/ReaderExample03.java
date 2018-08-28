package sec01.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample03 {

	public static void main(String[] args) throws Exception{
		 //Reader의 하위클래스인 Filereader를 생성하여 대입 
		Reader reader = new FileReader("/Users/yunsangil/Desktop/test.txt");
		char[] cbuf = new char[4]; //길이가 4이다. 
		
		//파일의 1인덱스 위치에서 2문자만 읽어서 저장함 
		int readData = reader.read(cbuf,1,2);
		
		System.out.println("읽은 문자 수 : " + readData);
		//출력결과는 0인덱스는 그냥 공백이 나오며, 1, 2인덱스에 있는 것만 
		//읽는 것을 알 수가 있다. 
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(i+"번째 문자 :" + cbuf[i]);
		}
		reader.close();
	}
}
