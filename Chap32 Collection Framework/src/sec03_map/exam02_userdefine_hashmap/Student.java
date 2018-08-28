package sec03_map.exam02_userdefine_hashmap;

import java.util.Objects;

public class Student {
	private int sno;
	private String name;
	
	public int getSno() {
		return sno;
	}
	
	public String getName() {
		return name;
	}
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		//Student객체가 sno와 name이 같으면 equals는 true를 리턴한다.
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return this.sno == student.sno&&this.name.equals(student.name);
		}
		return false;
	}
	
	//1번째 방법(가장 많이 씀)
	@Override
	public int hashCode() {
		return Objects.hash(this.sno, this.name);
	}
	
	//2번째 방법(하위 호완성을 위주로 한다면 이 방법을 선택)
//	@Override
//	public int hashCode() {
//		return sno+name.hashCode();
//	}

}
