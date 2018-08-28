package sec04_array_search;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		//기본 타입값 검색
		int[] scores = new int[]{1,88,100,99,97,98};
		
		//sort를 먼저 하지 않으면 엉뚱한 값 발생함.
		int index = Arrays.binarySearch(scores,99);
		System.out.println("before sorting");
		System.out.println("score[] = " + Arrays.toString(scores));
		System.out.println("index containing 99 : " +index); //소팅하지 않아서 음수값 나옴 
		
		Arrays.sort(scores);
		System.out.println("after sorting");
		System.out.println("score[] = " + Arrays.toString(scores));
		index = Arrays.binarySearch(scores, 1);
		System.out.println("index containing 1 : " + index );
		System.out.println();
		
		//searching string
		String[] names = {"홍길동", "박동수","김민수"};
		System.out.println("before sorting");
		System.out.println("name[] = " + Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("after sorting");
		System.out.println("name[] = " + Arrays.toString(names));
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("index containing 홍길동 : " + index );
		System.out.println();
		
		//사용자 정의 객체 검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1,m2,m3};
		System.out.println("before sorting members");
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" +i+ "] : " + members[i].name);
		}
		index = Arrays.binarySearch(members, m1);
		System.out.println("index containing m1 instance : " + index);
		
		System.out.println();
	    Arrays.sort(members);
	    System.out.println("after sorting");
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" +i+ "] : " + members[i].name);
		}
		index = Arrays.binarySearch(members, m1);
		System.out.println("index containing m1 instance : " + index);

	}
}
