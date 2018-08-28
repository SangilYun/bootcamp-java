package sec_verify06;

public class Student implements Cloneable{

	private String nID;
	private String szName;
	
	public Student (String nID, String szName) {
		this.nID=nID;
		this.szName=szName;
	}
	@Override
	public String toString() {
		return "ID는 " + this.nID+", "+"Name은 " + this.szName;
	}
	public Student getStudent() {
		System.out.println("Student 인스턴스 1으로 얕은 복제를 함.");
		Student cloned = null;
		try {
			cloned = (Student)this.clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}
	public void setnID(String nID) {
		this.nID = nID;
	}
	public void setSzName(String szName) {
		this.szName = szName;
	}
}
