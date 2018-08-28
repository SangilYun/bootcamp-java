package sec01_list.exam01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListEx {

	public static void main(String[] args) {
		 //asList()는 컬렉션이 아니라 배열형식으로 된 컬렉션을 리턴한다.
		List<String> list1 = Arrays.asList("홍길동", "이준호", "김기리");
		
		//아래와 같이 객체추가하면 예외 발생
		//list1.add("aaaa");
		//list1.remove(0);
		for(String str : list1)
			System.out.println(str);
		
		System.out.println();
		
		//원래 이렇게 해야 정상
		//list<Integer> list2 = Arrays.asList(new Integer(100), new Integer(200), new Integer(300)
		//정수값만 들어갈 수 있다.(자동박싱)
		List<Integer> list2 = Arrays.asList(100,200,300);
		
		//자동 언박싱
		for(int value : list2)
			System.out.println(value);
		
	}
}
