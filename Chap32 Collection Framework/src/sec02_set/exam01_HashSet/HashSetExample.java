package sec02_set.exam01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		 Set<String> set = new HashSet<String>();
		 
		 //set계열을 중복 저장이 안된다. 아울러 인덱스로 관리도 안된다. 
		 set.add("Java");
		 set.add("JDBC");
		 set.add("Servlet/JSP");
		 set.add("Java");
		 set.add("iBATIS");
		 
		 int size = set.size();
		 
		 //결과가 4이다. 이유는?
		 System.out.println("총 객체 수 : " + size);

		 //반복자를 set을 통해서 얻는다.
		 Iterator<String> iterator = set.iterator();
		 //가져올게 있는가? 있으면 true, 없으면 false를 리턴
		 while(iterator.hasNext()) {
			 String element = iterator.next();
			 System.out.println("\t" + element);
		 }
		 set.remove("JDBC");
		 set.remove("iBATIS");
		 size = set.size();
		 
		 System.out.println();
		 System.out.println("총 객체수 : " +  size);
		 
		 for(String element : set)
			 System.out.println("\t" + element);
		 
		 set.clear();
		 if(set.isEmpty())
			 System.out.println("객체가 없습니다.");
		 else
			 System.out.println("객체가 존재합니다.");
	}
}
