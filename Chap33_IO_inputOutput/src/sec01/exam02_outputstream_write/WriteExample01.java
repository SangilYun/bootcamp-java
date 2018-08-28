package sec01.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample01 {

	public static void main(String[] args) throws Exception{
		 
		//파일로 부터 출력스트림을 생성하여 대입한다(다형성)
		OutputStream os = new FileOutputStream("/Users/yunsangil/Desktop/test.txt");//일반 예외 발생
		byte[] data = "ABC".getBytes(); //"ABC"라는 문자열에서 바이트 배열을 얻어낸다(인코딩) 
		System.out.println(Arrays.toString(data));
		
		//3번 루핑 
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}
