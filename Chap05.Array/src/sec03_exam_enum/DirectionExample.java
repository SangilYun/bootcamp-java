package sec03_exam_enum;

public class DirectionExample {

	public static void main(String[] args) {
		Direction d1=Direction.EAST;
		Direction d2=Direction.valueOf("WEST");
		//Enum클래스의 정적메서드인 valueof를 호출함. 그 인자값은 enum명. class, "열거형상수"임.
		Direction d3=Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);

		System.out.println("d1==d2 ? "+(d1==d2));
		System.out.println("d1==d3 ? "+(d1==d3));
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
		//System.out.println("d1.compareTo(d3) ? "+(d1.compareTo(d3)) );
		System.out.println("d1.compareTo(d3) ? "+(d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? "+(d1.compareTo(d2)));
		
		switch(d1) {
		case EAST:
			System.out.println("The direction is EAST.");
			break;
		case SOUTH:
			System.out.println("The direction is SOUTH");
			break;
		case NORTH:
			System.out.println("The direction is NORTH");
			break;
		case WEST:
			System.out.println("The direction is WEST");
			break;
		default:
			System.out.println("Invalid direction.");
			break;
		}
		//열거형타입.value()리턴값이 열겨형 객체 배열이다.
		Direction[] dArr = Direction.values();
		//향상된 for문
		for(Direction d : dArr)// for(Direction d : Direction.values()
			System.out.printf("%s = %d%n", d.name(), d.ordinal());
	}

}
