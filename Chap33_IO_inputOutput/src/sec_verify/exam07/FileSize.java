package sec_verify.exam07;

import java.io.File;

public class FileSize {

	public static void main(String[] args) throws Exception{
		 File fr = new File("/Users/yunsangil/Downloads");
		 File max= new File("");
		 for(File f : fr.listFiles()) {
			 if(f.isFile()) {
				 if(max.length() < f.length()) {
					 max = f;
				 }
			 }
		 }
		 System.out.println(max.getName() +", "+max.length());
	}
}
