package sec05.eaxm04_treemap_method;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		 //키로 Integer 값으로 String 타입을 사용
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		
		//map 객체를 5개를 무작위로 저장했지만, treemap의 이진트리에 의해서
		//자동정렬이 된다. 
		//scores.put(87,"홍길동"); 이렇게 작성해도 된다.
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "신은혁");
		scores.put(new Integer(75), "김연아");
		scores.put(new Integer(95), "손연재");
		scores.put(new Integer(80), "김삼순");

		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : "  + entry.getKey() + " _ " + entry.getValue());
		System.out.println();
		//이진트리중 가장 오른쪽 즉, 키의 값이 가장 높은 값을 가져온다.
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + " _ " + entry.getValue() );
		System.out.println();
		
		//이진트리 중 주어진 객체, 95점 보다 작은 Entry를 리턴한다.(exclusive, 95점을 포함하지 않는다.)
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 바로 아래 점수(미포함) : " + entry.getKey() + " _ " + entry.getValue());
		System.out.println();

		//이진트리 중 주어진 객체, 95점 큰 Entry를 리턴한다.(exclusive , 95점을 포함하지 않는다.)
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 바로 위 점수(미포함) : " + entry.getKey() + " _ " + entry.getValue());
		System.out.println();
		
		//이진트리 중 주어진 객체 즉, 95점보다 작은 Entry를 리턴한다. (inclusive, 95점 포함)
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수(포함) : " + entry.getKey() + " _ " + entry.getValue());
		System.out.println();
		
		//이진트리 중 주어진 객체 즉, 95점보다 큰 Entry를 리턴한다. (inclusive, 95점 포함)
		entry = scores.ceilingEntry(new Integer(95));
		System.out.println("95점이거나 바로 위의 점수(포함) : " + entry.getKey() + " _ " + entry.getValue());
		System.out.println();
		
		while(!scores.isEmpty()) {
			//역시 treeSet과 유사하게 pollFirstEntry()는 treemap에서 
			//가장 낮은 점수 entry를 가져오고 map에서 제거한다. 올림차순 
			entry = scores.pollFirstEntry();
			int value = entry.getKey();
			String str = entry.getValue();
			System.out.println("키 : " + value + " - " + "값 : "  
					+str + "(남아있는 객체 수 : "+ scores.size() +")");
		}

//		while(!scores.isEmpty()) {
//			//역시 treeSet과 유사하게 pollLastEntry()는 treemap에서 
//			//가장 낮은 점수 entry를 가져오고 map에서 제거한다. 내림차순 
//			entry = scores.pollLastEntry();
//			int value = entry.getKey();
//			String str = entry.getValue();
//			System.out.println("키 : " + value + " - " + "값 : "  
//					+str + "(남아있는 객체 수 : "+ scores.size() +")");
//		}
		
		//treemap에 대한 keySet을 얻고, 반복자를 얻은 후 전체객체를 출력해봄
		//위와 차이가 있는 것은, 반복자를 통해 얻어 출력하는 것은 treemap에서
		//객체가 제거가 안됨을 알도록 하자. 
//		Set<Integer> keyset = scores.keySet();
//		Iterator<Integer> iterator = keyset.iterator();
//		while(iterator.hasNext()) {
//			int value = iterator.next();
//			String str = scores.get(value);
//			//명시적으로 호출함으로써 treemap에서 제거를 할 수가 있다. 
//			iterator.remove();
//			System.out.println("키 : " + value + " - " + "값 : "  
//					+str + "(남아있는 객체 수 : "+ scores.size() +")");
//		}
		
		//treemap에 대한 Map.entrySet을 얻고, 반복자를 얻은 후 전체객체를 출력해봄
		//위와 차이가 있는 것은, 반복자를 통해 얻어 출력하는 것은 treemap에서
		//객체가 제거가 안됨을 알도록 하자. 
//		Set<Map.Entry<Integer, String>> entryset = scores.entrySet();
//		Iterator<Map.Entry<Integer, String>> iterator = entryset.iterator();
//		while(iterator.hasNext()) {
//			Map.Entry<Integer, String> mapEntry = iterator.next();
//			int value = mapEntry.getKey();
//			String str = mapEntry.getValue();
//			//명시적으로 호출함으로써 treemap에서 제거를 할 수가 있다. 
//			iterator.remove();
//			System.out.println("키 : " + value + " - " + "값 : "  
//					+str + "(남아있는 객체 수 : "+ scores.size() +")");
//		}
	}
}
