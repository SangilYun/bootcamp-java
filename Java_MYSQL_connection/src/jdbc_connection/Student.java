package jdbc_connection;

//Java bean이라고 함
public class Student {
	//모뎀 1:1 대응(MVC 패턴)
	private String id;
	private String name;
	private String grade;
	
	public Student(String id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public Student() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id="+id+", name =" +name + ", grade = " + grade + "]";
	}
}
