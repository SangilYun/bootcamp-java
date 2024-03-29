package sec04.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception{
		 long start=0;
		 long end=0;
		 
		 //바이트 기반으로 속도의 차이를 보기 위한 프로그램이다.
		 FileInputStream fis1 = new FileInputStream("/Users/yunsangil/Downloads/젝스키스(세단어).mp3");
		 
		 System.out.println("바이트 기반 읽기 시작");
		 start = System.currentTimeMillis(); //읽기 전 시간 저장
		 while(fis1.read()!=-1) {}
		 
		 System.out.println("바이트 기반 읽기 끝");
		 end=System.currentTimeMillis();//다 읽은 후 저장
		 System.out.println("버퍼를 사용하지 않았을 때(바이트 기반)" + (end-start) + "ms"); 
		 fis1.close();
		 
		 System.out.println();
		 //주입력 스트림 FileInputStream에다가 속도향상 보조스트림인 BufferedInputStream을 연결함.
		 //혹시 잘못 이해할 수 있는데 BufferedInputStream은 보조스트림이기 때문에 파일을 
		 //읽어올 수가 없다.
		 FileInputStream fis2 = new FileInputStream("/Users/yunsangil/Downloads/젝스키스(세단어).mp3");
		 BufferedInputStream bis = new BufferedInputStream(fis2);
		 
		 System.out.println("버퍼 기반 읽기 시작");
		 start = System.currentTimeMillis();
		 
		 while(bis.read()!=-1) {}
		 
		 System.out.println("버퍼 기반 읽기 끝");
		 end=System.currentTimeMillis();
		 
		 System.out.println("버퍼를 사용했을 때(버퍼 기반) : "+(end-start)+"ms");
		 bis.close();
		 fis2.close();
	}
}
