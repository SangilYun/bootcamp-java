package sec_verify12;

public class Student implements Comparable<Student>{

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no= no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor+this.eng+this.math;
	}
	
	public float getAverage() {
		return getTotal()/3;
	}
	
	public String toString() {
		return "이름 : " + this.name + ", "+this.ban+"반, "+this.no 
				+ "번, 국어 : " + this.kor + ", 영어 : " + this.eng + ", 수학 : " +this.math
				+", 총점 : " + this.getTotal() + ", 평균 : " + this.getAverage();
	}

	@Override
	public int compareTo(Student o) {
		if(this.ban == o.ban)
			return Integer.compare(this.no, o.no);
		return Integer.compare(this.ban, o.ban);
	}
}
