package sec_verify16;

public class Student implements Comparable<Student>{

	private String name;
	private int score;
	
	public Student(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public String toString() {
		return "학생 이름 : " + this.name + ", 점수 : " + this.score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);
//		return (this.score).compareTo(o.score);
	}
}
