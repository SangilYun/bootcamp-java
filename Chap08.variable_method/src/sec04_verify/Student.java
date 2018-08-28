package sec04_verify;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return this.getTotal()/3.0f;
	}
	
	Student(){
		this("최재욱", 100,100,18);
	}
	Student(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		System.out.printf("이름 : "+this.name+"\n총점 : "+this.getTotal() + "\n평균 : %.1f",getAverage());
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student test = new Student();
		

	}

}
