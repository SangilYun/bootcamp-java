package sec_verify15;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookAppExample {

	public static void main(String[] args) {
		PhoneBookApp pb = new PhoneBookApp();
		pb.run();
	}
}

class Phone{
	private String name;
	private String address;
	private String telNum;

	public Phone(String name, String add, String tel) {
	
		this.name = name;
		this.address = add;
		this.telNum = tel;
		
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTelNum() {
		return telNum;
	}
	
	public String toString() {
		return "이름 : " + this.name + "\n주소 : " + this.address + "\n전화번호 : " + this.telNum;
	}
}

class PhoneBookApp{
	final int INSERT=1;
	final int DELETE=2;
	final int SEARCH=3;
	final int SHOWALL=4;
	final int EXIT=5;
	private Scanner scanner;
	private HashMap<String,Phone> map;
	String name;
	String add;
	String tel;
	
	public PhoneBookApp() {
		scanner = new Scanner(System.in);
		map = new HashMap<>();
	}
	
	public void insert() {
		System.out.println("이름 >>");
		name = scanner.nextLine();
		if(map.containsKey(name)) {
			System.out.println(name+"님은 이미 등록되어 있습니다.");
			return;
		}
		System.out.println("주소 >>");
		add = scanner.nextLine();
		System.out.println("전화번호 >>");
		tel = scanner.nextLine();
		Phone newContact = new Phone(name,add,tel);
		map.put(name,newContact);
		System.out.println(name+"님이 저장되었습니다.");
		
	}
	
	public void delete() {
		if(findKey()) {
			map.remove(name);
			System.out.println(name+"님의 정보가 삭제되었습니다.");
			}
		else
			System.out.println(name+"님은 등록되지 않은 사람입니다.");
	}
	
	public void search() {
		if(!findKey()) {
			System.out.println(name+"님은 등록되지 않은 사람입니다.");
		}
		else {
			System.out.println(map.get(name));
		}
	}
	
	public boolean findKey() {
		System.out.println("이름 >> ");
		name = scanner.nextLine();
		if(map.containsKey(name))
			return true;
		else
			return false;
	}
	
	public void showall() {
		for(String each : map.keySet()) {
			System.out.println(map.get(each));
		}
	}
	
	public void run() {
		int input;
		System.out.println("-------------------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다.");
		System.out.println("-------------------------------------");
		
		while(true) {
			System.out.println("1 : 삽입, 2 : 삭제, 3 : 찾기, 4 : 전체 보기, 5. 종료 >> ");
			input = scanner.nextInt();
			scanner.nextLine();			
			switch(input) {
			case 1 :
				insert();
				break;				
			case 2 : 
				delete();
				break;
			case 3 : 
				search();
				break;
			case 4 :
				showall();
				break;
			case 5 : 
				System.out.println("프로그램을 종료합니다.");
				return ;
			}
		}
	}
}