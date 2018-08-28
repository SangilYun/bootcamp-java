package sec04_getProperty;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {

	public static void main(String[] args) {
		 
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println("운영체제 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈디렉토리 : " + userHome);
		
		System.out.println("-------------------------------------");
		System.out.println("[key]							value");
		System.out.println("-------------------------------------");

		//Property를 얻어내어 Set객체 생성하여 keySet으로 저장 후 출력
		Properties props = System.getProperties(); //모든 시스템의 속성을 담아서 리턴
		
		//Properties 컬렉션은 키와 값의 객체가 String이다. 여기서는 Properties컬렉션의 
		//키값만 가져와서 Set컬렉션을 만들고 출력해본다. 왜냐 map계열은 키값만 알아도
		//값을 얻어오는데 문제가 없기 때문인 것이다.
		Set<Object> keys = props.keySet();
		
		for(Object objKey : keys) {
			String key = (String)objKey; //키 값은 String이므로 강제 캐스팅 한다.
			String value = System.getProperty(key);	//키값을 이용하여 값 출력
			System.out.println("[" + key + "]" + value);
		} 
	}
}
