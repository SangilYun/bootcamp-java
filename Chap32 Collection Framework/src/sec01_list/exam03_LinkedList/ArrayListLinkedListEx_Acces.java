package sec01_list.exam03_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx_Acces {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(100000);
		LinkedList<String> ll = new LinkedList<String>();
		add(al);
		add(ll);
		
		System.out.println(" =접근시간 테스트 = ");
		System.out.println("ArrayList : " + access(al));
		System.out.println("LinkedList : " + access(ll));
		
	}
	
	public static void add(List<String> list) {
		for(int i=0; i<10000; i++) {
			list.add(i+"");
		}
	}

	public static long access(List<String> list) {
		long start = System.nanoTime();
		for(int i=0; i<10000; i++)
			list.get(i);
		long end = System.nanoTime();
		return end-start;
	}
}

