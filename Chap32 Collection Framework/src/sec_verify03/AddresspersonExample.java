package sec_verify03;

public class AddresspersonExample {

	public static void main(String[] args) {
		AddressPerson ap = new AddressPerson();
		ap.insert(new Person("신은혁", 10, "010-3268-1022"));
		ap.insert(new Person("김연아", 25, "010-9985-4572"));
		ap.insert(new Person("김자바", 60, "010-1785-4477"));
		ap.insert(new Person("김기리", 58, "010-8507-5255"));
		ap.insert(new Person("김자바", 75, "010-2235-5678"));
		System.out.println("현재 고객리스트 입니다.");
		ap.print();
		
		ap.delete("손연재");
		ap.delete("신은혁");
	
		ap.print();
		Person newInfo = new Person("김자바", 39, "010-5587-8897");
		ap.update("김자바", newInfo);

		ap.print();

	}

}
