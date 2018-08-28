package sec_verify06;

public class CloneExample {

	public static void main(String[] args) {
		Student test = new Student("perpear", "안경잡이");
		
		System.out.println("Student인스턴스1 : "+test);
		Student cloned = test.getStudent();
		System.out.println("Student인스턴스2 : " + cloned);
		
	}

}
