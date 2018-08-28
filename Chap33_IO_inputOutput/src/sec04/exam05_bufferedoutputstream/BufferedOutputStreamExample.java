package sec04.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception{
		 FileInputStream fis = null;
		 FileOutputStream fos = null;
		 BufferedInputStream bis = null;
		 BufferedOutputStream bos = null;
		 
		 int data =0;
		 long start =0;
		 long end =0;
		 
		 //주 입력스트림을 FileInputStream으로 설정 후 BufferedInputStream보조스트림을 연결하였다.
		 fis = new FileInputStream("/Users/yunsangil/Downloads/화면구현_학습모듈.pdf");
		 bis = new BufferedInputStream(fis);
//		 fos = new FileOutputStream("");
		 
		 start = System.currentTimeMillis(); //읽어오기 전 시간 저장 
		 
		 while((data=bis.read())!=-1) {
//			 fos.write(data);
		 }
//		 fos.flush();
		 end = System.currentTimeMillis();
		 
//		 fos.close();
		 bis.close();
		 fis.close();
		 
		 System.out.println("BufferedOutputStream 사용하지 않았을 때 : " + (end-start)+"ms");
		 System.out.println();
		 
		 fis = new FileInputStream("/Users/yunsangil/Downloads/화면구현_학습모듈.pdf");
		 bis=new BufferedInputStream(fis);
//		 fos=new FileOutputStream("");
//		 bos=new BufferedOutputStream(fos);
		 start=System.currentTimeMillis();
		 
		 while((data=bis.read())!=-1) {
//			 bos.write(data);
		 }
//		 bos.flush();
		 end=System.currentTimeMillis();
		 
//		 bos.close();
//		 fos.close();
		 bis.close();
		 fis.close();
		 System.out.println("BufferedOutputStream 사용했을 때 : " + (end-start)+"ms");
	}

}
