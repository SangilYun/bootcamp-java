package sec01_exam;

public class Variable_Pri_Ref {

	public static void main(String[] args) {
		
		int a;
		a = 10;
		
		
		
		String str= null;
		str = new String("java");
		System.out.println(str);
		
		System.out.println("value of a :" +a);
		System.out.println("welcome java");
			
		String str2 = null;
		System.out.println(str2);
		
//		Class Object = new Object;
//		Object = 123;
//		System.out.println(Object);
//				

		int b = 7;
		str = new String("");
		System.out.println(b+str+b);
		System.out.println(b+b+str);
		
	}

}
