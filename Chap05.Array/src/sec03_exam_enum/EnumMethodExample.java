package sec03_exam_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		//num() method
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() method
		int ordinal=today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() method(열거객체 순번비교)
		Week day1=Week.MONDAY;
		Week day2=Week.WEDNESDAY;
		int result1=day1.compareTo(day2);
		int result2=day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		//valueOf() method
		Week weekDay = Week.valueOf("SUNDAY");
		
		if(weekDay==Week.SATURDAY||weekDay==Week.SUNDAY) {
			System.out.println("주말, 주일이군요");
		}else {
			System.out.println("평일 이군요");
		}
		//values() method
		Week[] days=Week.values();
		for(int i=0;i<days.length;i++) {
			System.out.println(days[i]);
		}
		//향상된 for문
		for(Week day : days) {
			System.out.println(day.hashCode());
		}
		
	}

}
