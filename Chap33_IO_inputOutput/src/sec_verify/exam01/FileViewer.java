package sec_verify.exam01;

import java.io.FileReader;

public class FileViewer {

	public static void main(String[] args) throws Exception{
		 
		FileReader fr = new FileReader("/Users/yunsangil/Desktop/test.txt");
		int read;
		
		while((read = fr.read()) != -1) {
			System.out.print((char)read);
		}
		fr.close();
	}
}
