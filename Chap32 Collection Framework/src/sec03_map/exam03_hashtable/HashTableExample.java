package sec03_map.exam03_hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		//hashtable은 구버전, 즉 map컬렉션이 나오기 이전에 사용했던 
		//자료구조이다. 신버전이 앞서 본 hashmp컬렉션이다. 
		//기능은 동일하다.

		//키와 값으로 모두 String을 쓴다.
		Map<String,String> map = new Hashtable<String, String>();
		//객체 추가
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scan = new Scanner(System.in);
		//객체 검색
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디 : ");
			String id = scan.nextLine();
			System.out.println("비밀번호 : ");
			String password = scan.nextLine();
			System.out.println();
			//저장되어 있는 객체를 검색하여(DB라고 상상) 아이디랑
			//비밀번호를 일치시 로그인 성공
			//id가 있다면..
			if(map.containsKey(id)) {
				//id 즉, 키를 주고 얻어오는 것이 값 즉, password이니까 
				//같다면 로그인 성공, 아니면 비밀번호 불일치
				if(map.get(id).equals(password)) {
					System.out.println(id+ "님이 로그인 되었습니다.");
					break;
				}
				else
					System.out.println("비밀번호가 틀렸습니다.");
			}
			else
				System.out.println("아이디가 존재하지 않습니다.");
		}
		scan.close();
	}
}
