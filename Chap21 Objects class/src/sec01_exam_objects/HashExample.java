package sec01_exam_objects;

import java.util.Arrays;
import java.util.Objects;

//import sec01_exam_objects.CompareExample.Student;

public class HashExample {

	public static void main(String[] args) {
		 
		Student s1 = new Student(1, "홍길동", new int[] {100,100});
		Student s2 = new Student(1, "홍길동", new int[] {100,100});
		
		System.out.println("s1인스턴스의 해쉬코드 : " + s1.hashCode());
		System.out.println("s2인스턴스의 해쉬코드 : " + s2.hashCode());
	}
}
class Student{
	int sno;
	String name;
	int [] arr;
	
	public Student(int sno, String name, int[] arr) {
		this.sno = sno;
		this.name = name;
		this.arr = arr;
	}
	@Override
	public int hashCode() {
		//필드값이 여러개일 때 주어진 값들을 이용해서 해시 코드를 생성하는 역할
		//배열일 경우 주소값을 주게 되면 해쉬값이 달라진다. 따라서 정확한 기본값을 제시하여야 한다.
		return Objects.hash(this.sno, this.name, Arrays.toString(arr));
		//this.arr하면 하면 주소를 받기 때문에 다른걸로 인식함. 값을 줘야 한다.
		//return this.sno + this.name;
	}
}