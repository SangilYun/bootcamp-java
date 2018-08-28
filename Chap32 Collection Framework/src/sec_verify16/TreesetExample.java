package sec_verify16;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(new Student("신은혁", 96));
		treeSet.add(new Student("김주성", 86));
		treeSet.add(new Student("김동주", 68));
		treeSet.add(new Student("이대호", 100));
		treeSet.add(new Student("김호주", 59));
		treeSet.add(new Student("이주희", 77));

		
		for(Student each : treeSet) {
			System.out.println(each);
			if(each == Collections.max(treeSet) ) {
				System.out.println();
				System.out.println("최고 점수 : " + each.getScore()
					+ ", 학생 이름 : " + each.getName());
			}
		}
		System.out.println("---------------------");
		Iterator<Student> it = treeSet.iterator();
		while(it.hasNext()) {
			Student each = it.next();
			System.out.println(each);
			if(each == Collections.max(treeSet) ) {
				System.out.println();
				System.out.println("최고 점수 : " + each.getScore()
					+ ", 학생 이름 : " + each.getName());
			}
		}
		System.out.println(treeSet.last());
		System.out.println(treeSet.first());
	}
}
