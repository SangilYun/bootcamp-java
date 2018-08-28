package sec04_properties.exam01_properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		 //Properties는 키와 값을 String으로 만들어진 Map컬렉션이다. 
		Properties properties = new Properties();
		
		//PropertiesExample와 동일한 곳에 지금 프라퍼티 파일이 존재하므로 아래와 같이 패스 지정
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		//유니코드로 파일 경로가 출력 
		path = URLDecoder.decode(path, "utf-8"); //한글 복원
		System.out.println(path);
		properties.load(new FileReader(path));
//		properties.load(new FileReader("/Users/yunsangil/Documents/computing/JAVA/Chap32 Collection Framework/src/sec04_properties/exam01_properties/database.properties"));
		

		//키를 주고 값을 읽어옴
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		//얻어온 값을 출력해봄 
		System.out.println("driver : " + driver);
		System.out.println("url: " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
	}
}
