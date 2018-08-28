package sec_verify.exam05;

public class Student {

	String name;
	int num;
	int korScore;
	int engScore;
	int matScore;
	
	public Student(String[] stu) {
		this.name = stu[0];
		this.num = Integer.valueOf(stu[1]);
		this.korScore = Integer.valueOf(stu[2]);
		this.engScore = Integer.valueOf(stu[3]);
		this.matScore = Integer.valueOf(stu[4]);
	}
	
	public String format(String str, int length, int alignment) {
		return String.format("%"+length, str);
	}
	
	public String toString() {
		return String.format("%-5s%3d%6d%6d%6d%6d",this.name, this.num, 
				this.korScore, this.matScore ,this.engScore , this.korScore+this.matScore+this.engScore);
	}
	
	public static void main(String[] args) {
		Student t =new Student(new String[]{"1","1","2","3","4"});
		System.out.println(t.format("abc",3,1));
	}
}
