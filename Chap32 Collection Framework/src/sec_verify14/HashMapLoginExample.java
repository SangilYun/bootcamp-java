package sec_verify14;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLoginExample {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		map.put("perpear", "4321");
		map.put("fly", "1012");
		map.put("numeric", "1234");
		map.put("fish", "15244");
		map.put("ruby", "00145");

		while(true) {
			System.out.println("아이디와 비밀번호를 입력해 주세요");
			System.out.println("아이디 : ");
			String id = scan.nextLine();
			System.out.println("비밀번호 : ");
			String password = scan.nextLine();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해 주세요");
				continue;
			}
			else{
				if(!map.containsValue(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요");
					continue;
				}
				else {
					System.out.println(id+"님이 로그인 했습니다!");
					break;
				}
			}	
		}
		scan.close();
	}
}
