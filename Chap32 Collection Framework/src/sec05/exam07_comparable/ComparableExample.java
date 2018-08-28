package sec05.exam07_comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		//Person이라는 사용자 정의 클래스를 저장하는 treeSet을 생성
		 TreeSet<Person> treeSet = new TreeSet<Person>();

		 //Person클래스가 Comparable인터페이스를 구현하였기 때문에,
		 //Age에 따라서 오름차순으로 정렬이 되어 있다.
		 treeSet.add(new Person("신은혁",9));
		 treeSet.add(new Person("홍길동",35));
		 treeSet.add(new Person("손연재",19));
		 treeSet.add(new Person("김기수",19));
		 treeSet.add(new Person("박연수",25));
		 treeSet.add(new Person("손은정",21));
		 treeSet.add(new Person("손민수",29));
		 treeSet.add(new Person("김춘자",51));
		 treeSet.add(new Person("박길후",61));
		 
		 //오름차순이 정렬된 것을 아래와 같이 확인할 수 있다.
		 //(반복자를 얻어서 한번 해보자)
		 //그러나, 같은 나이라면, 중복 저장 되지 않는다. --> treeSet
		 System.out.println("총 객체 수 :" + treeSet.size());
		 for(Person person : treeSet) {
			 String str = person.getName();
			 int age = person.getAge();
			 System.out.println("이름 " + str + " " + "나이 : " + age);
		 }
		 
//		 Iterator<Person> it = treeSet.iterator();
//		 while(it.hasNext()) {
//			 Person p = it.next();
//			 
//			 System.out.println("이름 : "+p.getName());
//			 System.out.println("나이 : "+p.getAge());
//		 }
		 
	}

}
