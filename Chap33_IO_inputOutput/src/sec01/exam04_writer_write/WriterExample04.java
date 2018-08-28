package sec01.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample04 {

	public static void main(String[] args) throws Exception{
		 
		Writer writer = new FileWriter("/Users/yunsangil/Desktop/test.txt");
		String str = "hello";
		
		//매개변수가 String 
		writer.write(str);
		
		writer.flush();
		writer.close();
	}
}
