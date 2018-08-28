package sec_verify11;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		set.add(new Student(1,"신은혁"));
		set.add(new Student(2,"김연아"));
		set.add(new Student(1,"손연재"));
		set.add(new Student(2,"김연아"));
		set.add(new Student(5,"김동우"));
		set.add(new Student(4,"황희정"));
		set.add(new Student(1,"신은혁"));
		set.add(new Student(3,"박근예"));

		System.out.println("총 객체 수 : " + set.size());
		for(Student each : set)
			System.out.println(each);
		
//		Student s1 = new Student(1,"신은혁");
//		Student s2 = new Student(1,"손연재");
//		System.out.println(s1.equals(s2));		
	}
}
