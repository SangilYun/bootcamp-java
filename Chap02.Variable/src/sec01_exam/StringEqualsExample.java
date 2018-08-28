package sec01_exam;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "name";
		String strVar2 = "name";
		
		String strVar3 = new String("name");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		System.out.println();

		strVar1 += "abc";
		System.out.println(strVar1);
		System.out.println(strVar2);
		System.out.println(strVar1 == strVar2);


	}

}
