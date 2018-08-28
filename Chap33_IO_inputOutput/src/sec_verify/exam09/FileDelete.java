package sec_verify.exam09;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		
		String path = "/Users/yunsangil/Downloads";
		String[] fileName;
		File f = new File(path);
		for(File each : f.listFiles()) {
			if(each.isFile()) {
				fileName = (each.getName()).split("\\.");
				if(fileName[fileName.length-1].equals("txt")) {
//					each.delete();
					System.out.println(each.getPath() + " 삭제 ");
				}
			}
		}
	}
}
