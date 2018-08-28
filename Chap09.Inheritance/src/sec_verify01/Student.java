package sec_verify01;

public class Student extends Person {

	private String S_num;
	
	@Override
	public String toString() {
		return this.S_num + "\n이름을 입력하세요 : "+ super.toString() +"\n학번 : " 
				+ this.S_num +"\n"+ "이름 : "+super.toString();
	}
	
	Student(String str,String num){
		super(str);
		this.S_num = num;
	}
	public static void main(String[] args) {
		Student test = new Student("김근희","16011375");
		System.out.println(test);
	}

}
