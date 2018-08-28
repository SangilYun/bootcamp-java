package sec_verify12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		 
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student("신은혁",2,1,70,90,70));
		set.add(new Student("이혜숙",2,2,60,100,80));
		set.add(new Student("황기태",1,3,100,100,100));
		set.add(new Student("신기석",1,1,90,70,80));
		set.add(new Student("김연아",3,4,80,80,90));
		set.add(new Student("김주식",3,2,10,80,90));		
		set.add(new Student("사군자",3,3,20,60,99));		
		set.add(new Student("심수봉",3,5,80,70,12));		
				
		//Set계열은 comaprator를 이용해서 sort는 하는 메서드가 없어서
		//ArrayList로 변환하여 반복자를 얻어서 출력한다.
		ArrayList<Student> list = new ArrayList<>(set);	
		System.out.println("총 객체수 : " + list.size());
				
//		Collections.sort(list);
		Collections.sort(list, new BanNoAscending());		
		Iterator<Student> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
