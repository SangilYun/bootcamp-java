package sec_verify02;

public class Student implements Comparable<Student> {

	private String sno;
	private String name;
	
	public Student(String s, String n) {
		this.sno = s;
		this.name = n;
	}

	@Override
	public int compareTo(Student o) {
		return (o.sno).compareTo(this.sno);
	}
	
	public String getSno() {
		return sno;
	}
	
	public String getName() {
		return name;
	}
}
