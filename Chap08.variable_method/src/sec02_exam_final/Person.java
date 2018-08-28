package sec02_exam_final;

public class Person {
	
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		//this는객체 자기 자신의 주소 
		this.ssn = ssn;
		this.name = name;
	}
	//Person p = new Person(); 여기서 ()는 constructor 호출


	
	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "계백");
	
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";				//컴파일 예외 이유 ? --> 상수를 바꿀려고 해서(final)
//		p1.ssn = "654321-7654321";		//컴파일 예외 이유 ?
		p1.name = "을지문덕";

	}

}
