package sec01.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample01 {

	public static void main(String[] args) throws Exception{
		 //\는 이스케이프 문자로써 경로를 입력시 \\를 하던지 아니면, /만 적어주면 된다.
		//이스케이프란 어떤 부호 또는 언어로부터 이탈하는 것. 즉, 기존의 패턴으로부터 탈출하는 
		//것을 말한다.
		//아스키 문자 집합의 27번째 문자의 이름이다. 
		
		//다형성 적용 예외 발생 할 수 있으니 JVM에게 던짐.
		//InputStream is = new FileInputStream("C:\\test.txt");
		//다형성 적용 예외 발생 할 수 있으니 JVM에게 던짐.
		InputStream is = new FileInputStream("/Users/yunsangil/Desktop/test.rtf");
		int readByte;
		
		//InputStream의 read()메서드는 읽을게 더이상 없다면,
		//-1값을 리턴함.(한글은 2바이트로 해석됨)
		while( (readByte = is.read() ) != -1) {
//			System.out.println("읽은 바이트 : " + readByte); //아스키코드값 출력
			//아스키코드값 출력(한글은 깨짐. 왜냐 한글은2바이트 이니까)
//			System.out.println("읽은 문자 : " + (char)readByte);
			System.out.print((char)readByte);
		}
		
		//아래와 같이 작성해도 된다. 마음대로 하시면 됩니다.
//		while(true) {
//			readByte = is.read();
//			if(readByte == -1) //읽었다면 -1을 저장하지 않을 것이다.
//				break;
//			System.out.println("읽은 바이트 : " + readByte); //아스키코드값 출력 
//		}
		is.close();
	}

}
