package sec05.exam08_comparable;

import java.util.Comparator;

//Fruit객체를 대상으로 하는 비교자(정렬자)를 생성하여 treeSet에 생성자에 대입해주면 
//Comparable을 구현하지 않아도 정렬이 가능해진다. 
public class AscendingComparator implements Comparator<Fruit>{
	//오름차순 정렬. 리턴값을 바꾸면 내림차순
	//기준은 가격
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return Integer.compare(o1.getPrice(), o2.getPrice());
	}
}
