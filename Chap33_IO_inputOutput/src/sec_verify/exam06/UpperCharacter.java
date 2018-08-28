package sec_verify.exam06;

import java.io.FileReader;
import java.io.FileWriter;

public class UpperCharacter {
	public static void main(String[] args) throws Exception{
		String addr = "/Users/yunsangil/Downloads/test.txt";
		FileWriter fw = new FileWriter(addr);
		fw.write("this is java programming.\n" + 
				"저는 java study 중입니다.");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(addr);
		int read;
		while((read = fr.read()) != -1) {
			System.out.print(Character.toUpperCase((char)read));
		}
		fr.close();
	}
}
