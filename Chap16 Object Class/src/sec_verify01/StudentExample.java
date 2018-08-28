package sec_verify01;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		HashMap<Student, String>hashMap = new HashMap<Student, String>();
		hashMap.put(new Student("1"), "95점");
		hashMap.put(new Student("2"), "100점");
		hashMap.put(new Student("3"), "12점");
		
		//방법 1
		for(Student each : hashMap.keySet()) {
			System.out.println(each.getStudentNum()  + "번 학생의 점수 : " + hashMap.get(each));
		}

		//방법 2
//		System.out.println( "1번 학생의 점수 : " + hashMap.get(new Student("1")));
//		System.out.println( "2번 학생의 점수 : " + hashMap.get(new Student("2")));
//		System.out.println( "3번 학생의 점수 : " + hashMap.get(new Student("3")));
	}

}
