package sec01_list.exam01_ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {
		 //기본 저장 용량이 얼마?
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("신동혁");
		list.add("Java");
		list.add("JDBC");
		list.add(2,"오라클");
		list.add("신은비");
		list.add("신은혁");
		//list.add(15); //예외 발생 그 이유는?
		System.out.println("추가 후 " + list);
		int size = list.size(); //ArrayList에 저장(참조)되어 있는 총 객체수 리턴
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2번 인덱스에 있는 객체 : " + skill);
		System.out.println();
		System.out.println("삭제 전");
		skill = list.get(0);
		System.out.println("0번 인덱스에 있는 객체 : " + skill);
		System.out.println();
		System.out.println("삭제 후");
		list.remove("홍길동");
		skill = list.get(0);
		System.out.println("0번 인덱스에 있는 객체 : " + skill);
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+ "번째 객체 : " + list.get(i));
		}
			
		list.remove(2); //Java가 삭제됨
		System.out.println();
		
		for(int i=0; i<list.size(); i++)
			System.out.println(i + " 번째 객체 : " + list.get(i));
		
		//주어진 객체를 다 삭제하는 것이 아니라 제일 가까운 객체가 삭제됨.
		list.remove("신은혁");
		//list.remove("신은혁");
		System.out.println();
		for(int i=0; i<list.size(); i++)
			System.out.println(i+ "번째 깨체 : " + list.get(i));
	}
}
