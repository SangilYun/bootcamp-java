package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		 
		String source = "1,김천재,100,100,100|2,박수재.95,80,90|3,이자바,80,90,90";
		//한 학생의 정보를 구분하기 위해 |를 사용
		StringTokenizer st = new StringTokenizer(source,"|");
		
		//더블루프를 도는 이유는 구분자가 크게 2가지로 나뉘어져있기 때문이다.
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("가져온 토큰 : " + token);
			
			//가져온 토큰을 다시, 로 구분자를 줌
			StringTokenizer st2 = new StringTokenizer(token,",");
			while(st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
			System.out.println("------");
		}
	}
}
