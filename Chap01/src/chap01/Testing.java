package chap01;

public class Testing {

	public static void main(String[] args) {
		byte byteValue = 10;
//		float floatValue = 2.5F;
//		double doubleValue = 2.5;
		int score = 80;
		int value = 356;
		
		byte result = (byte)(byteValue + byteValue);
		System.out.println(result);
		
//		int i =132;
//		byte b =(byte)i;
//		System.out.println(b);
		
		String starVar1 = "abc";
		String starVar2 = new String("abc");
		
		System.out.println(starVar1 == starVar2);
		System.out.println(starVar1.equals(starVar2));
		
		char grade = (score>90)? 'A' : 'B';
		System.out.println(grade);
		value-=value%100;
		System.out.println(value);

		System.out.println(7|9);
		System.out.println(7&9);
		
		char init = 'j';
		System.out.println((int)init);
		//identifying if it's alphabet or not 
		System.out.println((init >= 'a' && init<= 'z') || (init>='A' && init <='Z'));
	

		
	}

}
