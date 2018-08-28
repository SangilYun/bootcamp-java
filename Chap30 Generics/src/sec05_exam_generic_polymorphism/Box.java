package sec05_exam_generic_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

	//List계열인 컬렉션.. List는 인터페이스이고, ArrayList는 List인터페이스를 구현한 클래스 
	//인터페이스의 필드의 다형성
	List<T> list = new ArrayList<T>();
	
	//컬렉션 객체 추가.. 엄밀히 말하면 객체의 주소값이 저장되는 것
	public void add(T item) {
		list.add(item);
	}
	
	//컬렉션 객체 인덱스로 찾아오기
	public T get(int i) {
		return list.get(i);
	}
	
	//컬렉션 크기 반환
	public int size() {
		return list.size();
	}
	
	//컬렉션에 있는 항목 다 출력
	public String toString() {
		return list.toString();
	}
}
