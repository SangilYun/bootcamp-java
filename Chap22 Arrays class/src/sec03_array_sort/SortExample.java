package sec03_array_sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortExample {

	public static void main(String[] args) {
		 
		int[] scores = new int[] {55, -9, 8};
		//Arrays.sort()는 기본적으로 오름차순 정렬이다.
		Arrays.sort(scores);
		
		System.out.println(Arrays.toString(scores));
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		//String 배열
		String[] names = new String[] {"손예진", "박동수", "허경환"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		for(int i=0; i<names.length;i++) {
			System.out.println("names[" +i+"]=" + names[i]);
		}
		System.out.println();
		
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		//사용자 정의 클래스 배열
		Member[] members = new Member[] {m1,m2,m3};
		
		//사용자 정의 클래스를 sort하기 위해서는 Comparable<> 인터페이스를 구현하거나 아래와 같이 
//		Comparator<Member>를 매개변수로 제공해야 한다.
		Arrays.sort(members,new Comparator<Member>(){
			@Override
			public int compare(Member o1, Member o2){
				return o1.name.compareTo(o2.name);
			}
		});
		
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("Members[" + i + "].name = " + members[i].name);
		}
		for(Member m : members) {
			System.out.println(m.name);
		}
			
	}

}
