package sec02_hashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class KeyExample {

	public static void main(String[] args) {
		
		//HashMap은 어떠한 Key로 데이터를 저장하는 컬렉션
		HashMap<Key, String>hashMap = new HashMap<Key,String>();
		hashMap.put(new Key(2), "홍길동");
		hashMap.put(new Key(3), "asdf");
		
		//HashMap, HashSet, HashTable, LinkedHashSet(컬렉션 (List계열, TreeSet제외)은 
		//equals를 호출하기 전에 hashcode()를 먼저 호출한다.
		//그렇기 때문에, new를 통해 Key인스턴스를 만들었으므로, 각기 힙에 저장되는 번지가
		//달라 원하는 값을 주지 아니한다.
		//원하는 값을 얻기 위해서는 Object클래스의 hashcode()를 재정의를 해서 값이
		//같을때 1차 논리적 동등을 인정한다.
		//그리고 equals()를 재정의하여 그 값을 같게 함으로써 동등객체가 되어 원하는 값이 나온다.

		String value = hashMap.get(new Key(2)); 	//여기서 get을 호출할때 입력받은 값과 hashmap
		String value6 = hashMap.get(new Key(3));	//안에 값을 비교하며 값을 찾을때 equals를 써서 
		String value1 = new String("홍길동");			//출력 결과에 equals가 생김.
		String value2 = new String("홍길동");
		System.out.println(value);
		System.out.println(value.hashCode() + " " + value2.hashCode());
		
		List<Key> list = new ArrayList<Key>();	//필드의 다형
		list = new LinkedList<Key>();
		list.add(new Key(10));
		Set<Key> set = new LinkedHashSet<Key>();
		set.add(new Key(10));
	}
		//출력결과에 HashCode가 나오는 것은 Hash시리즈 애들을 만들때 마다 .
}
