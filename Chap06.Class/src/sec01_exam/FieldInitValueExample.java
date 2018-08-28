package sec01_exam;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("기본형 변수");
		System.out.println("byteField: "+fiv.byteField);
		System.out.println("shortField: "+fiv.shortField);
		System.out.println("initField: "+fiv.intField);
		System.out.println("longField: "+fiv.longField);
		System.out.println("booleanField: "+fiv.booleanField);
		
		System.out.println("charField: "+fiv.charField);
		System.out.println("floatField: "+fiv.floatField);
		System.out.println("doubleField: "+fiv.doubleField);
		System.out.println();
		System.out.println("참조형 변수");
		System.out.println("arrField: "+fiv.arrField);
		System.out.println("referenceField: "+fiv.referenceField);
		
		/*인스턴스 변수를 출력을 하면, 인스턴스의 주소가 출력이 됨.
		 * object를 상속받기 때문에 출력문에 참조변수만 넣으면 곧 Object클래스의 toString()자동 호출됨.
		 * 하지만, 지금은 overriding한 toString()이 호출된다.
		 */
		System.out.println("Class referenceValiable : "+fiv.toString());
	}

}
