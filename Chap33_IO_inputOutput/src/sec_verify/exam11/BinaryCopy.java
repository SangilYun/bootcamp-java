package sec_verify.exam11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args) throws Exception{
		String originalFileName = "/Users/yunsangil/Documents/computing/JAVA/Chap33 Input output stream/src/sec_verify/exam11/img.jpg";
		String targetFileName = "/Users/yunsangil/Downloads/img_copy.jpg";
		File file = new File(originalFileName);
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);

		int readByteNo;

		byte[] readBytes = new byte[100];
		
		while((readByteNo = fis.read(readBytes)) !=-1) {
			fos.write(readBytes);  

		}
		fos.flush();  		
		fos.close();
		fis.close();
		System.out.println(file.getName() + "파일의 복사가 완료되었습니다.");
	}
}
