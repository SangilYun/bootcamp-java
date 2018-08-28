package sec_verify01;

public class Person {
	private String P_name;

	@Override
	public String toString() {
		return this.P_name;	
	}
	
	Person(String name){
		this.P_name = name;
		System.out.print("학번을 입력하세요 : ");
	}
	
}
	
