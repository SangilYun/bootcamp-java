package sec05.eaxm02_treeset_sort;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample_Sort {

	public static void main(String[] args) {
		 TreeSet<Integer> scores = new TreeSet<Integer>();
		 
		 //저장될 때는 무작위로 저장되지만, 컬렉션에 들어갈때는 이진트리의 구조를 갖는다.
		 scores.add(new Integer(87));
		 scores.add(new Integer(98));
		 scores.add(new Integer(75));
		 scores.add(new Integer(95));
		 scores.add(new Integer(80));
		 
		 //TreeSet의 descendingSet()는 내림차순으로 정렬된 객체들이 
		 //NavigableSet에 저장된다.
		 NavigableSet<Integer> descendingSet = scores.descendingSet();
		 System.out.println("내림차순 결과");
		 
		 for(Integer score : descendingSet) {
			 System.out.println(score + " ");
		 }
		 System.out.println("\n객체 수 : " + scores.size());
		 System.out.println();
		 
		 //다시 descendingSet()을 호출함으로써 올림차순으로 바꿀수도 있다. --> descending을 두번하면 ascending
		 //pollLast(), pollFirst()메서드를 이용해도 된다.
		 //(프로개르머가 상황에 맞게끔 선택한다.)
		 NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		 System.out.println("올림차순 결과");
		 for(Integer score : ascendingSet) {
			 System.out.println(score + " ");
		 }
		 System.out.println("\n객체 수 : " + scores.size());
		 System.out.println();
	}
}
