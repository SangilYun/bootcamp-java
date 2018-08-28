package sec_verify03;

public class Person {
	private String name;
	private int age;
	private String cellPhone;
	
	public Person(String s1, int i, String s2) {
		this.name = s1;
		this.age = i;
		this.cellPhone = s2;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCellPhone() {
		return cellPhone;
	}

}
