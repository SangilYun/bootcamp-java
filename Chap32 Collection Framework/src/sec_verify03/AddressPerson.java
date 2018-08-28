package sec_verify03;

import java.util.ArrayList;

public class AddressPerson {

	private ArrayList<Person> db;
	
	public AddressPerson() {
		db = new ArrayList<Person>();
		System.out.println("데이터베이스가 생성되었습니다.");
	}
	
	public void print() {
		Person pClass;
		System.out.println("--------------------------------------------");
		for(int i=0; i<db.size();i++) {
			pClass = db.get(i);
			System.out.println("이름 : " + pClass.getName() +", 나이 : " + pClass.getAge()
			+ ", 연락처 : " + pClass.getCellPhone());
		}
		System.out.println("--------------------------------------------");
		System.out.println();

	}
	
	public int isExists(String s) {
		Person pClass;
		int index = -1;
		for(int i=0; i<db.size(); i++) {
			pClass= db.get(i);
			if((pClass.getName()).equals(s)) {
				index = i;
			}
		}
		return index;
	}
	
	public void insert(Person p) {
		int index = isExists(p.getName());
		if(index == -1)
			db.add(p);
		else
			System.out.println(p.getName()+"님은 이미 등록된 회원입니다.");
	}
	
	public void delete(String s) {
		int index = isExists(s);
		if(index == -1) {
			System.out.println(s+"이란 고객의 이름은 없습니다.");
		}
		else {
			db.remove(isExists(s));
			System.out.println(s+"고객을 삭제하였습니다.");
		}
	}
	
	public void update(String s, Person p) {
		int index = isExists(s);
		if(isExists(s) == -1) {
			System.out.println(s+"이란 고객의 이름은 없습니다. 새로 추가합니다.");
			this.insert(p);
		}
		else {
			db.remove(index);
			db.add(index,p);
			System.out.println(s+"씨 정보를 업데이트 하였습니다.");
		}
	}
}
