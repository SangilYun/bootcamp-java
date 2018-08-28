package sec05.exam07_comparable;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	//Comparable<>이 갖고 있는 추상메서드를 재정의 해야만,
	//treeSet에 오름차순으로 정렬이 된다. 
	//아래의 값을 반대로 하면 내림차순이 된다. 
	
//	@Override
//	public int compareTo(Person o) {
//
//		if(this.age < o.age) {
//			return -1;
//		}
//		else if(this.age == o.age) {
//			return 0;
//		}
//		else
//			return 1;
//	}
	
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
}
