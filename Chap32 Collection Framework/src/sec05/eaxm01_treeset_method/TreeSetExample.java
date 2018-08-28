package sec05.eaxm01_treeset_method;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//TreeSet은 이진트리를 기반으로 이루어진 컬렉션이며, Set인터페이스를 구현한 객체이다.
		//그래서 Set인터페이스에 대입하여 쓸 수 있지만, 보통 TreeSet은 객체의 정렬 및 검색을 위해
		//사용되어 그에 특화된 메서드를 사용하기 위해 TreeSet클래스로 직접 생성하여 대입하도록 한다.
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		//아래와 같이 추가되었을 때, 이진트리로 그리면? 어떻게 되나?
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		//가장 낮은 점수 구하기(이진트리의 가장 왼쪽의 값)
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		//가장 높은 점수 구하기(이진트리의 가장 오른쪽의 값)
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		//입력된 객체는 포함 안함
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수(왼쪽 노드) : " + score);
		//입력된 객체는 포함 안함
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수(오른쪽 노드) : " + score);
		System.out.println();
		
		//입력된 객체 포
		score = scores.floor(new Integer(95));
		System.out.println("95점 이거나 바로 아래의 점수 : " + score);
		//주어진 객체를 포함하여 바로 위의 점수를 반환 -- 주어진 객체 포함
		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수 ; " + scores);
		System.out.println();
		
		//컬렉션에 데이터가 있다면
//		while(!scores.isEmpty()) {
//			//제일 왼쪽 객체부터 가져온다. 단, 가져온 후 treeset에서 제거가 된다.
//			score = scores.pollFirst();
//			System.out.println(score + " (남은 객체 수 : " + scores.size() + ")");
//		}
		//컬렉션에 데이터가 있다면..
//		while(!scores.isEmpty()) {
//			//제일 오른쪽 객체부터 가져온다. 단, 가져온 후 treeset에서 제거가 된다. 
//			score = scores.pollLast();
//			System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
//		}
		//반복자를 얻는다.
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollFirst()와 같은 결과를 가져오긴 하지만 차이점은 객체 제거를 하지 않는 것이
			//가장 큰 차이점이다. 앞에서 말했듯이 명시적으로 remove()를 해줘야 비로서 제거가 됨을
			//기억하도록 하자 
			int value = iterator.next();
			//iterator.remove(); // 이렇게 해줘야 객체가제거 됨.
			System.out.println(value + "(남은 객체 수 : " + scores.size() + ")");
		}
	}
}
