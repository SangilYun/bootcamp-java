package sec_verify01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		int total=0;
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(5); 
		list.add(4); 
		list.add(-1);
		list.add(2,-775);
		list.add(3,100);
		System.out.println(list);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("ArrayList내에 있는 정수들의 합 : " + sum);
		
		//for loop으로 
		for(int i=0; i<list.size();i++) {
			total += list.get(i);
		}
		System.out.println("방법2 : " + total);
	}
}
