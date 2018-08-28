package sec01_list.exam01_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx02 {

	public static void main(String[] args) {
		 
		ArrayList list1 = new ArrayList();
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		//subList()는 마지막 인덱스를 포함하지 않고 List타입을 반환한다.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		System.out.println("정렬 후 ");
		Collections.sort(list1);  //list1과 list2를 정렬한다.
		Collections.sort(list2); //Collections.sort(list 1)
		print(list1,list2);
		
		//list2.add(100);
		//컬렉션 포함 여부(요소가 다 들어있다면 true리턴)
		System.out.println("list1컬렉션에 list2컬렉션의 모든 요소가 들어있는가? : ");
		System.out.println(list1.containsAll(list2));
		
		System.out.println();
		
		
		list2.add("B");
		list2.add("C");
		//삽입
		list2.add(3,"A");
		print(list1,list2);
		//대체
		list2.set(3, "AA");
		print(list1,list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1,list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다. 
		for(int i= list2.size()-1 ; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1,list2);
	}

	public static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
