package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample02 {

	public static void main(String[] args) throws Exception{
		 Writer writer = new FileWriter("/Users/yunsangil/Desktop/test.txt");
		 char[] data = "yun".toCharArray(); //문자열을 문자배열로 리턴 
		 
		 //writer()의 매개변수 타입이 문자배열이다. 호출하고 예외가 발생치 않았다면,
		 //정상적으로 실행이 된 것이다. 
		 //이전, 코드보다 문자배열 자체를 매개값으로 보내기 때문에, 훨씬 효율적 
		 writer.write(data);
		 writer.flush();
		 writer.close();

	}

}
