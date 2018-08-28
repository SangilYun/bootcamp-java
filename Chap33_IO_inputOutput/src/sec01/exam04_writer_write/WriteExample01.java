package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample01 {

	public static void main(String[] args) throws Exception{
		 
		Writer writer = new FileWriter("/Users/yunsangil/Desktop/test.txt");
		char[] data = "홍길동".toCharArray(); //문자열을 문자배열로 리턴 
		
		for(int i=0; i<data.length; i++) {
			//write()를 호출하고 예외가 발생하지 않았다면, 정상적으로 실행이 된 것이다. 
			writer.write(data[i]);
			System.out.println("루핑 수 : " + i); //총 3번 루핑한다. 
		}
		writer.flush();
		writer.close();

	}

}
