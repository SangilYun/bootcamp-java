package sec_verify01;

import java.util.StringTokenizer;

public class StringTokenExample {

	public static void main(String[] args) {
		 
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐", "/");	
		System.out.println("st 참조변수의 객체의 값을 /으로 분리한 결과");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
