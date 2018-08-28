package sec_verify11;

public class Student {
	private int studentNum;
	private String name;
	
	public Student(int num, String name) {
		this.studentNum = num;
	    this.name = name;
	}
	
	public int hashCode() {
		return studentNum;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student)obj;
			return (this.studentNum ==st.studentNum);  
		}
		else
			return false;	
	}
	public String toString() {
		return "학번 : " + this.studentNum + " 이름 : " + this.name;
	}
}
