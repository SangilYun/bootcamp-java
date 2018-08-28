package sec02.exam01_system_in_out;

import java.io.InputStream;

public class SystemInExample02{

	public static void main(String[] args) throws Exception{
		 //키보드로 부터 입력을 받기 위해 System.in필드를 InputStream에 대입한다. 
		InputStream is =System.in;
		byte[] data = new byte[100];
		System.out.println("이름 : ");
		//키보드로 입력한 데이터를 datas란 바이트배열에 저장하고 읽은 
		//바이트수를 리턴한다 
		int nameBytes = is.read(data);
		
		//엔터키(캐리지 리턴(13) + 라인피드(10)를 제외한 나머지를 문자열로 만든다. 
		String name = new String(data,0,nameBytes-1);
		System.out.println("하고 싶은 말 : ");
		int commentBytes = is.read(data);
		//-2를 하는 이유? 
		String comment = new String(data,0,commentBytes-1);
		System.out.println("입력한 이름 : "+ name);
		System.out.println("하고싶은 말 : " + comment);
	

	}

}
