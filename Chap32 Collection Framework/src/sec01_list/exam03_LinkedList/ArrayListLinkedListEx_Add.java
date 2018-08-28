package sec01_list.exam03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx_Add {

	public static void main(String[] args) {
		 
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		
		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList :" + add1(al));
		System.out.println("LinkedList :" + add1(ll));
		System.out.println();
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList(배열복사발생) :" + add2(al));
		System.out.println("LinkedList(노드값 변경) :" + add2(ll));
		System.out.println();
		System.out.println("= 중간에서 삭제하기 =");
		System.out.println("ArrayList(배열복사발생) :" + remove2(al));
		System.out.println("LinkedList(노드값 변경) :" + remove2(ll));
		System.out.println();
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList :" + remove1(al));
		System.out.println("LinkedList :" + remove1(ll));
		System.out.println();

	}
	//순차적 데이터 추가
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	//비순차적 데이터 추가
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list.add(500, "X");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	//순차적 데이터 삭제 
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	//비순차적 데이터 삭제 
		public static long remove2(List<String> list) {
			long start = System.currentTimeMillis();
			for(int i=0; i<10000;i++) {
				list.remove(i);
			}
			long end = System.currentTimeMillis();
			return end-start;
		}
}
