package sec_verify02;

import java.util.Arrays;

public class SortSearchExample {
	
	public static Student findStudent(Student[] arr, String sno) {

		for(int i=0; i<arr.length; i++) {
			if(arr[i].getSno().equals(sno)) {
				return arr[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {

		Student s1 = new Student("775697","홍길동");
		Student s2 = new Student("557685","박동수");
		Student s3 = new Student("120445","김민수");
		Student s4 = new Student("995267","신동욱");
		Student s5 = new Student("441235","김건모");
		
		Student[] arr = {s1,s2,s3,s4,s5};

		Arrays.sort(arr);
		System.out.println("학번 내림차순 정렬 ");
		int i=0;
		for(Student s : arr) {
			 System.out.println("["+i+"]번째 학생 학번 : " + s.getSno() +"\t\t["+i+"]번째 학생 이름 : "+ arr[i].getName());
			 i++;
		}
		System.out.println("찾고 싶은 학생의 학번 : 557685");
		Student stu = findStudent(arr,"557685");
		i = Arrays.binarySearch(arr, stu);
		System.out.println(stu.getName()+" 학생은 "+ i+ "번째 방에 있습니다.");
	}
}
