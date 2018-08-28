package sec05.exam05_treemap_sort;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample_Sort {

	public static void main(String[] args) {
		 //key로 Integer value로 String타입을 사용 
		TreeMap<Integer, String> scores = new TreeMap<Integer,String>();
		
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "신은혁");
		scores.put(new Integer(75), "김연아");
		scores.put(new Integer(95), "손연재");
		scores.put(new Integer(80), "김삼순");
		//키를 갖고 내림차순을 한다. 하지만 리턴시 내림차순이 된 Map.Entry객체를 리턴한다. 
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		//내림차순 된 descendingMap의 entrySet을 얻어 Set에 대입한다.
		Set<Map.Entry<Integer,String>> descendingEntrySet = descendingMap.entrySet();
		
		//내림차순 된 Map.Entry객체를 하나씩 출력해본다.
		System.out.println(" ---내림 차순---");
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " - 값 : " + str );
		}
		System.out.println();
		//내림차순이 되어있는 Map컬렉션을 다시 내림차순으로 정렬하면 역으로 오름차순이 된다.
		NavigableMap<Integer,String> ascendingMap = descendingMap.descendingMap();
		//오름차순이 된 ascendingMap의 entrySet을 얻어 set에 대입한다.
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		//오름차순이 된 Map.Entry객체를 하나씩 출력해 본다. 
		System.out.println(" ---오름 차순---");
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " - 값 : " + str );
		}
		System.out.println();
		//아래부분은 키만 가져와서 반복자로 출력을 해보았다. 물론 내림차순.
		NavigableSet<Integer> keySet = scores.descendingKeySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			int value = iterator.next();
			String str = scores.get(value);
			System.out.println("키 : " + value + " - 값 : " + str );
		}
	}
}
