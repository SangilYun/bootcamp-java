package sec02_set.exam02_UserDefineHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		 Set<Member> set = new HashSet<Member>();
		 //new를 사용했기 때문에 서로다른 객체이지만, 각 필드와 해쉬코드가 같으면 
		 //동등객체로 인식하여, 같은 객체이므로 Set은 중복저장을 하지 않는다. 
		 set.add(new Member("홍길동", 30));
		 set.add(new Member("홍길동", 30));
		 set.add(new Member("홍길동", 25));
		 set.add(new Member("홍길동", 17));
		 int size = set.size();
		 
		 System.out.println("총 객체수 : " + size);
		 //반복자
		 Iterator<Member> it = set.iterator();
		 while(it.hasNext()) {
			 Member obj = it.next();
			 System.out.println(obj.getName() + " : " + obj.getAge());
		 }
	}
}
