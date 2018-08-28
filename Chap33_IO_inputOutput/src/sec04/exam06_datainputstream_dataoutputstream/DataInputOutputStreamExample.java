package sec04.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		//기본 타입의 데이터가 저장되기 때문에, .txt로 저장하지 않고,
		//.dat확장자를 사용하여 FileOutputStream을 생성하였다.
		FileOutputStream fos = new FileOutputStream("C:/primitive-type_save.dat");
		
		//File의 크기를 알아보기 위해서 생성했다.
		File file = new File("");
		
		//그리고 기본 타입을 출력하기 위해 보조스트림으로 DataOutputStream을 연결하였다.
		DataOutputStream dos = new DataOutputStream(fos);
		
		//파일은 처음에 기본적으로 0바이트로 시작한다.
		System.out.println("파일 크기 : " + file.length());
		//String을 파일에 저장하기 위해서는 writeUTF를 사용한다.
		dos.writeUTF("신은혁");
		//하지만, 저장하면서 파일의 기본적 파일시스템의 크기가 2Kbyte를 차지하는 것을 알 수 있다.
		System.out.println("파일크기 : " + file.length());
		
		dos.writeDouble(100.4); //double타입 저장
		dos.writeInt(10); //int타입 저장
		System.out.println("파일 크기 : " + file.length());
		dos.writeUTF("김연아");
		dos.writeDouble(93.3);
		dos.writeInt(27);
		System.out.println("파일크기(byte) :" +file.length()); //46바이트가 저장되었다.
		
		//자원 해제
		dos.flush();
		dos.close();
		fos.close();
		System.out.println();
		
		//위에서 저장한 파일을 읽기 위해 아래와 같이 FileInputStream과 DataInputStream을 생성했다.
		FileInputStream fis = new FileInputStream("");
		DataInputStream dis = new DataInputStream(fis);
		//읽을 때는 저장할때의 순서와 똑같이 읽어야 한다.
		for(int i=0;i<2;i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println("읽은 문자열 : "+name);
			System.out.println("읽은 double값 : " + score);
			System.out.println("읽은 int값 : " + order);
			System.out.println();
		}
		System.out.println("파일의 크기(byte) : " + file.length()); //46바이트가 읽혀졌다.
		//자원해제
		dis.close();
		fis.close();
	}
}
