package sec03_map.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		 //키가 String, 값이 Integer타입 여기서 둘다 객체라는 것에 주목하자.
		Map<String,Integer> map = new HashMap<String, Integer>();
		/*map컬렉션에 키와 값을 넣고 있다. "홍길동"키가 2번 코딩이 되어있는데 Map은
		 * 중복된 키를 저장하지 않는다. 따라서 마지막에 put이 된 것으로 대체가 됨을 주목하자.
		 * 또한 여기서는 String타입이기 때문에 따로 hashcode()와 equals()를 재정의 하지 
		 * 않아도 된다.(이미 구현되어 있다.)
		 */
		map.put("신은혁",85);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);
		
		//map컬렉션의 key만 set으로 바꾼다.
		Set<String> keySet = map.keySet();
		//keySet에 대한 반복자(Iterator)를 얻는다.
		Iterator<String> keyIterator = keySet.iterator();
		
		System.out.println("keySet을 이용해서 출력함.");
		//가져올 키가 있느냐?
		while(keyIterator.hasNext()) {
			//키가 String타입이니까 String으로 받는다. 
			String key = keyIterator.next();
			//얻은 키로 값을 얻어온다.(값이 Interger, 언박싱)
			int value = map.get(key);
			System.out.println("\t" + key + " : "+value);
		}
		System.out.println();
		//키가 홍길동인 MapEntry를 삭제한다. 
		map.remove("홍길동");
//		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		//map컬렉션의 Map.Entry객체를 대상으로 Set으로 바꾼다.
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		//entrySet에 대한 반복자를 얻는다. 
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		System.out.println("entrySet을 이용해서 출력함.");
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		System.out.println("for문을 이용");
		for(String each : map.keySet()) {
			System.out.println("\t"+each + " : " + map.get(each));
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 MapEntry 수 : " + map.size());
	}
}
