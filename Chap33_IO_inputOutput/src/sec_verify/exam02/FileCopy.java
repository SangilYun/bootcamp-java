package sec_verify.exam02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		 FileReader fr = new FileReader("/Users/yunsangil/Desktop/test.txt");
		 Writer writer = new FileWriter("/Users/yunsangil/Desktop/test_복사본.txt");
		 int read;
		 
		 while((read = fr.read()) !=-1) {
			 writer.write(read);
		 }
		 
		 fr.close();
		 writer.flush();
		 writer.close();
	}

}
