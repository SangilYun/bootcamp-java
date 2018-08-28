package sec_verify10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
		 int i=1;
		 set.add("1");
		 set.add("2");
		 set.add("3");
		 set.add("4");
		 set.add("5");
		 System.out.println("총 객체 수 : " + set.size());
		 System.out.println("반복자를 얻어서 출력합니다.");
		 Iterator<String> it = set.iterator();
		 while(it.hasNext()) {
			 System.out.println(i+"번째 객체 : "+it.next());
			 i++;
		 }
	}
}
